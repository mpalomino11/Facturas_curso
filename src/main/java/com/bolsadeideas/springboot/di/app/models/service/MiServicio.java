package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("miservicioSimple")
//@Service // diferencia es solo semantica
public class MiServicio implements IServicio{
	
	@Override
	public String operacion() {
		return "ejecutando algun proceso simple " ;
	}

}
