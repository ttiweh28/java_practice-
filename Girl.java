import java.io.*; 
  
class Girl{ 
      
    public static String geekName = ""; 
      
    public static void geek(String name){ 
          
        geekName = name; 
    } 
} 
  
class G { 
    public static void main (String[] args) { 
          
        // Accessing the static method geek() and  
        // field by class name itself. 

        Girl.geek("vaibhav");  
        System.out.println(Girl.geekName); 
         
        // Accessing the static method geek() by using Object's reference. 
        Girl obj = new Girl(); 
        obj.geek("mohit"); 
        System.out.println(obj.geekName);    
       
        }
    }