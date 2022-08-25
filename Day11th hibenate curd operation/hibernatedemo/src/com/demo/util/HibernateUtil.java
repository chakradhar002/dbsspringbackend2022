package com.demo.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionfactory = null;

	public static SessionFactory getSessionFactory() {

		// creating configuration instance and passing Hibernate configuration file
		Configuration configobj = new Configuration();
		configobj.configure("hibernate.cfg.xml");

		// since after hinerante 4.x serice registry is being used
		ServiceRegistry serviceRegistryobj = new StandardServiceRegistryBuilder()
				.applySettings(configobj.getProperties()).build();

		// creating the hibernate session factory instance

		SessionFactory sessionfactory = configobj.buildSessionFactory(serviceRegistryobj);
		return sessionfactory;

	}

}
