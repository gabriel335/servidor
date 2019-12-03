package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "qtyName" })
@XmlRootElement(name = "addQTyRequest")
public class AddQTyRequest {

    protected String qtyName;

    public String getQtyName() { return qtyName; }

    public void setQtyName(String qtyName) { this.qtyName = qtyName; }
}
