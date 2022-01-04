package com.cursojava.curso.controllers; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@RestController 
public class UsuarioController{

	@RequestMapping(value= "prueba")
	public List<String> prueba(){
		return List.of("manzana", "kiwi", "banana");
	}
}