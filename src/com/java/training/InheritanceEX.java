package com.java.training;

	class Sample1{
	    public void Naming1()
	    {
	        System.out.println("Abirami");
	    }
	}
	    class Sample2 extends Sample1
	    {
	        public void Naming2() 
	        {
	        	System.out.println("Daughter of Ramesh"); 
	        }
	    }
	
	public class InheritanceEX {

		public static void main(String[] args) {
	
		Sample2 A = new Sample2();
	    A.Naming1();
	    A.Naming2();
	 
	}
	}


