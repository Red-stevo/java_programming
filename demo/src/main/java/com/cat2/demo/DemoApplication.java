package com.cat2.demo;

import org.springframework.boot.BootstrapContextClosedEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);

		SwingUtilities.invokeLater(() -> {
			BootstrapContextClosedEvent ApplicationContextProvider;
			RegisterForm registerForm = ApplicationContextProvider.getApplicationContext().getBean(RegisterForm.class);
			registerForm.setVisible(true);
		});

	}

}
