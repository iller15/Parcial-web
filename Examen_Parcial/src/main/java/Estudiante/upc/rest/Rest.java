package Estudiante.upc.rest;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import Estudiante.upc.entidades.Socio;
import Estudiante.upc.servicio.AtlanticServicio;

@RestController
@RequestMapping("/api")
public class Rest {
	
	@Autowired
	private AtlanticServicio atlanticServicio;
	
	@PostMapping("/socio")
	public Socio registrarSocio(@RequestBody Socio socio) {
		String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" + "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(socio.getEmail());
		if(!matcher.matches())
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "El correo es invalido");
		
		return atlanticServicio.registrar_Socio(socio);
	}
	
	@GetMapping("/socioList")
	public List<Socio> listarSocio(){
		return atlanticServicio.listarSocios();
	}
}
