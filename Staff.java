import java .io.*; 

public class Staff{
	public String StaffID;
	public double Salary;                  
	public static String Department = "IT";
	public static void main(String [] args){
		Staff S = new Staff();
		S.StaffID ="S001";
		S.Salary = 500.00;
	
	System.out.println("StaffID:" + S.StaffID );
	System.out.println("Salary:" + S.Salary);
	System.out.println("Department:" + S.Department);
}
}
	