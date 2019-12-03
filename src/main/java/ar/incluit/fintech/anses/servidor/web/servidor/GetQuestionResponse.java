package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "question"
})
@XmlRootElement(name = "getQuestionResponse")
public class GetQuestionResponse {

    protected QuestionInfo question;

    public QuestionInfo getQuestion() { return question; }

    public void setQuestion(QuestionInfo question) { this.question = question; }
}
