class type_casting{
     public static void main(String args[])
	{
	 byte a;
	 int b = 259;
	 double c = 343.234;
	 
	 a=(byte)b;
	 System.out.println("Conversion int to byte : "+ b +" "+a);
	 
	 b=(int)c;
	 System.out.println("Conversion double to int : "+ c +" "+b);
	 
	 a=(byte)c;
	 System.out.println("Conversion double to byte : "+ c +" "+a);
	}

}