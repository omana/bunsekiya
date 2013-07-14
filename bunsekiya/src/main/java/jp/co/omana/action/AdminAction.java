/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.co.omana.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import jp.co.omana.dto.AdminDto;
import jp.co.omana.entity.Inquery;
import jp.co.omana.entity.Rec;
import jp.co.omana.entity.TblBb;
import jp.co.omana.entity.TblRes;
import jp.co.omana.entity.UpdateInfo;
import jp.co.omana.form.AdminForm;
import jp.co.omana.service.InqueryService;
import jp.co.omana.service.RecService;
import jp.co.omana.service.TblBbService;
import jp.co.omana.service.TblResService;
import jp.co.omana.service.UpdateInfoService;

import org.seasar.framework.util.ByteConversionUtil;
import org.seasar.framework.util.IntegerConversionUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;



public class AdminAction {

    @Resource
    @ActionForm
    AdminForm adminForm = new AdminForm();
    @Resource
    TblResService tblResService = new TblResService();
    @Resource
    TblBbService tblBbService = new TblBbService();
    @Resource
    InqueryService inqueryService = new InqueryService();
    @Resource
    RecService recService = new RecService();
    @Resource
    AdminDto adminDto = new AdminDto();
    @Resource
    UpdateInfoService updateInfoService =new UpdateInfoService();
    
    @Resource
    public HttpServletRequest request;
    
    
    
    public List<TblRes> tblResList = new ArrayList<TblRes>();

    public List<Inquery> inqueryList = new ArrayList<Inquery>();


    private int threadId = 0;
    private int resId = 0;

    private String rWriter ="";

    public Rec rec = new Rec();
    public Rec recInsert = new Rec();

    private String id = "SUUMOBunsekiya2012";
    private String password = "bunsekiyaYoshinaga";

    /**
     * ログインフォームの表示
     * @return
     */
    @Execute(validator = false)
    public String index() {

        return "admin_login.jsp";
    }

    /**
     *ログイン処理
     * @return
     */
    @Execute(validator = false)
    public String login() {
        String userName = adminForm.userId;
        String passwd = adminForm.passwd;

        if(userName.equals(id)&&passwd.equals(password)){
            adminDto.userName =userName;
            adminDto.passwd = passwd;
            return top();
        } else {
            return "admin_login.jsp";
        }
    }

    /**
     * 管理者機能の表示
     * @return
     */
    @Execute(validator = false)
    public String top() {
        if (adminDto.userName.equals(id)){
            tblResList = tblResService.findAllByNotAllowed();
            inqueryList = inqueryService.findAll();

            Date date = new Date();
            SimpleDateFormat dateformat = new SimpleDateFormat("MM");
            String month = dateformat.format(date);

            int monthNum = IntegerConversionUtil.toPrimitiveInt(month);

            rec = recService.findById(monthNum);

            if(rec == null){
                rec = new Rec();
                rec.recTime = 0;
            }

            return "admin_top.jsp";
        }
        return "admin_login.jsp";
    }

    /**
     *かわら版の表示制御
     * @return
     */
    @Execute(validator = false)
    public String dispBoard() {
        if (adminDto.userName.equals(id)){
            TblBb tblBb = new TblBb();
            TblRes tblRes = new TblRes();

            byte allowed = ByteConversionUtil.toByte(adminForm.disp);
            threadId = IntegerConversionUtil.toInteger(adminForm.threadId);
            resId = IntegerConversionUtil.toInteger(adminForm.resId);


            tblBb = tblBbService.findById(threadId);
            tblRes = tblResService.findById(threadId, resId);

            tblBb.TAdminFlg = allowed;
            tblBbService.update(tblBb);

            tblRes.RAllowFlg = allowed;
            tblResService.update(tblRes);


            return top();
        }
        return "admin_login.jsp";
    }

    
    /**
     *新着情報の入稿の表示制御
     * @return
     */
    @Execute(validator = false)
    public String newInfo() {
    	if (adminDto.userName.equals(id)){
    		UpdateInfo updateInfo = new UpdateInfo();

    		if (!adminForm.infoContent.equals("")){
    			updateInfo.infoContext = adminForm.infoContent;
    			updateInfo.yyyymmdd = adminForm.infoDateY+"/"
    					+ adminForm.infoDateM+"/"
    					+ adminForm.infoDateD;

    			updateInfoService.insert(updateInfo);
    		}
    		return top();
    	}
    	return "admin_login.jsp";
    }

    

    /**
     * からわ版の返信
     * @return
     */
    @Execute(validator = false,urlPattern ="reply/{threadId}/{resId}")
    public String reply(){
        if (adminDto.userName.equals(id)){
            //        //Tokenの生成
            //        TokenProcessor.getInstance().saveToken(request);
            //
            //        if (TokenProcessor.getInstance().isTokenValid(request, true)) {
            TblRes tblRes = new TblRes();

            threadId = IntegerConversionUtil.toPrimitiveInt(adminForm.threadId);
            resId = IntegerConversionUtil.toPrimitiveInt(adminForm.resId);
            rWriter = adminForm.name;

            String relpy = adminForm.text;

            Date date = new Date();
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String now = dateformat.format(date);

            int maxResId = tblResService.findMaxResId(threadId);

            tblRes.threadId = threadId;
            tblRes.resId = maxResId + 1;
            tblRes.RAddress = "管理人アドレス";
            tblRes.RAllowFlg = 1;
            tblRes.RDate = now;
            tblRes.RWriter = rWriter;
            tblRes.RContext = relpy;

            tblResService.insert(tblRes);

            return top();
        }
        return "admin_login.jsp";
    }

    /**
     * 請負数の変更
     * @return
     */
    @Execute(validator = false)
    public String recUpdate(){
        if (adminDto.userName.equals(id)){
            Date date = new Date();
            SimpleDateFormat dateformat = new SimpleDateFormat("MM");
            String month = dateformat.format(date);

            int monthNum = IntegerConversionUtil.toPrimitiveInt(month);
            int rec_time = 0;
            try {
                rec_time = IntegerConversionUtil.toInteger(adminForm.recNum);
            } catch (NullPointerException e) {
                rec_time = 0;
            }

            System.out.println("--------------------------------------------------------"+monthNum);

            Rec rec = new Rec();
            Rec recInsert = new Rec();
            rec = recService.findById(monthNum);

            if(rec == null){
                recInsert.recId = monthNum;
                recInsert.recDate = month;
                recInsert.recTime = rec_time;
                recService.insert(recInsert);
            } else if (rec.recId == monthNum) {
                rec.recDate = month;
                rec.recTime = rec_time;
                recService.update(rec);
            }

            return top();
        }
        return "admin_login.jsp";
    }




}
