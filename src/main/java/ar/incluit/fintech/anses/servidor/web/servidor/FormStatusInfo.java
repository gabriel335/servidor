package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "fstName"
})
@XmlRootElement(name = "formStatusInfo")
public class FormStatusInfo {

    protected Long id;
    protected String fstName;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getFstName() { return fstName; }

    public void setFstName(String fstName) { this.fstName = fstName; }
}
