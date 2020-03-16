import java.io.*;

public class Trial implements AI,BI {
	
	public void printAge(int a){
	 	System.out.println("Your age  Angel is  " + a);
}
	public void printAge2(int b){
	 	System.out.println("Your age ttiweh is  " + b);
}

	
	public static void main (String []args){
		Trial mytrial = new Trial();
		System.out.println("hello "+ AI.Name);
		System.out.println("hello "+ BI.Name);

		mytrial.printAge(42);
		mytrial.printAge2(2);
}
}