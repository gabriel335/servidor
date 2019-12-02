package ar.incluit.fintech.anses.servidor.config;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.server.endpoint.MethodEndpoint;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

public class CustomEndpointInterceptor implements EndpointInterceptor {


    @Override
    public boolean handleRequest(MessageContext messageContext, Object o) throws Exception {
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext, Object o) throws Exception {

        if (o instanceof MethodEndpoint) {
            MethodEndpoint methodEndpoint = (MethodEndpoint) o;

            ((SaajSoapMessage) messageContext.getResponse()).getSaajMessage().getMimeHeaders().setHeader("SOAPAction", methodEndpoint.getMethod().getName());

            ((SaajSoapMessage) messageContext.getResponse()).getSaajMessage().getSOAPHeader()
                    .addChildElement("token", "token", "http://director.anses.gov.ar").addTextNode("aqui va el token");

            ((SaajSoapMessage) messageContext.getResponse()).getSaajMessage().getSOAPHeader()
                    .addChildElement("sign", "sign", "http://director.anses.gov.ar").addTextNode("aqui va el sign");
        }

        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext, Object o) throws Exception {
        return false;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Object o, Exception e) throws Exception {

    }

}
