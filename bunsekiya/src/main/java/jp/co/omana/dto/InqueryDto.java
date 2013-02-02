package jp.co.omana.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;


@Component(instance = InstanceType.SESSION)
public class InqueryDto implements Serializable {

    private static final long serialVersionUID = 1L;

    public String nameMyoji;

//    public String nameNamae;

    public String kanaMyoji;

//    public String kanaNamae;

    public String cmpny;

    public String division;

    public String address;

    public String inqueryKind;

    public String inqueryText;

    public String inqueryDeny;

    public String getNameMyoji() {
        return nameMyoji;
    }

    public void setNameMyoji(String nameMyoji) {
        this.nameMyoji = nameMyoji;
    }

    public String getKanaMyoji() {
        return kanaMyoji;
    }

    public void setKanaMyoji(String kanaMyoji) {
        this.kanaMyoji = kanaMyoji;
    }

    public String getCmpny() {
        return cmpny;
    }

    public void setCmpny(String cmpny) {
        this.cmpny = cmpny;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInqueryKind() {
        return inqueryKind;
    }

    public void setInqueryKind(String inqueryKind) {
        this.inqueryKind = inqueryKind;
    }

    public String getInqueryText() {
        return inqueryText;
    }

    public void setInqueryText(String inqueryText) {
        this.inqueryText = inqueryText;
    }

    public String getInqueryDeny() {
        return inqueryDeny;
    }

    public void setInqueryDeny(String inqueryDeny) {
        this.inqueryDeny = inqueryDeny;
    }



}