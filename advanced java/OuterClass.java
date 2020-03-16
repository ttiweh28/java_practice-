public class OuterClass {
  String color = "Blue"; 
 private int data=30;  
 class Inner{  
  void msg(){
    System.out.println("My best color is "+color} 
    System.out.println("However i prefer color code "+data}  
 }  
 public static void main(String args[]){  
  OuterClass obj=new OuterClass();  
  OuterClass.Inner in = obj.new Inner();  
  in.msg();  
 }  
}                       
  

  