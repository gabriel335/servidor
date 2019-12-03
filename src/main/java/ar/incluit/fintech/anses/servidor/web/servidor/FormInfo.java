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
    "forAditionalNotes",
    "forBackStatus",
    "forAction",
    "formCategory",
    "formStatus",
    "intervieweeDes",
    "procedure",
    "headerDdjj",
    "headerDdjjTc",
    "sets"
})
@XmlRootElement(name = "formInfo")
public class FormInfo {

    protected Long id;
    protected String forAditionalNotes;
    protected Integer forBackStatus;
    protected String forAction;
    protected FormCategoryInfo formCategory;
    protected FormStatusInfo formStatus;
    protected IntervieweeInfo intervieweeDes;
    protected ProcedureInfo procedure;
    protected HeaderDdjjInfo headerDdjj;
    protected HeaderDdjjTcInfo headerDdjjTc;
    protected List<InterviewSetInfo> sets;

    public FormInfo() {
        this.forAditionalNotes = "null";
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getForAditionalNotes() { return forAditionalNotes; }

    public void setForAditionalNotes(String forAditionalNotes) { this.forAditionalNotes = forAditionalNotes; }

    public Integer getForBackStatus() { return forBackStatus; }

    public void setForBackStatus(Integer forBackStatus) { this.forBackStatus = forBackStatus; }

    public String getForAction() { return forAction; }

    public void setForAction(String forAction) { this.forAction = forAction; }

    public FormCategoryInfo getFormCategory() { return formCategory; }

    public void setFormCategory(FormCategoryInfo formCategory) { this.formCategory = formCategory; }

    public FormStatusInfo getFormStatus() { return formStatus; }

    public void setFormStatus(FormStatusInfo formStatus) { this.formStatus = formStatus; }

    public IntervieweeInfo getIntervieweeDes() { return intervieweeDes; }

    public void setIntervieweeDes(IntervieweeInfo intervieweeDes) { this.intervieweeDes = intervieweeDes; }

    public ProcedureInfo getProcedure() { return procedure; }

    public void setProcedure(ProcedureInfo procedure) { this.procedure = procedure; }

    public HeaderDdjjInfo getHeaderDdjj() { return headerDdjj; }

    public void setHeaderDdjj(HeaderDdjjInfo headerDdjj) { this.headerDdjj = headerDdjj; }

    public HeaderDdjjTcInfo getHeaderDdjjTc() { return headerDdjjTc; }

    public void setHeaderDdjjTc(HeaderDdjjTcInfo headerDdjjTc) { this.headerDdjjTc = headerDdjjTc; }

    public List<InterviewSetInfo> getSets() {
        if (sets == null) {
            sets = new ArrayList<InterviewSetInfo>();
        }
        return sets;
    }

}
