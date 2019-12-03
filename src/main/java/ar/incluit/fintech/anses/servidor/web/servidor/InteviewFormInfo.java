package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "forCaption",
    "forName",
    "forAditionalNotes",
    "forAction",
    "formCategory",
    "formStatus",
    "intervieweeInt",
    "intervieweeDes",
    "intervieweeSignature",
    "set"
})
@XmlRootElement(name = "inteviewFormInfo")
public class InteviewFormInfo {

    protected Long id;
    protected String forCaption;
    protected String forName;
    protected String forAditionalNotes;
    protected String forAction;
    protected FormCategoryInfo formCategory;
    protected FormStatusInfo formStatus;
    protected IntervieweeInfo intervieweeInt;
    protected IntervieweeInfo intervieweeDes;
    protected IntervieweeSigntureInfo intervieweeSignature;
    protected SetInfo set;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForCaption() {
        return forCaption;
    }

    public void setForCaption(String forCaption) {
        this.forCaption = forCaption;
    }

    public String getForName() {
        return forName;
    }

    public void setForName(String forName) {
        this.forName = forName;
    }

    public String getForAditionalNotes() {
        return forAditionalNotes;
    }

    public void setForAditionalNotes(String forAditionalNotes) {
        this.forAditionalNotes = forAditionalNotes;
    }

    public String getForAction() {
        return forAction;
    }

    public void setForAction(String forAction) {
        this.forAction = forAction;
    }

    public FormCategoryInfo getFormCategory() {
        return formCategory;
    }

    public void setFormCategory(FormCategoryInfo formCategory) {
        this.formCategory = formCategory;
    }

    public FormStatusInfo getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(FormStatusInfo formStatus) {
        this.formStatus = formStatus;
    }

    public IntervieweeInfo getIntervieweeInt() {
        return intervieweeInt;
    }

    public void setIntervieweeInt(IntervieweeInfo intervieweeInt) {
        this.intervieweeInt = intervieweeInt;
    }

    public IntervieweeInfo getIntervieweeDes() {
        return intervieweeDes;
    }

    public void setIntervieweeDes(IntervieweeInfo intervieweeDes) {
        this.intervieweeDes = intervieweeDes;
    }

    public IntervieweeSigntureInfo getIntervieweeSignature() {
        return intervieweeSignature;
    }

    public void setIntervieweeSignature(IntervieweeSigntureInfo intervieweeSignature) {
        this.intervieweeSignature = intervieweeSignature;
    }

    public SetInfo getSet() {
        return set;
    }

    public void setSet(SetInfo set) {
        this.set = set;
    }
}
