package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "questions"
})
@XmlRootElement(name = "setInfo")
public class InterviewSetInfo {

    protected Long id;
    protected List<QuestionInfo> questions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<QuestionInfo> getQuestions() {
        if (questions == null) {
            questions = new ArrayList<QuestionInfo>();
        }
        return questions;
    }

}
