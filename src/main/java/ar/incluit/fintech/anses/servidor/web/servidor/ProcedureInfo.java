package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "forId",
    "proActionNumber",
    "proStatus",
    "proUserSignature",
    "forAdditionalNotes",
    "proDate",
    "IntervieweeAddress",
    "IntervieweeAddressNum",
    "IntervieweeAddressFlo",
    "IntervieweeAddressDep",
    "IntervieweeAddressNei",
    "IntervieweeAddressCit",
    "IntervieweeAddressPro",
    "IntervieweeAddressZco",

})
@XmlRootElement(name = "procedureInfo")
public class ProcedureInfo {

    protected Long forId;
    protected String proActionNumber;
    protected String proStatus;
    protected String proUserSignature;
    protected String forAdditionalNotes;
    protected String proDate;
    protected String IntervieweeAddress;
    protected String IntervieweeAddressNum;
    protected String IntervieweeAddressFlo;
    protected String IntervieweeAddressDep;
    protected String IntervieweeAddressNei;
    protected String IntervieweeAddressCit;
    protected String IntervieweeAddressPro;
    protected String IntervieweeAddressZco;


    public Long getForId() {
        return forId;
    }

    public void setForId(Long forId) {
        this.forId = forId;
    }

    public String getProActionNumber() {
        return proActionNumber;
    }

    public void setProActionNumber(String proActionNumber) {
        this.proActionNumber = proActionNumber;
    }

    public String getProStatus() { return proStatus; }

    public void setProStatus(String proStatus) { this.proStatus = proStatus; }

    public String getProUserSignature() {
        return proUserSignature;
    }

    public void setProUserSignature(String proUserSignature) {
        this.proUserSignature = proUserSignature;
    }

    public String getForAdditionalNotes() {
        return forAdditionalNotes;
    }

    public void setForAdditionalNotes(String forAdditionalNotes) {
        this.forAdditionalNotes = forAdditionalNotes;
    }

    public String getProDate() { return proDate; }

    public void setProDate(String proDate) { this.proDate = proDate; }

    public String getIntervieweeAddress() {
        return IntervieweeAddress;
    }

    public void setIntervieweeAddress(String intervieweeAddress) {
        IntervieweeAddress = intervieweeAddress;
    }

    public String getIntervieweeAddressNum() {
        return IntervieweeAddressNum;
    }

    public void setIntervieweeAddressNum(String intervieweeAddressNum) { IntervieweeAddressNum = intervieweeAddressNum; }

    public String getIntervieweeAddressFlo() {
        return IntervieweeAddressFlo;
    }

    public void setIntervieweeAddressFlo(String intervieweeAddressFlo) { IntervieweeAddressFlo = intervieweeAddressFlo; }

    public String getIntervieweeAddressDep() {
        return IntervieweeAddressDep;
    }

    public void setIntervieweeAddressDep(String intervieweeAddressDep) { IntervieweeAddressDep = intervieweeAddressDep; }

    public String getIntervieweeAddressNei() {
        return IntervieweeAddressNei;
    }

    public void setIntervieweeAddressNei(String intervieweeAddressNei) { IntervieweeAddressNei = intervieweeAddressNei; }

    public String getIntervieweeAddressCit() {
        return IntervieweeAddressCit;
    }

    public void setIntervieweeAddressCit(String intervieweeAddressCit) { IntervieweeAddressCit = intervieweeAddressCit; }

    public String getIntervieweeAddressPro() {
        return IntervieweeAddressPro;
    }

    public void setIntervieweeAddressPro(String intervieweeAddressPro) { IntervieweeAddressPro = intervieweeAddressPro; }

    public String getIntervieweeAddressZco() {
        return IntervieweeAddressZco;
    }

    public void setIntervieweeAddressZco(String intervieweeAddressZco) { IntervieweeAddressZco = intervieweeAddressZco; }
}
