package com.test.web.configs;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration

public class AppInitilizer extends  AbstractAnnotationConfigDispatcherServletInitializer {

	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { WebSecurityConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{SpringMvcConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]{"/"};
	}
	
	 @Override
	    protected Filter[] getServletFilters() {
	        return new Filter[] { new DelegatingFilterProxy("springSecurityFilterChain") };
	    }

	 @Override
	    protected void registerDispatcherServlet(ServletContext servletContext) {
	        super.registerDispatcherServlet(servletContext);

	        servletContext.addListener(new HttpSessionEventPublisher());

	    }

	   /* @Override
	    protected void customizeRegistration(ServletRegistration.Dynamic registration) {

	        File uploadDirectory = ServiceConfiguration.CRM_STORAGE_UPLOADS_DIRECTORY;

	        MultipartConfigElement multipartConfigElement = 
	            new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
	                maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);

	        registration.setMultipartConfig(multipartConfigElement);

	    }*/
}