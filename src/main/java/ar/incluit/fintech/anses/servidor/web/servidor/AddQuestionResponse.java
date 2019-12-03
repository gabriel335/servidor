package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status"
})
@XmlRootElement(name = "addQuestionResponse")
public class AddQuestionResponse {

    protected ServiceStatus status;

    public ServiceStatus getStatus() { return status; }

    public void setStatus(ServiceStatus status) { this.status = status; }
}
