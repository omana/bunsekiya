package jp.co.omana.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;


@Component(instance = InstanceType.SESSION)
public class AdminDto implements Serializable {

    private static final long serialVersionUID = 1L;

    public String userName;

    public String passwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}