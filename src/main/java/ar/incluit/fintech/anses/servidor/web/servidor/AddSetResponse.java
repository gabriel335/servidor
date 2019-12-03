package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "set"
})
@XmlRootElement(name = "addSetResponse")
public class AddSetResponse {

    protected ServiceStatus status;
    protected SetInfo set;


    public ServiceStatus getStatus() { return status; }

    public void setStatus(ServiceStatus status) { this.status = status; }

    public SetInfo getSet() { return set; }

    public void setSet(SetInfo set) { this.set = set; }
}
