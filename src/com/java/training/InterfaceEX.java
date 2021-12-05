package com.java.training;

 interface InterFaceEG {
	 void Empdetails();
	 void Comdetails();
	 void Salarydetails();

}
 class Details implements InterFaceEG {
	public void Empdetails() {
		 String name = "priya";
		 System.out.println("Name:\t" + name);
	 }
	public void Comdetails() {
		 String CmpName = "Maveric Systems Limited";
		 System.out.println("CompanyName:\t" + CmpName);
	 }
	public void Salarydetails() {
		 int Salary = 15000;
		 System.out.println("Salary:\t" + Salary);
	 }
 }
class InterfaceEX {
	public static void main(String args[]) {
		Details obj= new Details();	
		obj.Empdetails();
		obj.Comdetails();
		obj.Salarydetails();
	}
}
