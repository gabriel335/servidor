package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "docName"
})
@XmlRootElement(name = "docTypeInfo")
public class DocTypeInfo {

    protected Long id;
    protected String docName;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getDocName() { return docName; }

    public void setDocName(String docName) { this.docName = docName; }
}
