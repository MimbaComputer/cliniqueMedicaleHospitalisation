package org.mimba.bao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.EndpointMBeanExportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication(exclude = EndpointMBeanExportAutoConfiguration.class)
public class CliniqueMedicaleHospitalisationServiceApplication implements CommandLineRunner{

	public static void main(String[] args) { 
		SpringApplication.run(CliniqueMedicaleHospitalisationServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
