package com.jp.employees.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/*
 * @EnableWs indicates its an annotation driven spring-ws programming model
 */

@EnableWs
@Configuration
public class WSConfig {
	
	
	@Bean //configure dispatcher servlet.
	public ServletRegistrationBean<MessageDispatcherServlet> 
						messageDisatcherServlet(ApplicationContext context){
		
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/ws/*");
		
	}
	
	@Bean(name="employees")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
		DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
		wsdl.setSchema(schema);
		wsdl.setTargetNamespace("http://www.jp.com/ns/employees");
		wsdl.setPortTypeName("EmployeesPort");
		wsdl.setLocationUri("/ws");
		return wsdl;
	}
	
	@Bean //configure xsd
	public XsdSchema schema() {
       SimpleXsdSchema schema = new SimpleXsdSchema(new ClassPathResource("employees.xsd"));
       return schema;
	}

}
