package es.prueba.web.servidorrest.rest;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {
  @GetMapping("/")
	  public String home() {
		  return Integer.toString(new Random().nextInt(20));
	  }
}
