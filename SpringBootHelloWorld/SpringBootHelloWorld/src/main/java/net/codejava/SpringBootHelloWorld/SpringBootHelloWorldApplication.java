package net.codejava.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

	@RequestMapping("/")
	public String  home(){
		return "<html><body><h1>Prueba</h1></body></html>";
	}

	@RequestMapping("/new")
	public String  otrometodo(){
		return ":)";
	}



}
