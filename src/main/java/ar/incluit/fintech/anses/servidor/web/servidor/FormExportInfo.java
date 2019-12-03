package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "procedure",
    "interviewee",
    "image",
    "answer"
})
@XmlRootElement(name = "formExportInfo")
public class FormExportInfo {

    @XmlElement(required = true)
    protected ProcedureInfo procedure;
    @XmlElement(required = true)
    protected IntervieweeAdd interviewee;
    @XmlElement(required = true)
    protected List<ImageAdd> image;
    @XmlElement(required = true)
    protected List<AnswersAdd> answer;


    public ProcedureInfo getProcedure() {
        return procedure;
    }

    public void setProcedure(ProcedureInfo procedure) {
        this.procedure = procedure;
    }

    public IntervieweeAdd getInterviewee() {
        return interviewee;
    }

    public void setInterviewee(IntervieweeAdd interviewee) {
        this.interviewee = interviewee;
    }

    public List<ImageAdd> getImage() {
        return image;
    }

    public void setImage(List<ImageAdd> image) {
        this.image = image;
    }

    public List<AnswersAdd> getAnswer() {
        return answer;
    }

    public void setAnswer(List<AnswersAdd> answer) {
        this.answer = answer;
    }
}
