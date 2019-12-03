package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "hdtRecord",
    "hdtSolName",
    "hdtSolDoc",
    "hdtCauName",
    "hdtCauDoc",
    "docTypeSol",
    "docTypeCau"
})
@XmlRootElement(name = "headerDdjjTcInfo")
public class HeaderDdjjTcInfo {

    protected Long id;
    protected String hdtRecord;
    protected String hdtSolName;
    protected String hdtSolDoc;
    protected String hdtCauName;
    protected String hdtCauDoc;
    protected DocTypeInfo docTypeSol;
    protected DocTypeInfo docTypeCau;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getHdtRecord() { return hdtRecord; }

    public void setHdtRecord(String hdtRecord) { this.hdtRecord = hdtRecord; }

    public String getHdtSolName() { return hdtSolName; }

    public void setHdtSolName(String hdtSolName) { this.hdtSolName = hdtSolName; }

    public String getHdtSolDoc() { return hdtSolDoc; }

    public void setHdtSolDoc(String hdtSolDoc) { this.hdtSolDoc = hdtSolDoc; }

    public String getHdtCauName() { return hdtCauName; }

    public void setHdtCauName(String hdtCauName) { this.hdtCauName = hdtCauName; }

    public String getHdtCauDoc() { return hdtCauDoc; }

    public void setHdtCauDoc(String hdtCauDoc) { this.hdtCauDoc = hdtCauDoc; }

    public DocTypeInfo getDocTypeSol() { return docTypeSol; }

    public void setDocTypeSol(DocTypeInfo docTypeSol) { this.docTypeSol = docTypeSol; }

    public DocTypeInfo getDocTypeCau() { return docTypeCau; }

    public void setDocTypeCau(DocTypeInfo docTypeCau) { this.docTypeCau = docTypeCau; }
}
