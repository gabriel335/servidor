package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "user"
})
@XmlRootElement(name = "getUserResponse")
public class GetUserResponse {

    @XmlElement(required = true)
    protected UserInfo user;

    public UserInfo getUser() { return user; }

    public void setUser(UserInfo user) { this.user = user; }
}
