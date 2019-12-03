package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sets",
})
@XmlRootElement(name = "getAllSetResponse")
public class GetAllSetResponse {

    protected List<SetInfo> sets;

    public List<SetInfo> getSets() {
        if (sets == null) {
            sets = new ArrayList<SetInfo>();
        }
        return sets;
    }
}
