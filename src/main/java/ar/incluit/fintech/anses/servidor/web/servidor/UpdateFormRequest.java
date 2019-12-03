package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "username",
    "password",
    "procedure",
    "interviewee",
    "image",
    "answer"
})
@XmlRootElement(name = "updateFormRequest")
public class UpdateFormRequest {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected ProcedureInfo procedure;
    @XmlElement(required = true)
    protected IntervieweeAdd interviewee;
    @XmlElement(required = true)
    protected List<AnswersAdd> answer;
    @XmlElement(required = true)
    protected List<ImageAdd> image;


    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    /*public List<FormExportInfo> getForm() {
        if (form == null) {
            form = new ArrayList<FormExportInfo>();
        }
        return form;
    }*/

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

    public List<AnswersAdd> getAnswer() {
        return answer;
    }

    public void setAnswer(List<AnswersAdd> answer) {
        this.answer = answer;
    }

    public List<ImageAdd> getImage() {
        return image;
    }

    public void setImage(List<ImageAdd> image) {
        this.image = image;
    }
}
