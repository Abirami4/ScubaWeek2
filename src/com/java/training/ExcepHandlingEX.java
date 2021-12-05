package com.java.training;

public class ExcepHandlingEX {
	
		  public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		   }catch(ArithmeticException e)
		   {
			   System.out.println("Java Exception Handiling");  
			   System.out.println(e);
		   }  
		  
		   System.out.println("**************");  
		  }  
		} 

