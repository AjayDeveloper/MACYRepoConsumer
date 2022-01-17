package com.macy;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MacyOrderMessageConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacyOrderMessageConsumerApplication.class, args);
	}

	@SuppressWarnings("rawtypes")
	private ApiInfo getApiInfo() {
		return new ApiInfo("MACY-Order-Consumer REST API Documentation", 
				"MACY-Order-Consumer REST APIs released by Zensar Ltd.",
				"1.0",
				"http://zensar.com/termsofservices",
				 new Contact("Ajay", "http://ajay.com", "ajay.panchal@zensar.com"),
				 "GPL",
				 "http://gpl.com",
				 new ArrayList<VendorExtension>());
	}

	@Bean
	public Docket getCustomizeDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.macy"))
				.paths(PathSelectors.ant("/macy/consumer/**"))
				.build();
	}
}
