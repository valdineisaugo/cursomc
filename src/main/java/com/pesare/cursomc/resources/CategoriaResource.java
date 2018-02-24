package com.pesare.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {	
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody String listar() {
		return
				"Rest está funcionando";
	}
	
	

}
