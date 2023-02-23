package com.cadu.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cadu.converters.NumberConverter;
import com.cadu.exceptions.UnsupportedMathOperationException;
import com.cadu.math.SimpleMath;

@RestController
public class MathController {
	
	//private static final String template = "Hello, %s !";
	//private final AtomicLong counter = new AtomicLong();

	private SimpleMath math = new SimpleMath();
	
	//Calcular soma dos dois números passados.
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable(value ="numberOne") String numberOne, 
					  @PathVariable(value ="numberTwo") String numberTwo)throws Exception {
		
			if(! NumberConverter.isNumeric(numberOne)|| ! NumberConverter.isNumeric(numberTwo)) {
				throw new UnsupportedMathOperationException("Please set  a numeric value!");
			}
		
		return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo)) ; 
	}
	
	//Calcular subtracao dos dois números passados.
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtraction(@PathVariable(value ="numberOne") String numberOne, 
			@PathVariable(value ="numberTwo") String numberTwo)throws Exception {
		
		if(! NumberConverter.isNumeric(numberOne)|| ! NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set  a numeric value!");
		}
		
		return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo)) ;  
	}
	
	//Calcular multiplicação dos dois números passados.
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiplication(@PathVariable(value ="numberOne") String numberOne, 
			@PathVariable(value ="numberTwo") String numberTwo)throws Exception {
		
		if(! NumberConverter.isNumeric(numberOne)|| ! NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set  a numeric value!");
		}
		
		return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo)) ;   
	}
	
	//Calcular divisão dos dois números passados.
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division(@PathVariable(value ="numberOne") String numberOne, 
			@PathVariable(value ="numberTwo") String numberTwo)throws Exception {
		
		if(! NumberConverter.isNumeric(numberOne)|| ! NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set  a numeric value!");
		}
		
		return math.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo)) ;  
	}
	
	//Calcular média dos dois números passados.
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double mean(@PathVariable(value ="numberOne") String numberOne, 
		               @PathVariable(value ="numberTwo") String numberTwo)throws Exception {
		
		if(! NumberConverter.isNumeric(numberOne)|| ! NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set  a numeric value!");
		}

		return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));  
	}
	
	//Calcular raiz quadrada dos dois números passados.
	@RequestMapping(value = "/squareRoot/{number}", method=RequestMethod.GET)
	public Double squareRoot(@PathVariable(value ="number") String number) {
		
		if(! NumberConverter.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set  a numeric value!");
		}
		
		return math.squareRoot(NumberConverter.convertToDouble(number)) ;  
	}

}