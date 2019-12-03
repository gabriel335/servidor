package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "question"
})
@XmlRootElement(name = "questionArray")
public class QuestionArray {

    @XmlElement(nillable = true)
    protected List<QuestionInfo> question;


    public List<QuestionInfo> getQuestion() {
        if (question == null) {
            question = new ArrayList<QuestionInfo>();
        }
        return question;
    }
}
