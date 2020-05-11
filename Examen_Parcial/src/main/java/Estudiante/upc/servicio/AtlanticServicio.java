package Estudiante.upc.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Estudiante.upc.entidades.Socio;
import Estudiante.upc.repositorio.Socio_Repositorio;

@Service
public class AtlanticServicio {
	@Autowired
	private Socio_Repositorio socio_repositorio;
	
	public List<Socio> listarSocios(){
		return socio_repositorio.findAll();
	}
	
	public Socio registrar_Socio(Socio socio) {
		return socio_repositorio.save(socio);
	}
	
	
}
