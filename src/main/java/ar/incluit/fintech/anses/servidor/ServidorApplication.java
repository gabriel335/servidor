package ar.incluit.fintech.anses.servidor;

import ar.incluit.fintech.anses.servidor.service.SOAPConector;
import com.entrevistas.wsdl.GetRolesRequest;
import com.entrevistas.wsdl.GetRolesResponse;
import com.entrevistas.wsdl.RolInfo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ServidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServidorApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(SOAPConector soapConector){
		return args ->{

			GetRolesResponse response = soapConector.getRoles();
			List<RolInfo> rolInfo = response.getRoles();

			for(RolInfo r : rolInfo){

				System.out.println(r.getId() +
						r.getRolName() );
			}
		};
	}

}
