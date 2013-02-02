package jp.co.omana.form;

import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;


public class InqueryForm {

    @Required
    @Maxlength(maxlength = 100)
    public String nameMyoji = "";

//    @Required
//    public String nameNamae = "";

    @Required
    @Maxlength(maxlength = 100)
    public String kanaMyoji = "";

//    @Required
//    public String kanaNamae = "";

    @Required
    @Maxlength(maxlength = 300)
    public String cmpny= "";

    @Required
    @Maxlength(maxlength = 200)
    public String division= "";

    @Required
    @EmailType
    @Maxlength(maxlength = 300)
    public String address= "";

    @Required
    @Maxlength(maxlength = 20)
    public String inqueryKind= "";

    @Required
    @Maxlength(maxlength = 1000)
    public String inqueryText = "";




}
