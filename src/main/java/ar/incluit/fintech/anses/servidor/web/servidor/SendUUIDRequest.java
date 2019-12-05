package ar.incluit.fintech.anses.servidor.web.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "uuid","token","sign"
})
@XmlRootElement(name = "sendUUIDRequest")
public class SendUUIDRequest {

    protected String uuid;
    protected String token;
    protected String sign;


    public String getUuid() {
        return uuid;
    }



    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
