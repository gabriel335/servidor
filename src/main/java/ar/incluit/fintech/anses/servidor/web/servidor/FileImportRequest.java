package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "username",
    "password"
})
@XmlRootElement(name = "fileImportRequest")
public class FileImportRequest {

    @XmlElement(required = true, nillable = false)
    protected String username;
    @XmlElement(required = true, nillable = false)
    protected String password;


    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }
}
