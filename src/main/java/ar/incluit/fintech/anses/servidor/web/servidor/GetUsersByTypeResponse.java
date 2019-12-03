package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "users"
})
@XmlRootElement(name = "getUsersByTypeResponse")
public class GetUsersByTypeResponse {

    protected List<UserInfo> users;

    public List<UserInfo> getUsers() {
        if(users == null){
            users = new ArrayList<UserInfo>();
        }
        return users;
    }
}
