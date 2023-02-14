class sup {
   String name;
    sup()
    {
        name = "Tarun";
        System.out.print("My Name is = " + name);
    }
}
class sub extends sup{
    sub()
    {
       super();
    }
}
class Test{
    public static void main(String args[])
    {
        sub s1 = new sub();
    }
}