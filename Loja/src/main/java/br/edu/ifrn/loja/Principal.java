package br.edu.ifrn.loja;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Principal {
	 
	@GetMapping("/")
	String home() {
		 return "ola";
	}
	
	@GetMapping("/promocao")
	String promocao() {
		return "promocao";
	}
}
