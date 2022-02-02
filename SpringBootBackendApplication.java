package com.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.springbootdemo.model.User;
import com.springbootdemo.repository.UserRepository;


@SpringBootApplication
@ComponentScan(basePackages = "com.springbootdemo")
public class SpringBootBackendApplication extends  SpringBootServletInitializer  implements CommandLineRunner {
	
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		userRepository.save(new User("Venu", "G", "venuG@gmail.com"));
		userRepository.save(new User("Tom", "X", "tomx@gmail.com"));
		userRepository.save(new User("Tona", "K", "TonaK@gmail.com"));
		userRepository.save(new User("Alex", "X", "AlexX@gmail.com"));
		userRepository.save(new User("Roona", "F", "ronaF@gmail.com"));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
		
		
		
		System.out.println("Hello from DUB 30");
		System.out.println("Hello 1 from DUB 30");
		System.out.println("Hello 2 from DUB 30");
		System.out.println("Hello 3 from DUB 30");

		System.out.println("Hello updated 3 from DUB 30");

	}

	

	
}
