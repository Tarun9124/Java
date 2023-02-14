interface Name1 {
    String n = "Tarun";
    void display();
}
interface Name2{
    String n = "Honey";
    void display();
}
interface Name3 extends Name1,Name2{
    String n = "Guru";
    void display();
}
class impname implements Name3{
    String n = "Harry";
    public void display()
    {
       System.out.println("Name : " + Name1.n);
       System.out.println("Name : " + Name2.n);
       System.out.println("Name : " + Name3.n);
       System.out.println("Name : " + n);
    }
}
class testname{
    public static void main(String args[])
    {
        impname n1 = new impname();
        n1.display();
    }
}