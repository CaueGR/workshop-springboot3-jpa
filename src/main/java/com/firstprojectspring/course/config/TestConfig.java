package com.firstprojectspring.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.firstprojectspring.course.entities.User;
import com.firstprojectspring.course.repositories.UserRepository;

@Configuration //indica sua função
@Profile("test")//vai rodar a configuração somente quando estiver no perfil de teste
public class TestConfig implements CommandLineRunner {

	@Autowired //faz a injeção de dependência.
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
