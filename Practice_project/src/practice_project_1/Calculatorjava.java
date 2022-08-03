package practice_project_1;

import java.util.Scanner;
public class Calculatorjava {
	public double add(double n1,double n2)
	{
		double sum;
		sum=n1+n2;
		return sum;
	}
	private double sub(double n1,double n2)
	{
		double sub;
		sub=n1-n2;
		return sub;
	}
	protected double mul(double n1,double n2)
	{
		double mul;
		mul=n1*n2;
		return mul;
	}
    double div(double n1,double n2)
	{
		double div;
		div=n1/n2;
		return div;
	}

	public static void main(String[] args) {
		  double n1=0;
	      double n2=0;
	      double answer=0;
	      char op=0;
	      
	      for(int i=0;i<5;i++)
		    {
	    	  Scanner reader = new Scanner(System.in);
	      
		      System.out.print("Enter two numbers: ");
		      n1 = reader.nextDouble();
		      n2 = reader.nextDouble();
		      System.out.print("\nEnter an operator (+, -, *, /): ");
		      op = reader.next().charAt(0);
		 
	      
	    	
		      if(op=='+')
		      {
		    	  answer = n1+n2;	    	 
		      }
		      else if(op=='-')
		      {
		    	  answer = n1-n2;	    	  
		      }
		      else if(op=='*')
		      {
		    	  answer = n1*n2;	    	  
		      }
		      else if(op=='/')
		      {
		    	  if(op>=2)
		    	  answer = n1/n2;
		    	  else
		    		  System.out.println("Enter a valid numbers : hint - number 2 should be greater than 1");
		      }
		      else
		      {
		    	  System.out.print("Please enter valid operator!"); 
		      }
		      
		      System.out.print("\nThe result is :\n");
		      System.out.printf(n1 + " " + op + " " + n2 + " = " + answer);
		      System.out.print("\n");
		      
		      System.out.print("Another method:");
		      System.out.print("\nThe result is :\n");
		      Calculatorjava c = new Calculatorjava();
		      c.add(n1, n2);
		      c.sub(n1,n2);
		      c.mul(n1,n2);
		      c.div(n1, n2);
		      switch(op) {
		         case '+': System.out.printf(n1 + " " + op + " " + n2 + " = " + c.add(n1, n2));;
		            break;
		         case '-': System.out.printf(n1 + " " + op + " " + n2 + " = " + c.sub(n1, n2)); 	    	 
		            break;
		         case '*': System.out.printf(n1 + " " + op + " " + n2 + " = " + c.mul(n1, n2)); 
		            break;
		         case '/': System.out.printf(n1 + " " + op + " " + n2 + " = " + c.div(n1, n2));    	 	  
		            break;
		      default: System.out.printf("Error! Enter correct operator");
		         return;
		    
		      }
		      System.out.println("\n");
		    }
	     

	}

}