package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "qtyName"
})
@XmlRootElement(name = "questionTypeInfo")
public class QuestionTypeInfo {

    protected  Long id;
    protected  String qtyName;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getQtyName() { return qtyName; }

    public void setQtyName(String qtyName) { this.qtyName = qtyName; }
}
