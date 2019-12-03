package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "rolName",
    "rolApp"
})
@XmlRootElement(name = "rol")
public class RolInfo {

    protected Long id;
    protected String rolName;
    protected boolean rolApp;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getRolName() { return rolName; }

    public void setRolName(String rolName) { this.rolName = rolName; }

    public boolean isRolApp() { return rolApp; }

    public void setRolApp(boolean rolApp) {
        this.rolApp = rolApp;
    }
}
