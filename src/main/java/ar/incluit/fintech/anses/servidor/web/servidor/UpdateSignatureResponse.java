package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "user"
})
@XmlRootElement(name = "updateSignatureResponse")
public class UpdateSignatureResponse {

    protected UserInfo user;


    public UserInfo getUser() { return user; }

    public void setUser(UserInfo user) { this.user = user; }
}
