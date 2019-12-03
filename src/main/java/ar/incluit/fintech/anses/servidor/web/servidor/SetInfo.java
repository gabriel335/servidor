package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "user"
})
@XmlRootElement(name = "setInfo")
public class SetInfo {

    protected Long id;
    protected UserInfo user;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public UserInfo getUser() { return user; }

    public void setUser(UserInfo user) { this.user = user; }

}
