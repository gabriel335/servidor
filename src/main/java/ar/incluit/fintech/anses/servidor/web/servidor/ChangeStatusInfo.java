package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "status"
})
@XmlRootElement(name = "changeStatusInfo")
public class ChangeStatusInfo {

    protected Long id;
    protected Integer status;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Integer getStatus() { return status; }

    public void setStatus(Integer status) { this.status = status; }
}
