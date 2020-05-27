package com.unla.demoMB.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//-------------
@Controller                     //Se establece como Controlador
//@RequestMapping("/firstspring")

public class DemoController {
	@GetMapping("")            //método GET para llamarlo
	public String index() {    //Nombre del Método de Ruta de Acceso
		return "Index";        //Nombe de la Vista HTML en Template
	}
	
//----------
}//Fin DemoController


	// La clase tiene dos anotaciones:
	//   1. @Controller: Usado para especificar que la clase es un componente Controller.
	//   2. @RequestMapping(“/firstspring”): Usado para especificar la ruta por la cual se va a                      
//	                   acceder a los métodos, por intermedio de requests. Normalmente la ruta se llama                        
//	                   como el Controller, sacando el sufijo.
	//   3. Método @GetMapping, que  especifica que se accede al método por intermedio de una petición GET. 
//	                   Además, la anotación agrega un nombre a la ruta, para especificar cómo debe ser esta. 
//	                   El método del ejemplo  devuelve un String.
//					   Se la puede dejar Vacia o poner un string.



