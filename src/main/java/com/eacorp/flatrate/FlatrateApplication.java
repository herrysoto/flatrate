package com.eacorp.flatrate;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.jndi.JndiObjectFactoryBean;

@SpringBootApplication
public class FlatrateApplication extends SpringBootServletInitializer {

	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	@Value("${spring.datasource.username}")
	private String user;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.url}")
	private String url;
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	       return application.sources(FlatrateApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(FlatrateApplication.class, args);
				
	}
//	
//	@Bean
//	public TomcatEmbeddedServletContainerFactory tomcatFactory() {
//	    return new TomcatEmbeddedServletContainerFactory() {
//
//	        @Override
//	        protected TomcatEmbeddedServletContainer getTomcatEmbeddedServletContainer(
//	                Tomcat tomcat) {
//	            tomcat.enableNaming();
//	            return super.getTomcatEmbeddedServletContainer(tomcat);
//	        }
//	    };
//	}
//	
//	
//
//@Bean
//public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
//    return new EmbeddedServletContainerCustomizer() {
//        @Override
//        public void customize(ConfigurableEmbeddedServletContainer container) {
//            if (container instanceof TomcatEmbeddedServletContainerFactory) {
//                TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory = (TomcatEmbeddedServletContainerFactory) container;
//                tomcatEmbeddedServletContainerFactory.addContextCustomizers(new TomcatContextCustomizer() {
//                    @Override
//                    public void customize(Context context) {
//                    	ContextResource mydatasource = new ContextResource();
//                        mydatasource.setName("jdbc/prueba");
//                        mydatasource.setAuth("Container");
//                        mydatasource.setProperty("factory", "org.apache.tomcat.jdbc.pool.DataSourceFactory");
//                        mydatasource.setType("javax.sql.DataSource");
//                        mydatasource.setScope("Sharable");
//                        mydatasource.setProperty("driverClassName", driverClassName);
//                        mydatasource.setProperty("url", url);
//                        mydatasource.setProperty("username", user);
//                        mydatasource.setProperty("password", password);
//
//                        context.getNamingResources().addResource(mydatasource);
//
//                    }
//                });
//            }
//        }
//    };
//}

@Lazy
@Bean(destroyMethod="")
public DataSource jndiDataSource() throws IllegalArgumentException, NamingException {
	DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.url(url);
    dataSourceBuilder.username(user);
    dataSourceBuilder.password(password);
    dataSourceBuilder.driverClassName(driverClassName);
    return dataSourceBuilder.build();  
}
}
