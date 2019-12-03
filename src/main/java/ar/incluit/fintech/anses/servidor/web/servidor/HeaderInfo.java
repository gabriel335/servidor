package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "heaName"
})
@XmlRootElement(name = "headerInfo")
public class HeaderInfo {

    protected Long id;
    protected String heaName;


    public HeaderInfo() {
        this.heaName = "null";
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getHeaName() { return heaName; }

    public void setHeaName(String heaName) { this.heaName = heaName; }
}
