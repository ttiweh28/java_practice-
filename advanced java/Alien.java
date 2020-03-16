class Alien extends Person{
   //Overriding Method
   public void travel(){
       System.out.println("Aliens also travel the world");
   }
   
   public static void main( String args[]) {
       
       Person obj = new Alien();
       
       Person obj2 = new Person();
       
       obj.travel();
       obj2.travel();
   }
}