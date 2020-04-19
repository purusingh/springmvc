package com.test.web.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@EnableWebMvc
@ComponentScan(basePackages = "com.test.web")
public class SpringMvcConfiguration extends WebMvcConfigurerAdapter{

	   @Override
	   public void addResourceHandlers(ResourceHandlerRegistry registry) {
	       registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	   }
	   
	   @Override 
	   public void addInterceptors(InterceptorRegistry registry) {
	      // registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**");
	       //registry.addInterceptor(new SessionCheckInterceptor());
		   super.addInterceptors(registry);
	    }
	   
	   @Bean
	   public ViewResolver viewResolver () {
	       InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	       viewResolver.setPrefix("/jsp/");
	       viewResolver.setSuffix(".jsp");
	       return viewResolver;
	   }
	    
	}