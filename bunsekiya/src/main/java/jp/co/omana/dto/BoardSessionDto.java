package jp.co.omana.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;



@Component(instance = InstanceType.SESSION)
public class BoardSessionDto implements Serializable {

    private static final long serialVersionUID = 1L;

    public String threadId;

    public String name;

    public String address;

    public String title;

    public String boardKind;

    public String boardText;



    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBoardKind() {
        return boardKind;
    }

    public void setBoardKind(String boardKind) {
        this.boardKind = boardKind;
    }

    public String getBoardText() {
        return boardText;
    }

    public void setBoardText(String boardText) {
        this.boardText = boardText;
    }




}