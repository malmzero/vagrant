package main;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import com.arquitecturajava.negocio.Persona;
@RestController


public class ControllerApilar {

	

	@RequestMapping(value = "/personas", method = RequestMethod.GET)
//	public List<Persona> listaPersonas() {
	public int listaPersonas() {
	//List<Persona> lista = new ArrayList<Persona>();
	int a=0;
	//Persona p = new Persona();
	//p.setNombre("angel");
	//p.setEdad(20);
	//lista.add(p);
	//Persona p1 = new Persona();
	//p1.setNombre("gema");
	//p1.setEdad(30);
	//lista.add(p1);
	//return lista;
	return a;
	}
	
	
	
	
	
	
}
