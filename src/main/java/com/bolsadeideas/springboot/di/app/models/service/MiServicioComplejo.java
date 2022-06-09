package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("miservicioComplejo")
//@Primary
//@Service // diferencia es solo semantica
public class MiServicioComplejo implements IServicio{
	
	@Override
	public String operacion() {
		return "ejecutando algun proceso importante complicado ....!!!!!!!!!!!!!! " ;
	}

}
