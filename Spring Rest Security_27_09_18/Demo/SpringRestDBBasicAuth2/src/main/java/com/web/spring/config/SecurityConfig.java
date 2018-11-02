package com.web.spring.config;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	 DataSource dataSource;
			@Override
	 public void configure(AuthenticationManagerBuilder auth) throws Exception {
	   auth.jdbcAuthentication().dataSource(dataSource)
	  .usersByUsernameQuery(
	   "select username,password, enabled from logins where username=?")
	  .authoritiesByUsernameQuery(
	   "select l.username, r.role from logins l, roles r where l.login_id = r.login_id and l.username =?");
	 } 
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/", "/api/**").permitAll()
         .antMatchers("/admin/**").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')");
         http.httpBasic();
      
		    }
   }
