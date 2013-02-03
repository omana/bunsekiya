package jp.co.omana.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import jp.co.omana.dto.BoardDto;
import jp.co.omana.dto.BoardSessionDto;
import jp.co.omana.entity.TblBb;
import jp.co.omana.entity.TblRes;
import jp.co.omana.form.BoardForm;
import jp.co.omana.service.TblBbService;
import jp.co.omana.service.TblResService;

import org.apache.struts.util.TokenProcessor;
import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.framework.util.IntegerConversionUtil;
import org.seasar.framework.util.StringConversionUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class BoardAction {

    @Resource
    TblBbService tblBbService = new TblBbService();

    @Resource
    TblResService tblResService = new TblResService();

    @Resource
    @ActionForm
    BoardForm boardForm = new BoardForm();

    @Resource
    public BoardDto boardDto = new BoardDto();

    @Resource
    public BoardSessionDto boardSessionDto = new BoardSessionDto();

    @Resource
    public HttpServletRequest request;

    public TblBb tblBb = new TblBb();

    public List<TblBb> dplyTblBbList = new ArrayList<TblBb>(); //掲示板スレッドの一覧表示用のList
    public List<TblRes> dplyTblResList = new ArrayList<TblRes>(); //掲示板のコメントの一覧表示用のList

    @Execute(validator = false)
    public String index() {
        dplyTblBbList = tblBbService.findAllowedOrderByDate();
        // System.out.println(dplyTblBbList.get(0).TTitle);

        dplyTblBbList = tblBbService.findAllowedOrderByDate();

        return "board.jsp";
    }

    @Execute(validator = false)
    public String register() {

        return "boardRegister.jsp";
    }


    @Execute(validator = false, urlPattern= "reply/{threadId}")
    public String reply() {
        if (boardForm.threadId.length() < 10){
            int threadId = IntegerConversionUtil.toPrimitiveInt(boardForm.threadId);
            dplyTblResList = tblResService.findAllByThreadIdOrderBythreadId(threadId);
            tblBb = tblBbService.findById(threadId);
            boardSessionDto.threadId = StringConversionUtil.toString(tblBb.threadId);
            return "board-01.jsp";
        }
        return index();

    }

    @Execute(validator = false, input="boardRegister.jsp")
    public String confirm() {
        boardDto.name = boardForm.name;
        boardDto.address = boardForm.address;
        boardDto.title = boardForm.title;
        boardDto.boardText = boardForm.boardText;
        //Tokenの生成
        TokenProcessor.getInstance().saveToken(request);
        return "boardRegisterComfirm.jsp";
    }



    @Execute(validator = true, input="board-01.jsp",urlPattern="replyConfirm/{threadId}")
    public String replyConfirm() {
        if (boardForm.threadId.length() < 10){
            int threadId = IntegerConversionUtil.toPrimitiveInt(boardForm.threadId);
            if (threadId != 0){
                boardDto.threadId = boardForm.threadId;
                boardDto.name = boardForm.name;
                boardDto.address = boardForm.address;
                boardDto.boardKind = "不要";
                tblBb = tblBbService.findById(threadId);
                boardDto.title = tblBb.TTitle;
                boardDto.boardKind = tblBb.TCat;
                boardDto.boardText = boardForm.boardText;
                //Tokenの生成
                TokenProcessor.getInstance().saveToken(request);
                return "boardRegisterComfirm-01.jsp";
            } else {
                return index();
            }
        } else {
            return index();
        }
    }



    @Execute(validator = true, input="boardRegister.jsp")
    public String send() {
        if (TokenProcessor.getInstance().isTokenValid(request, true)) {
            boardDto.name = boardForm.name;
            boardDto.address = boardForm.address;
            boardDto.title = boardForm.title;
            boardDto.boardText = boardForm.boardText;

            TblBb tblBb = new TblBb();
            TblRes tblRes = new TblRes();
            int maxThreadId = tblBbService.findMaxThreadId() + 1;
            Date date = new Date();
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String now = dateformat.format(date);

            tblBb.threadId = maxThreadId;
            tblBb.TCat = "不要";
            tblBb.TTitle = boardDto.title;
            tblBb.TDate = now;
            tblBb.TAdminFlg = 0;

            tblRes.threadId = maxThreadId;
            tblRes.resId = 1;
            tblRes.RDate = now;
            tblRes.RWriter = boardDto.name;
            tblRes.RAddress = boardDto.address;
            tblRes.RContext = boardDto.boardText;
            tblRes.RAllowFlg = 0;

            try {
                tblBbService.insert(tblBb);
                tblResService.insert(tblRes);
            } catch (NullPointerException nullex) {
                index();
            }
            return sended();
        }else {
            return index();
        }
    }


    @Execute(validator = true, input="boardRegisterComfirm-01.jsp")
    public String send01() {
        if (TokenProcessor.getInstance().isTokenValid(request, true)) {
            boardDto.name = boardForm.name;
            boardDto.address = boardForm.address;
            boardDto.title = boardForm.title;
            boardDto.boardText = boardForm.boardText;
            int id = IntegerConversionUtil.toInteger(boardForm.threadId);

            TblRes tblRes = new TblRes();
            int maxResId = tblResService.findMaxResId(id) + 1;
            Date date = new Date();
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String now = dateformat.format(date);

            tblRes.threadId = id;
            tblRes.resId = maxResId;
            tblRes.RDate = now;
            tblRes.RWriter = boardDto.name;
            tblRes.RAddress = boardDto.address;
            tblRes.RContext = boardDto.boardText;
            tblRes.RAllowFlg = 0;

            try {
                tblResService.insert(tblRes);
            } catch (NullPointerException nullex) {
                index();
            }

            return sended();
        }else {
            return index();
        }
    }


    @RemoveSession(name = "boardDto")
    @Execute(validator = false)
    public String sended(){
        TokenProcessor.getInstance().resetToken(request);
        return "boardSend.jsp";
    }


}
