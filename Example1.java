import java.util.Scanner;

 
public class Example1 {
  
    public static void main(String[] args) {
     
      
        int array[]=new int[5];
        
        System.out.println("Enter 5 numbers");
        
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<5;++i)
             array[i]=sc.nextInt();

		for (int j=0; j < array.length; j++) {
			System.out.print(array[j] + " ");
   }
}
    
}