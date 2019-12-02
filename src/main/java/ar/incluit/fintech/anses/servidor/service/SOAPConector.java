package ar.incluit.fintech.anses.servidor.service;

import com.entrevistas.wsdl.GetRolesRequest;
import com.entrevistas.wsdl.GetRolesResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SOAPConector extends WebServiceGatewaySupport {



    public GetRolesResponse getRoles() {
        GetRolesRequest request = new GetRolesRequest();

        GetRolesResponse response = (GetRolesResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:9090/ws/entrevistas.wsdl"));

        return response;
    }

}
