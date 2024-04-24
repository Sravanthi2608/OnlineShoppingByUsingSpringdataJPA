package com.shopping.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration
@ComponentScan("com.shopping")
@EnableJpaRepositories("com.shopping.Repository")
public class OnlineShoppingConfig {
	/*It is used to register the EntityManagerFactory Bean with in the IOC Container
	 *This LocalEntityManagerFactory is used for Stand alone applications
	 *To register the Bean of EntityManagerFactory for web application
	 *we make use of LocalContainerEntityManagerFactoryBean class */
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("OnlineShoppingByUsingSpringDataJPA");
		return bean;
	}
	/*It is used for to register EntityManager bean and Transaction bean in IOC container
	* To get the address of the database we need to set the Object of the
	* EntityMangerFactory by using the setEntitymanagerFactory(emf)*/
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		return jpaTransactionManager;
	}
}
