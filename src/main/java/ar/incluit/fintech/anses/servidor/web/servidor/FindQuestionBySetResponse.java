package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "questions"
})
@XmlRootElement(name = "findQuestionBySetResponse")
public class FindQuestionBySetResponse {

    protected List<QuestionInfo> questions;


    public List<QuestionInfo> getQuestions() {
        if (questions == null) {
            questions = new ArrayList<QuestionInfo>();
        }
        return questions;
    }

    public void setQuestions(List<QuestionInfo> questions) {
        this.questions = questions;
    }
}
