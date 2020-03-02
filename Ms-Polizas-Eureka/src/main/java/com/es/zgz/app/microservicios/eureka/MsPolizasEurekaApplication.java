package com.es.zgz.app.microservicios.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsPolizasEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPolizasEurekaApplication.class, args);
	}

}
