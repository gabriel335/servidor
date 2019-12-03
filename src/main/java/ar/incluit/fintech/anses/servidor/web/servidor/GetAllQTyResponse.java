package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "questionType",
})
@XmlRootElement(name = "getAllQTyResponse")
public class GetAllQTyResponse {

    protected List<QuestionTypeInfo> questionType;

    public List<QuestionTypeInfo> getQuestionType() {
        if (questionType == null) {
            questionType = new ArrayList<QuestionTypeInfo>();
        }
        return questionType;
    }
}
