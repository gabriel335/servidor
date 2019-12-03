package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id"
})
@XmlRootElement(name = "getUserRequest")
public class GetUserRequest {

    @XmlElement(required = true)
    protected Long id;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }
}
