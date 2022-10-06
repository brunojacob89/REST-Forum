package br.com.alura.forum.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
@Configuration
@Profile("dev")
public class DevSecurityConfigurations {

  

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        .antMatchers(HttpMethod.GET, "/**").permitAll()
        .and().csrf().disable();
       
    
        return http.build();
    }
    
}
