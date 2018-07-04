package org.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApplication {

	public MyApplication() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	     SpringApplication springApplication = new SpringApplication();
	        ApplicationContext applicationContext = springApplication.run(MyApplication.class,args);

	}

}


