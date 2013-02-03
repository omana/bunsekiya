package jp.co.omana.form;

import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;


public class BoardForm {

    @Maxlength(maxlength = 10)
    public String threadId = "";

    @Required
    @Maxlength(maxlength = 100)
    public String name = "";


    @Maxlength(maxlength = 200)
    @EmailType
    public String address= "";



    @Required
    @Maxlength(maxlength = 400)
    public String boardText = "";


    @Required
    @Maxlength(maxlength = 150)
    public String title = "";


}
