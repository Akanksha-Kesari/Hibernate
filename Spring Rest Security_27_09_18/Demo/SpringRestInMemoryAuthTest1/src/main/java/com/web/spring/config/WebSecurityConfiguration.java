package com.web.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{
   
	@Override
	protected void configure(HttpSecurity http)throws  Exception
	{
		  http.authorizeRequests().antMatchers("/","/api/**")
		   .access("hasRole('USER')").
		   antMatchers("/admin/**").access("hasRole('ADMIN')");
		 //  .anyRequest().authenticated();
		   http.httpBasic();
		  
	   	   
	}
   
   @Override
	protected void configure(AuthenticationManagerBuilder auth)throws  Exception
	{
	   auth.inMemoryAuthentication().withUser("abc")
	   .password("abc").roles("USER");
	   auth.inMemoryAuthentication().withUser("admin")
	   .password("admin").roles("ADMIN");
	   
	      
	   
	}
	

	
	
}
