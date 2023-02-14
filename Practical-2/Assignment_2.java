class equality{
     public static void main(String args[])
     {
         System.out.println("First String : " + args[0]);
         System.out.println("Second String : " + args[1]);

         String s1 = args[0];
         String s2 = args[1];

        System.out.println("\"" + s1 + "\"" + " Equal to " + "\"" + s2 + "\"" + " : " + s1.equals(s2));
     }  
}
