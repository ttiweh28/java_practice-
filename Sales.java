import java.util.*;

npublic class Sales {
	public double price;
	public String productName;
	public int quantity;
	public double totalAmount;
	
	public double calculateSales(){
		 double totalAmount;
		Scanner s = new Scanner(System.in);
		  System.out.println("Enter the commodity");
		  productName=s.next();
		  System.out.println("Enter the ammount you want to purchase");
		  quantity = s.nextInt();
		  System.out.println("Enter the pice of the commodity to be purchased");
		  price = s.nextDouble();
		  totalAmount = quantity*price;
		  System.out.println("The commodity is :"+productName);
		  System.out.println("The ammount you want to purchase is :"+quantity);
		  System.out.println("The price of the commodity is :"+price);
		  System.out.println("The sales are ugshs:"+totalAmount);
		  return totalAmount;
	}
	 public static void main(String[] args){
		 Sales bb = new Sales();
		 bb.totalAmount=bb.calculateSales();
		 
		  
		  
		 
	 }

}
