package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "user"
})
@XmlRootElement(name = "updateUserRequest")
public class UpdateUserRequest {

    protected UserUpdate user;


    public UserUpdate getUser() { return user; }

    public void setUser(UserUpdate user) { this.user = user; }
}
