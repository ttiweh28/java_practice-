class Grandy{
		public static void main(String args[])
	{
		//implicit cast
		Parent p = new Child();
		p.display();

		//explicit cast
		Child c =(Child) p; 
		c.display();
	}
}