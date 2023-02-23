package com.cadu.math;

public class SimpleMath {

	//Calcular soma dos dois números passados.
	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo; 
	}
	
	//Calcular subtracao dos dois números passados.
	public Double subtraction( Double numberOne, Double numberTwo){

		return numberOne - numberTwo ; 
	}
	
	//Calcular multiplicação dos dois números passados.
	public Double multiplication(Double numberOne,Double numberTwo){
		
		return numberOne * numberTwo ; 
	}
	
	//Calcular divisão dos dois números passados.
	public Double division(Double numberOne,Double numberTwo){
		
		return numberOne / numberTwo ; 
	}
	
	//Calcular média dos dois números passados.
	public Double mean(Double numberOne,Double numberTwo) {
		return (numberOne + numberTwo) / 2 ; 
	}

	//Calcular raiz quadrada dos dois números passados.
	public Double squareRoot(Double number) {
		return Math.sqrt(number) ; 
	}
}
