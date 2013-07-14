package jp.co.omana.form;

import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;


public class AdminForm {


    @Required
    public String userId = "";

    @Required
    public String passwd= "";

    public String name = "";

    @Required
    public String text= "";

    @Required
    public String disp ="";

    @Required
    public String threadId ="";

    @Required
    public String resId = "";

    @Required
    public String recNum = "";

    @Required
    @IntegerType
    public String infoDateY = "";

    @Required
    @IntegerType
    public String infoDateM = "";

    @Required
    @EmailType
    public String infoDateD = "";
    
    @Required
    public String infoContent = "";
    
    
}
