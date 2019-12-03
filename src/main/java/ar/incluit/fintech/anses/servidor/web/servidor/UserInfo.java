package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "usuName",
    "usuUsername",
    "usuPin",
    "usuDoc",
    "usuEmail",
    "usuStatus",
    "usuNotifEmail",
    "rol",
    "signature"
})
@XmlRootElement(name = "userInfo")
public class UserInfo {

    protected Long id;
    protected String usuName;
    protected String usuUsername;
    protected Integer usuPin;
    protected String usuDoc;
    protected String usuEmail;
    protected Integer usuStatus;
    protected String usuNotifEmail;
    protected RolInfo rol;
    protected UserSignatureInfo signature;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getUsuName() { return usuName; }

    public void setUsuName(String usuName) { this.usuName = usuName; }

    public String getUsuUsername() {
        return usuUsername;
    }

    public void setUsuUsername(String usuUsername) {
        this.usuUsername = usuUsername;
    }

    public Integer getUsuPin() { return usuPin; }

    public void setUsuPin(Integer usuPin) { this.usuPin = usuPin; }

    public String getUsuDoc() { return usuDoc; }

    public void setUsuDoc(String usuDoc) { this.usuDoc = usuDoc; }

    public String getUsuEmail() { return usuEmail; }

    public void setUsuEmail(String usuEmail) { this.usuEmail = usuEmail; }

    public Integer getUsuStatus() { return usuStatus; }

    public void setUsuStatus(Integer usuStatus) { this.usuStatus = usuStatus; }

    public String getUsuNotifEmail() { return usuNotifEmail; }

    public void setUsuNotifEmail(String usuNotifEmail) { this.usuNotifEmail = usuNotifEmail; }

    public RolInfo getRol() { return rol; }

    public void setRol(RolInfo rol) { this.rol = rol; }

    public UserSignatureInfo getSignature() { return signature; }

    public void setSignature(UserSignatureInfo signature) { this.signature = signature; }

}
