package io.kirti.api_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import io.egens.config.SwaggerConfig;
import io.egens.config.WebConfig;
import io.swagger.models.Swagger;

@SpringBootApplication //annotation used in webconfig are replaced
@Import({SwaggerConfig.class, WebConfig.class }) //instred of declaring it in servelthandeler
public class Application {

	public static void main(String[] args) {
		//http://localhost:9000/api/ - it shows 9000
		SpringApplication.run(Application.class, args);//entry point ..next is to put properties
	}

}
