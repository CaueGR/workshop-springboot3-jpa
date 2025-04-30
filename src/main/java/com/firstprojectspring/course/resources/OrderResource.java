package com.firstprojectspring.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstprojectspring.course.entities.Order;
import com.firstprojectspring.course.services.OrderService;
@RestController
@RequestMapping(value = "/orders")//para dar nome para o recurso
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping //para indicar que esse é um metodo que responde a requisição do tipo get do http
	public ResponseEntity<List<Order>> findAll(){
		
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);//.ok -> para retornar resposta com sucesso no http .body para receber o corpo da resposta do usuario u estanciado.		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
