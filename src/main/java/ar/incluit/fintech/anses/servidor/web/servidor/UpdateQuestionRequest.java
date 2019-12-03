package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "question",
    "questionType",
    "setId",
    "username"
})
@XmlRootElement(name = "updateQuestionRequest")
public class UpdateQuestionRequest {

    protected Long id;
    protected String question;
    protected String questionType;
    protected Long setId;
    protected String username;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getQuestion() { return question; }

    public void setQuestion(String question) { this.question = question; }

    public String getQuestionType() { return questionType; }

    public void setQuestionType(String questionType) { this.questionType = questionType; }

    public Long getSetId() { return setId; }

    public void setSetId(Long setId) { this.setId = setId; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

}
