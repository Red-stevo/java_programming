package com.steve.muish.beanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanLifeCycleApplication  {

	public static void main(String[] args)throws Exception
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanConfig.xml");
		MemeberDAO memberDAO = applicationContext.getBean("memberDAO",MemeberDAO.class);

		memberDAO.selectAllTable();

		((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();
	}
}
