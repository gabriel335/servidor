package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "questionId",
    "questionAnswer",
    "questionObs"
})
@XmlRootElement(name = "answersAdd")
public class AnswersAdd {

    @XmlElement(required = true)
    protected Long questionId;
    @XmlElement(required = true)
    protected String questionAnswer;
    @XmlElement(required = true)
    protected String questionObs;


    public Long getQuestionId() { return questionId; }

    public void setQuestionId(Long questionId) { this.questionId = questionId; }

    public String getQuestionAnswer() { return questionAnswer; }

    public void setQuestionAnswer(String questionAnswer) { this.questionAnswer = questionAnswer; }

    public String getQuestionObs() {
        return questionObs;
    }

    public void setQuestionObs(String questionObs) {
        this.questionObs = questionObs;
    }
}
