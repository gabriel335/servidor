package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "questions"
})
@XmlRootElement(name = "changeStatusRequest")
public class ChangeStatusRequest {

    @XmlElement(required = true)
    protected List<ChangeStatusInfo> questions;

    public List<ChangeStatusInfo> getQuestions() { return questions; }

    public void setQuestions(List<ChangeStatusInfo> questions) { this.questions = questions; }
}
