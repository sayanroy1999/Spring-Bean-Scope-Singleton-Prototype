package com.example.demo12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo12Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo12Application.class, args);

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=context.getBean("student", Student.class);
		System.out.println(student.hashCode());

		Student student2=context.getBean("student", Student.class);
		System.out.println(student2.hashCode());

		//So when we run this main function, both student and student2 object will give me same hashcode as we are following singleton pattern
		//However with scope as prototype different hashcode will get generated

	}

}
