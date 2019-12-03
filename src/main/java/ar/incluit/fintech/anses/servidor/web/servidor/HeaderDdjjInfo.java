package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "hdjRecord",
    "hdjIntRol",
    "hdjSolName",
    "hdjSolDoc",
    "docType"
})
@XmlRootElement(name = "headerDdjjInfo")
public class HeaderDdjjInfo {

    protected Long id;
    protected String hdjRecord;
    protected String hdjIntRol;
    protected String hdjSolName;
    protected String hdjSolDoc;
    protected DocTypeInfo docType;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getHdjRecord() { return hdjRecord; }

    public void setHdjRecord(String hdjRecord) { this.hdjRecord = hdjRecord; }

    public String getHdjIntRol() { return hdjIntRol; }

    public void setHdjIntRol(String hdjIntRol) { this.hdjIntRol = hdjIntRol; }

    public String getHdjSolName() { return hdjSolName; }

    public void setHdjSolName(String hdjSolName) { this.hdjSolName = hdjSolName; }

    public String getHdjSolDoc() { return hdjSolDoc; }

    public void setHdjSolDoc(String hdjSolDoc) { this.hdjSolDoc = hdjSolDoc; }

    public DocTypeInfo getDocType() { return docType; }

    public void setDocType(DocTypeInfo docType) { this.docType = docType; }
}
