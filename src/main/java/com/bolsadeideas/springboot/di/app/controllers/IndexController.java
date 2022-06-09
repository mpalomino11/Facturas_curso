package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;

@Controller
public class IndexController {
	
	private MiServicio servicio2 = new MiServicio();/// sin inyeccion de dependencia  , sin que el archivo se tenga la notacion de @Componente
	
	//@Autowired  // para llamar la inyeccion de dependencia , principio Hollywood
	//private MiServicio servicio;

	@Autowired
	@Qualifier("miservicioSimple")
	private IServicio servicio; /// se inyecta desde la interface para que sea mas generico  con @Primary se determina uno por defaul si no esta especificado 
	
	
	@GetMapping({"/","","/index"})
	public String Index(Model model) { 
		model.addAttribute("objeto",servicio.operacion());
		return "index";
	}


	
	

}
