package com.learn.contacts_api_v2.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiDoc(){

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.learn.contacts_api_v2"))
                .build()
                .apiInfo(apiInfo());
    }

    public ApiInfo apiInfo(){
      return  new ApiInfo("My Contacts API",
              "API for managing contacts",
              "1.0",
              "www.myapp.com/terms",
              new Contact("Ghouse", "www.mg.com", "mg@mg.com"),
              "GPL",
              "myurl",
                List.of());
    }
}
