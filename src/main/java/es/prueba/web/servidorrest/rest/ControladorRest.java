package es.prueba.web.servidorrest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    private int numeroUsuarios = 0;

    @GetMapping("/")
	  public String consultaUsuario() {
	    return Integer.toString(numeroUsuarios);
    }
    
    @PostMapping("/")
	  public String modificaUsuario(@RequestBody String modificacionUsuario) {
    		numeroUsuarios += Integer.parseInt(modificacionUsuario);
    	    return Integer.toString(numeroUsuarios);
	 }
}