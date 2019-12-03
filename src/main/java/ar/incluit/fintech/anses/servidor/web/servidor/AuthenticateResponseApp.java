package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "forms",
})
@XmlRootElement(name = "authenticateRequestApp")
public class AuthenticateResponseApp {

    protected List<FormInfo> forms;


    public List<FormInfo> getForms() {
        if (forms == null) {
            forms = new ArrayList<FormInfo>();
        }
        return forms;
    }
}
