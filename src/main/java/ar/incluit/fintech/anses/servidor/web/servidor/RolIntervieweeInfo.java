package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "roiName"
})
@XmlRootElement(name = "rolIntervieweeInfo")
public class RolIntervieweeInfo {

    protected Long id;
    protected String roiName;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getRoiName() { return roiName; }

    public void setRoiName(String roiName) { this.roiName = roiName; }
}
