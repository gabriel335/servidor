package ar.incluit.fintech.anses.servidor.config;

import ar.incluit.fintech.anses.servidor.service.SOAPConector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;

import java.util.List;


@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.entrevistas.wsdl");
        return marshaller;
    }
    @Bean
    public SOAPConector articleClient(Jaxb2Marshaller marshaller) {
        SOAPConector client = new SOAPConector();
        client.setDefaultUri("http://localhost:9090/ws/entrevistas.wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {

        // register global interceptor
        interceptors.add(new CustomEndpointInterceptor());
    }

}
