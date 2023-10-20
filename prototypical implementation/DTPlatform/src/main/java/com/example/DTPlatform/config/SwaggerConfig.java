package com.example.DTPlatform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class SwaggerConfig implements WebMvcConfigurer {

    private static ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("TwinManager API.")
                .description("TBD.")
                .version("1.0.0")
                .build();
    }

    @Bean
    public Docket api() {
        System.out.println(RequestHandlerSelectors.basePackage("com.example.TwinManager.controller"));
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())    // todo: rename package from ame to da-specific name
                .paths(PathSelectors.any())
                .build();
    }

}
