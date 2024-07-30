package dao;

import java.util.Stack;

import dto.Calculator;

public class CalculatorRepository {
	public static Stack<String> stack = new Stack<String>();
	public static double currResult = 0;
	public static double preResult = 0;
	
	public double addition(Calculator calculator){
		preResult = currResult;
		currResult+=calculator.getNumber();
		pushToStack(calculator.getNumber(), preResult, currResult, "add");
		return currResult;
	}
	
	public double subtraction(Calculator calculator){
		preResult = currResult;
		currResult-=calculator.getNumber();
		pushToStack(calculator.getNumber(), preResult, currResult, "sub");
		return currResult;
	}
	
	public double multiplication(Calculator calculator){
		preResult = currResult;
		currResult*=calculator.getNumber();
		pushToStack(calculator.getNumber(), preResult, currResult, "mul");
		return currResult;
	}
	
	public double division(Calculator calculator){
		preResult = currResult;
		currResult/=calculator.getNumber();
		pushToStack(calculator.getNumber(), preResult, currResult, "divide");
		return currResult;
	}
	
	public double modules(Calculator calculator){
		preResult = currResult;
		currResult%=calculator.getNumber();
		pushToStack(calculator.getNumber(), preResult, currResult, "modules");
		return currResult;
	}
	
	public double factorial(Calculator calculator){
		preResult = currResult;
		if(calculator.getNumber() > 0)
		{
			currResult = getFactorial(calculator.getNumber());
			pushToStack(calculator.getNumber(), currResult, "fact");
		}
		else
		{
			currResult = getFactorial(currResult);
			pushToStack(preResult, currResult, "fact");
		}
		return currResult;
	}
	
	public double root(Calculator calculator){
		preResult = currResult;
		if(calculator.getNumber() > 0)
		{
			currResult = Math.sqrt(calculator.getNumber());
			pushToStack(calculator.getNumber(), currResult, "root");
		}
		else
		{
			currResult = Math.sqrt(currResult);
			pushToStack(preResult, currResult, "root");
		}
		return currResult;
	}
	
	public double exponential(Calculator calculator){
		preResult = currResult;
		if(calculator.getNumber() > 0)
		{
			currResult = Math.exp(calculator.getNumber());
			pushToStack(calculator.getNumber(), currResult, "exponential");
		}
		else
		{
			currResult = Math.exp(currResult);
			pushToStack(preResult, currResult, "exponential");
		}
		return currResult;
	}
	
	public double sin(Calculator calculator){
		preResult = currResult;
		if(calculator.getNumber() > 0)
		{
			currResult = Math.sin(calculator.getNumber());
			pushToStack(calculator.getNumber(), currResult, "sin");
		}
		else
		{
			currResult = Math.sin(currResult);
			pushToStack(preResult, currResult, "sin");
		}
		
		return currResult;
	}
	
	public double cos(Calculator calculator){
		preResult = currResult;		
		if(calculator.getNumber() > 0)
		{
			currResult = Math.cos(calculator.getNumber());
			pushToStack(calculator.getNumber(), currResult, "cos");
		}
		else
		{
			currResult = Math.cos(currResult);
			pushToStack( preResult, currResult, "cos");
		}
		return currResult;
	}
	
	public double tan(Calculator calculator){
		preResult = currResult;
		if(calculator.getNumber() > 0)
		{
			currResult = Math.tan(calculator.getNumber());
			pushToStack(calculator.getNumber(), currResult, "tan");
		}
		else
		{
			currResult = Math.tan(currResult);
			pushToStack(preResult, currResult, "tan");
		}
		return currResult;
	}
	
	public void clear()
	{
		currResult = 0;
		preResult = 0;
	}
	
	public Stack<String> showHistory()
	{
		return stack;
	}

	public void pushToStack(double number, double preResult, double result, String action)
	{
		if(preResult >0)
		{
			stack.push(action + "(" + preResult +","+ number + ") = " + result);
		}
	}
	
	public void pushToStack(double number, double result, String action)
	{
		if(preResult >0)
		{
			stack.push(action + "("  + number + ") = " + result);
		}
	}
	
	public double getFactorial(double number){
		if(number == 0)
		{
			return 1;
		}
		return (number * getFactorial(number - 1));
	}
	
	public boolean isValueExists()
	{
		return currResult > 0 ? true : false;
	}
}
