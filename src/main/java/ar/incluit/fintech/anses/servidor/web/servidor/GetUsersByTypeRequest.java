package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "type",
    "search"
})
@XmlRootElement(name = "getUsersByTypeRequest")
public class GetUsersByTypeRequest {

    protected String type;
    protected String search;


    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getSearch() { return search; }

    public void setSearch(String search) { this.search = search; }
}
