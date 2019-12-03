package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "IntervieweeName",
    "IntervieweeDoc",
    "forIntSignature",
    "forIntDocTypeId",
    "forIntDNIImageF",
    "forIntDNIImageR",

})
@XmlRootElement(name = "intervieweeAdd")
public class IntervieweeAdd {

    @XmlElement(required = true)
    protected String IntervieweeName;
    @XmlElement(required = true)
    protected String IntervieweeDoc;
    @XmlElement(required = true)
    protected String forIntSignature;
    @XmlElement(required = true)
    protected Long forIntDocTypeId;
    @XmlElement(required = true)
    protected String forIntDNIImageF;
    @XmlElement(required = true)
    protected String forIntDNIImageR;


    public String getIntervieweeName() {
        return IntervieweeName;
    }

    public void setIntervieweeName(String intervieweeName) {
        IntervieweeName = intervieweeName;
    }

    public String getIntervieweeDoc() {
        return IntervieweeDoc;
    }

    public void setIntervieweeDoc(String intervieweeDoc) {
        IntervieweeDoc = intervieweeDoc;
    }

    public String getForIntSignature() { return forIntSignature; }

    public void setForIntSignature(String forIntSignature) { this.forIntSignature = forIntSignature; }

    public Long getForIntDocTypeId() { return forIntDocTypeId; }

    public void setForIntDocTypeId(Long forIntDocTypeId) {
        this.forIntDocTypeId = forIntDocTypeId;
    }

    public String getForIntDNIImageF() {
        return forIntDNIImageF;
    }

    public void setForIntDNIImageF(String forIntDNIImageF) {
        this.forIntDNIImageF = forIntDNIImageF;
    }

    public String getForIntDNIImageR() {
        return forIntDNIImageR;
    }

    public void setForIntDNIImageR(String forIntDNIImageR) {
        this.forIntDNIImageR = forIntDNIImageR;
    }
}
