package com.shoe.shoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shoe.shoes.entity.Users;
import com.shoe.shoes.repository.UserRepository;

@SpringBootApplication
public class ShoesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShoesApplication.class, args);
	}
@Autowired
private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
//		Users user1 = new Users("Sam", "man", "fara@ing.com");
//		userRepository.save(user1);
//		Users user2 = new Users("Sam", "man", "fara@ing.com");
//		userRepository.save(user2);
	}

}
