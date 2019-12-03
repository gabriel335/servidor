package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fcaName",
    "heaName",
    "roiName"
})
@XmlRootElement(name = "formCategoryInfo")
public class FormCategoryInfo {

    protected String fcaName;
    protected String heaName;
    protected String roiName;


    public FormCategoryInfo() {
        this.fcaName = "null";
    }


    public String getFcaName() { return fcaName; }

    public void setFcaName(String fcaName) { this.fcaName = fcaName; }

    public String getHeaName() { return heaName; }

    public void setHeaName(String heaName) { this.heaName = heaName; }

    public String getRoiName() { return roiName; }

    public void setRoiName(String roiName) { this.roiName = roiName; }
}
