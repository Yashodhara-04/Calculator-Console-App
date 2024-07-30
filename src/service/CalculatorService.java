package service;

import java.util.Stack;

import dao.CalculatorRepository;
import dto.Calculator;

public class CalculatorService implements ICalculatorService {
	
	public double result = 0.0;
	public CalculatorRepository calRepo;
	
	public CalculatorService() {
        this.calRepo = new CalculatorRepository();
    }
	
	
	public double addition(Calculator calculator)
	{
		result = calRepo.addition(calculator);
		return result;
	}
	
	public double subtraction(Calculator calculator)
	{
		result = calRepo.subtraction(calculator);
		return result;
	}
	
	public double multiplication(Calculator calculator)
	{
		result = calRepo.multiplication(calculator);
		return result;
	}
	
	public double division(Calculator calculator)
	{
		result = calRepo.division(calculator);
		return result;
	}
	
	public double modules(Calculator calculator)
	{
		result = calRepo.modules(calculator);
		return result;
	}
	
	public double factorial(Calculator calculator)
	{
		result = calRepo.factorial(calculator);
		return result;
	}
	
	public double root(Calculator calculator)
	{
		result = calRepo.root(calculator);
		return result;
	}
	
	public double exponential(Calculator calculator)
	{
		result = calRepo.exponential(calculator);
		return result;
	}
	
	public double sin(Calculator calculator)
	{
		result = calRepo.sin(calculator);
		return result;
	}
	
	public double cos(Calculator calculator)
	{
		result = calRepo.cos(calculator);
		return result;
	}
	
	public double tan(Calculator calculator)
	{
		result = calRepo.tan(calculator);
		return result;
	}
	
	public void clear()
	{
		calRepo.clear();
	}
	
	public Stack<String> showHistory()
	{
		return calRepo.showHistory();
	}
	
	public boolean isValueExists()
	{
		return calRepo.isValueExists();
	}
	
}
