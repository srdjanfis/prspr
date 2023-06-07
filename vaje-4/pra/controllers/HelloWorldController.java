package local.pra.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
	
	@RequestMapping("/squareRoot/{a}")
	public double getSquareRoot(@PathVariable double a) {
		return Math.sqrt(a);
	}
	@RequestMapping("/sin/{a}")
	public double getSin(@PathVariable double a) {
		return Math.sin(a);
	}
	
	@RequestMapping("/add/{a}/{b}")
	public double add(@PathVariable double a, 
					  @PathVariable double b) {
		return a+b;
	}
	
	@RequestMapping("/subtract/{a}/{b}")
	public double subtract(@PathVariable double a, 
					       @PathVariable double b) {
		return a-b;
	}
	
	@RequestMapping("/multiply/{a}/{b}")
	public double multiply(@PathVariable double a, 
						   @PathVariable double b) {
		return a*b;
	}
	
	@RequestMapping("/divide/{a}/{b}")
	public double divide(@PathVariable double a, 
					  @PathVariable double b) {
		return a/b;
	}
}
