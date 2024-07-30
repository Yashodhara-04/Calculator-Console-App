package service;

import java.util.Stack;

import dto.Calculator;

public interface ICalculatorService {
	
	public double addition(Calculator calculator);
	
	public double subtraction(Calculator calculator);
	
	public double multiplication(Calculator calculator);
	
	public double division(Calculator calculator);
	
	public double modules(Calculator calculator);
	
	public double factorial(Calculator calculator);
	
	public double root(Calculator calculator);
	
	public double exponential(Calculator calculator);
	
	public double sin(Calculator calculator);
	
	public double cos(Calculator calculator);
	
	public double tan(Calculator calculator);
	
	public void clear();
	
	public Stack<String> showHistory();
	
	public boolean isValueExists();

}
