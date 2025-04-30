package com.firstprojectspring.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstprojectspring.course.entities.Category;
import com.firstprojectspring.course.services.CategoryService;
@RestController
@RequestMapping(value = "/categories")//para dar nome para o recurso
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping //para indicar que esse é um metodo que responde a requisição do tipo get do http
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);//.ok -> para retornar resposta com sucesso no http .body para receber o corpo da resposta do usuario u estanciado.		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
