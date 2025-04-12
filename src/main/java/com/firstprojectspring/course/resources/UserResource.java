package com.firstprojectspring.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstprojectspring.course.entities.User;
@RestController
@RequestMapping(value = "/users")//para dar nome para o recurso
public class UserResource {
	
	@GetMapping //para indicar que esse é um metodo que responde a requisição do tipo get do http
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "51999764728", "12345");
		return ResponseEntity.ok().body(u);//.ok -> para retornar resposta com sucesso no http .body para receber o corpo da resposta do usuario u estanciado.
		
	}

}
