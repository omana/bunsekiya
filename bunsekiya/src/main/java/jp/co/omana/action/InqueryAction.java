package jp.co.omana.action;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import jp.co.omana.dto.InqueryDto;
import jp.co.omana.entity.Inquery;
import jp.co.omana.form.InqueryForm;
import jp.co.omana.service.InqueryService;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;


public class InqueryAction {

    @Resource
    public InqueryDto inqueryDto = new InqueryDto();

    @Resource
    InqueryService inqueryService = new InqueryService();

    @ActionForm
    @Resource
    protected InqueryForm inqueryForm = new InqueryForm();

    @Resource
    public HttpServletRequest request;

    @RemoveSession(name = "inqueryDto")
    @Execute(validator = false)
    public String index() {
        return "inquery.jsp";
    }

    @Execute(validator = false, input = "inquery.jsp")
    public String confirm() {

        inqueryDto.nameMyoji = inqueryForm.nameMyoji;
        //        inqueryDto.nameNamae = (inqueryForm.nameNamae);
        inqueryDto.kanaMyoji = inqueryForm.kanaMyoji;
        //        inqueryDto.kanaNamae = (inqueryForm.kanaNamae);
        inqueryDto.cmpny = inqueryForm.cmpny;
        inqueryDto.division = inqueryForm.division;
        inqueryDto.inqueryKind = inqueryForm.inqueryKind;
        inqueryDto.inqueryText = inqueryForm.inqueryText;
        inqueryDto.address = inqueryForm.address;

        inqueryDto.inqueryDeny = "1";

        return "inquery-comfirm.jsp";
    }


    @Execute(validator = true, input = "inquery.jsp")
    public String send() {
        try {
         if (inqueryDto.inqueryDeny.equals("1")){


            inqueryDto.nameMyoji = inqueryForm.nameMyoji;
            //            inqueryDto.nameNamae = (inqueryForm.nameNamae);
            inqueryDto.kanaMyoji = inqueryForm.kanaMyoji;
            //           inqueryDto.kanaNamae = (inqueryForm.kanaNamae);
            inqueryDto.cmpny = inqueryForm.cmpny;
            inqueryDto.division = inqueryForm.division;
            inqueryDto.address = inqueryForm.address;
            inqueryDto.inqueryKind = inqueryForm.inqueryKind;
            inqueryDto.inqueryText = inqueryForm.inqueryText;

            Inquery inquery = new Inquery();
            Date date = new Date();
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String now = dateformat.format(date);

            String nameKanji ="";

            String nameKana ="";


            nameKanji = new StringBuilder(inqueryDto.nameMyoji)
            //                .append(" ")
            //                .append(inqueryForm.nameNamae)
            .toString();

            nameKana = new StringBuilder(inqueryDto.kanaMyoji)
            //                .append(" ")
            //                .append(inqueryForm.kanaNamae)
            .toString();

            inquery.inqueryId = inqueryService.findMaxInqueryId() + 1;
            inquery.inqueryDate = now;
            inquery.nameKanji = nameKanji;
            inquery.nameKana  = nameKana;
            inquery.company   = inqueryForm.cmpny;
            inquery.division = inqueryForm.division;
            inquery.address   = inqueryForm.address;
            inquery.inqueryKind   = inqueryForm.inqueryKind;
            inquery.inqueryText  = inqueryForm.inqueryText;


            inqueryService.insert(inquery);

            return sended();
        }else {
            return index();
        }

     } catch (NullPointerException e) {
         return index();
     }

    }

    @RemoveSession(name = "inqueryDto")
    @Execute(validator = false)
    public String sended(){
        inqueryDto.inqueryDeny ="0";
       // TokenProcessor.getInstance().resetToken(request);
        return "inquerySended.jsp";
    }
}
