package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isiBase64Text",
})
@XmlRootElement(name = "intervieweeSignatureAdd")
public class IntervieweeSignatureAdd {

    @XmlElement(required = true)
    protected String isiBase64Text;


    public String getIsiBase64Text() { return isiBase64Text; }

    public void setIsiBase64Text(String isiBase64Text) { this.isiBase64Text = isiBase64Text; }
}
