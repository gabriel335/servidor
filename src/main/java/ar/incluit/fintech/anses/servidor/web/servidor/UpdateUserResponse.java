package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceStatus"
})
@XmlRootElement(name = "updateUserResponse")
public class UpdateUserResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;

    public ServiceStatus getServiceStatus() { return serviceStatus; }

    public void setServiceStatus(ServiceStatus serviceStatus) { this.serviceStatus = serviceStatus; }
}
