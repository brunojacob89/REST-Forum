package br.com.alura.forum.config.swagger;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfiguration {

	
	
	@Bean
	public GroupedOpenApi publicApi() {
	    return GroupedOpenApi.builder()
	            .group("forumApi")
	            .pathsToMatch("/**")
	            .build();
	}

	@Bean
	public OpenAPI forumAluraOpenAPI() {
	    return new OpenAPI()
	            .info(new Info().title("Forum API")
	                            .description("Projeto de Documentacao de API da Alura")
	                            .version("v0.0.1")
	                            .license(new License().name("Apache 2.0").url("http://springdoc.org")))
	            .externalDocs(new ExternalDocumentation()
	                    .description("SpringShop Wiki Documentation")
	                    .url("https://springshop.wiki.github.org/docs"))
	            .components(
	            		new Components()
	                    .addSecuritySchemes("bearer-key", new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").in(SecurityScheme.In.HEADER).bearerFormat("JWT")));
	}
	
}
