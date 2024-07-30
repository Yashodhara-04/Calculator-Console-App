package controller;

import java.util.Scanner;
import java.util.Stack;

import dto.Calculator;
import service.ICalculatorService;
import service.CalculatorService;

public class CalculatorController {
	private ICalculatorService calculatorService = new CalculatorService();
	
	public void startCalculatorApp()
	{
		while(true)
		{
			showMenu();
			int choice = (int)getUserInput("\nEnter your choice: ");
			performAction(choice);
		}
	}
	
	public double getUserInput(String displayMessage)
	{
		System.out.println(displayMessage);
		Scanner sc = new Scanner(System.in);
		try
		{
			double value = sc.nextDouble();
			return value;
		}
		catch (Exception ex)
		{
			System.out.println("Invalid Input");
			return 0;
		}
		
	}
	
	public void displayResult(double result)
	{
		System.out.println("Result : " + result);
	}
	
	public void showMenu()
	{
		System.out.println(" _____________________________________ ");
		System.out.println("|                                     |");
		System.out.println("| 1. Addition        | 2. Subtraction |");
		System.out.println("| 3. Multiplication  | 4. Division    |");
		System.out.println("| 5. Modules         | 6. Factorial   |");
		System.out.println("| 7. Root            | 8. Exponential |");
		System.out.println("| 9. Sin             | 10. Cos        |");
		System.out.println("| 11. Tan            | 12. Clear      |");
		System.out.println("| 13. Show History                    |");
		System.out.println("|_____________________________________|");
	}
	
	public void performAction(int choice)
	{
		switch(choice)
		{
			case 1: addition();
					break;
			case 2: subtraction();
					break;
			case 3: multiplication();
					break;
			case 4: division();
					break;
			case 5: modules();
					break;
			case 6: factorial();
					break;
			case 7: root();
					break;
			case 8: exponential();
					break;
			case 9: sin();
					break;
			case 10: cos();
					break;
			case 11: tan();
					break;
			case 12: clear();
					break;
			case 13: showHistory();
			break;
			default: break;
		}
	}
	
	public void addition()
	{
		double val = getUserInput("Enter the number: ");
		Calculator calculator = new Calculator(val);
		double result = calculatorService.addition(calculator);
		displayResult(result);

	}
	
	public void subtraction()
	{
		double val = getUserInput("Enter the number: ");
		Calculator calculator = new Calculator(val);
		double result = calculatorService.subtraction(calculator);
		displayResult(result);
	}
	
	public void multiplication()
	{
		double val = getUserInput("Enter the number: ");
		Calculator calculator = new Calculator(val);
		double result = calculatorService.multiplication(calculator);
		displayResult(result);
	}
	
	public void division()
	{
		double val = getUserInput("Enter the number: ");
		Calculator calculator = new Calculator(val);
		double result = calculatorService.division(calculator);
		displayResult(result);
	}
	
	public void modules()
	{
		double val = getUserInput("Enter the number: ");
		Calculator calculator = new Calculator(val);
		double result = calculatorService.modules(calculator);
		displayResult(result);
	}
	
	public void factorial()
	{
		double val = 0.0;
		if(!isValueExists())
		{
			val = getUserInput("Enter the number: ");
		}
		Calculator calculator = new Calculator(val);
		double result = calculatorService.factorial(calculator);
		displayResult(result);
	}
	
	public void root()
	{
		double val = 0.0;
		if(!isValueExists())
		{
			val = getUserInput("Enter the number: ");
		}
		Calculator calculator = new Calculator(val);
		double result = calculatorService.root(calculator);
		displayResult(result);
	}
	
	public void exponential()
	{
		double val = 0.0;
		if(!isValueExists())
		{
			val = getUserInput("Enter the number: ");
		}
		Calculator calculator = new Calculator(val);
		double result = calculatorService.exponential(calculator);
		displayResult(result);
	}
	
	public void sin()
	{
		double val = 0.0;
		if(!isValueExists())
		{
			val = getUserInput("Enter the number: ");
		}
		Calculator calculator = new Calculator(val);
		double result = calculatorService.sin(calculator);
		displayResult(result);
	}
	
	public void cos()
	{
		double val = 0.0;
		if(!isValueExists())
		{
			val = getUserInput("Enter the number: ");
		}
		Calculator calculator = new Calculator(val);
		double result = calculatorService.cos(calculator);
		displayResult(result);
	}
	
	public void tan()
	{
		double val = 0.0;
		if(!isValueExists())
		{
			val = getUserInput("Enter the number: ");
		}
		Calculator calculator = new Calculator(val);
		double result = calculatorService.tan(calculator);
		displayResult(result);
	}
	
	public void clear()
	{
		calculatorService.clear();
	}
	
	public void showHistory()
	{
		Stack<String> stack = calculatorService.showHistory();
		System.out.println();
		if(!stack.isEmpty())
		{
			System.out.println(stack);
		}
	}
	
	public boolean isValueExists()
	{
		return calculatorService.isValueExists();
	}
}
