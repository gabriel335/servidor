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
@XmlRootElement(name = "getAllQuestionResponse")
public class GetAllQuestionResponse {

    protected  List<QuestionInfo> questions;

    public List<QuestionInfo> getQuestions() {
        if(questions == null){
            questions = new ArrayList<QuestionInfo>();
        }
        return questions;
    }
}
