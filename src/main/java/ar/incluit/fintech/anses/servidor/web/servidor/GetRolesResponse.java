package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "roles"
})
@XmlRootElement(name = "getRolesResponse")
public class GetRolesResponse {

    protected List<RolInfo> roles;

    public List<RolInfo> getRoles() {
        if(roles == null){
            roles = new ArrayList<RolInfo>();
        }
        return roles;
    }
}
