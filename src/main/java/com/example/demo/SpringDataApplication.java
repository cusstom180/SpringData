package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.dao.JdbcDaoImpl;
import com.example.demo.model.Circle;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl jdbcDaoImpl = ctx.getBean("jdbcDaoImple", JdbcDaoImpl.class); 
		
		Circle circle = jdbcDaoImpl.getCircle(1);
		System.out.println("CIRCLE NAME: " + circle.getName());
	}
}
