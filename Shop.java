
public class Shop implements Business{
	public void printSales(int s){
		System.out.println("the total sales are " + s);
	}
	public static void main (String args []){
		Shop obj = new Shop();
		obj.printSales(30);
		System.out.println("the tax are " + Business.tax);

	}
}
