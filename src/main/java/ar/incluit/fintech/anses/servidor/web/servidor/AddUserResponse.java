package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceStatus"
})
@XmlRootElement(name = "addUserResponse")
public class AddUserResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;

    public ServiceStatus getServiceStatus() { return serviceStatus; }

    public void setServiceStatus(ServiceStatus serviceStatus) { this.serviceStatus = serviceStatus; }
}
