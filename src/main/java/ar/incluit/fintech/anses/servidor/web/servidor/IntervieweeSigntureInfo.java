package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "isiBase64text",
    "isiFilename"
})
@XmlRootElement(name = "intervieweeSigntureInfo")
public class IntervieweeSigntureInfo {

    protected Long id;
    protected String isiBase64text;
    protected String isiFilename;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getIsiBase64text() { return isiBase64text; }

    public void setIsiBase64text(String isiBase64text) { this.isiBase64text = isiBase64text; }

    public String getIsiFilename() { return isiFilename; }

    public void setIsiFilename(String isiFilename) { this.isiFilename = isiFilename; }
}
