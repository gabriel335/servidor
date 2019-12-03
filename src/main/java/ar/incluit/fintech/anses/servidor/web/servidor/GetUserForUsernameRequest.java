package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "username"
})
@XmlRootElement(name = "getUserForUsernameRequest")
public class GetUserForUsernameRequest {

    protected String username;


    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }
}
