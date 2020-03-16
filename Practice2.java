import java.util.*;

public class Practice2 extends Practice{
	 public int Sum (int x, int y){
	 	return x+y;
	 }
	 public int Product (int x, int y ){
	 	return x*y;
	 }

	 public static void main (String []args){
	 		Scanner s = new Scanner(System.in);
	      Practice2 obj = new Practice2();
	      System.out.println("Enter the value of x");
		  int x =s.nextInt();
		  System.out.println("Enter the value of y");
		  int y = s.nextInt(); 
		  int v=obj.Product (x,y);
		  System.out.println("the product is ="+ v);
		  int w =obj.Sum(x,y);
		  System.out.println("the sum is =" + w);


	 		}
}