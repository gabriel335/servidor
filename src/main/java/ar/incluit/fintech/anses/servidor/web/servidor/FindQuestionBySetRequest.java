package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "setId"
})
@XmlRootElement(name = "findQuestionBySetRequest")
public class FindQuestionBySetRequest {

    protected Long setId;


    public Long getSetId() { return setId; }

    public void setSetId(Long setId) { this.setId = setId; }
}
