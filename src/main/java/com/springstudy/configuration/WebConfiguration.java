package com.springstudy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class WebConfiguration extends WebMvcConfigurerAdapter{

	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
	        "classpath:/META-INF/resources/", "classpath:/resources/",
	        "classpath:/static/", "classpath:/public/" };
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		super.addViewControllers(registry);
//		registry.addRedirectViewController("/", "/kr/main");
//		registry.addViewController("/").setViewName("/admin/error/error");
//		registry.addViewController("/admin/login").setViewName("/admin/login/login");
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//registry.addResourceHandler("/css/**").addResourceLocations("/resources/**");
		 registry.addResourceHandler("/css/**").addResourceLocations("classpath:/css/");
		 registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
		 registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
		 registry.addResourceHandler("/img/**").addResourceLocations("classpath:/img/");
		 registry.addResourceHandler("/fonts/**").addResourceLocations("classpath:/fonts/");
		 registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		 registry.addResourceHandler("/markdownedit/**").addResourceLocations("classpath:/markdownedit/");
		 registry.addResourceHandler("/upload/**").addResourceLocations("classpath:/upload/");
		 registry.addResourceHandler("/editor/**").addResourceLocations("classpath:/editor/");
		 registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
	
	}
	
}
