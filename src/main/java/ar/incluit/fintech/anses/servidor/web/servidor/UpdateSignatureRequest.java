package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "usiBase64text",
    "usiFilename"
})
@XmlRootElement(name = "updateSignatureRequest")
public class UpdateSignatureRequest {

    protected Long id;
    protected String usiBase64text;
    protected String usiFilename;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getUsiBase64text() { return usiBase64text; }

    public void setUsiBase64text(String usiBase64text) { this.usiBase64text = usiBase64text; }

    public String getUsiFilename() { return usiFilename; }

    public void setUsiFilename(String usiFilename) { this.usiFilename = usiFilename; }
}
