package net.codejava.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

	@CrossOrigin(origins = "http://mi-frontend.com", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/")
	public String  home(){
		return "<html><body><h1>Prueba</h1></body></html>";
	}

	@CrossOrigin(origins = "http://mi-frontend.com", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/new")
	public String  otrometodo(){
		return ":)";
	}

}
