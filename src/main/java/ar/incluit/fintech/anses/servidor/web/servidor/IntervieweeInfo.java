package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "intName",
    "intDoc",
    "docType"
})
@XmlRootElement(name = "intervieweeInfo")
public class IntervieweeInfo {

    protected Long id;
    protected String intName;
    protected String intDoc;
    protected DocTypeInfo docType;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getIntName() { return intName; }

    public void setIntName(String intName) { this.intName = intName; }

    public String getIntDoc() { return intDoc; }

    public void setIntDoc(String intDoc) { this.intDoc = intDoc; }

    public DocTypeInfo getDocType() { return docType; }

    public void setDocType(DocTypeInfo docType) { this.docType = docType; }
}
