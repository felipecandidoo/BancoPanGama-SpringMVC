package com.example.apiGAMA;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.apiGAMA.model.Usuario;
import com.example.apiGAMA.repositories.UsuarioRepository;

@SpringBootApplication
public class ApiGamaApplication implements CommandLineRunner {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiGamaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Usuario u1 = new Usuario( "Maria Silva", "1234"); 
		Usuario u2 = new Usuario( "Joao da Silva", "1234");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		

	}
}
