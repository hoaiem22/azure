package fev.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages={"fev.management"})
@EnableSwagger2
public class AzureApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureApiApplication.class, args);
	}

	// Create bean of Spring fox
	// Docket will help you create API Document
	@Bean
	public Docket studentAPI() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("fev.management")).paths(PathSelectors.regex("/api.*"))
				.build().apiInfo(metaData());
	}

	private ApiInfo metaData() {
		return new ApiInfoBuilder().title("FPTU Event Club")
				.description("An web about FEV by using Spring Boot and Springfox for Swagger")
				.contact(new Contact("FPTU Event Club", "http://fb.com/FPTEventClub", "fpteventclub@gmail.com"))
				.version("Close Beta").build();
	}

}
