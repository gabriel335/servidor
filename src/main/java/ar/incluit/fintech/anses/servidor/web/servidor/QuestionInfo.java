package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "queDescription",
    "queStatus",
    "questionType",
    "set",
    "user"
})
@XmlRootElement(name = "questionInfo")
public class QuestionInfo {

    protected Long id;
    protected String queDescription;
    protected Integer queStatus;
    protected QuestionTypeInfo questionType;
    protected SetQuestionInfo set;
    protected UserInfo user;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getQueDescription() { return queDescription; }

    public void setQueDescription(String queDescription) { this.queDescription = queDescription; }

    public Integer getQueStatus() { return queStatus; }

    public void setQueStatus(Integer queStatus) { this.queStatus = queStatus; }

    public QuestionTypeInfo getQuestionType() { return questionType; }

    public void setQuestionType(QuestionTypeInfo questionType) { this.questionType = questionType; }

    public SetQuestionInfo getSet() { return set; }

    public void setSet(SetQuestionInfo set) { this.set = set; }

    public UserInfo getUser() { return user; }

    public void setUser(UserInfo user) { this.user = user; }
}
