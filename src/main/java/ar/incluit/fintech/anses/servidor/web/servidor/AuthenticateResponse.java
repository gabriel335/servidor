package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "usuName",
    "usuPin",
    "usuDoc"
})
@XmlRootElement(name = "authenticateResponse")
public class AuthenticateResponse {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String usuName;
    @XmlElement(required = true)
    protected Integer usuPin;
    @XmlElement(required = true)
    protected String usuDoc;

    public String getToken() { return token; }

    public void setToken(String token) { this.token = token; }

    public String getUsuName() { return usuName; }

    public void setUsuName(String usuName) { this.usuName = usuName; }

    public Integer getUsuPin() { return usuPin; }

    public void setUsuPin(Integer usuPin) { this.usuPin = usuPin; }

    public String getUsuDoc() { return usuDoc; }

    public void setUsuDoc(String usuDoc) { this.usuDoc = usuDoc; }
}
