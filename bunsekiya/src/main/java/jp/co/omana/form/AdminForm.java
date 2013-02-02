package jp.co.omana.form;

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

}
