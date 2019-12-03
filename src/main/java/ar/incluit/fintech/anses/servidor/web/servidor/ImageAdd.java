package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "forEvidenceImage",
    "forEvidenceType",
    "forEvidenceGeoPos"
})
@XmlRootElement(name = "imageAdd")
public class ImageAdd {

    @XmlElement(required = true)
    protected String forEvidenceImage;
    @XmlElement(required = true)
    protected String forEvidenceType;
    @XmlElement(required = true)
    protected String forEvidenceGeoPos;


    public String getForEvidenceImage() {
        return forEvidenceImage;
    }

    public void setForEvidenceImage(String forEvidenceImage) {
        this.forEvidenceImage = forEvidenceImage;
    }

    public String getForEvidenceType() {
        return forEvidenceType;
    }

    public void setForEvidenceType(String forEvidenceType) {
        this.forEvidenceType = forEvidenceType;
    }

    public String getForEvidenceGeoPos() {
        return forEvidenceGeoPos;
    }

    public void setForEvidenceGeoPos(String forEvidenceGeoPos) {
        this.forEvidenceGeoPos = forEvidenceGeoPos;
    }
}
