class parent {
    void put()
    {
        System.out.println("Parent put method called.");
    } 
}
class child extends parent{
    void put()
    {
        System.out.println("child put method called.");
    } 
}
class Test{
    public static void main(String args[])
    {
        child c1 = new child();
        c1.put();
    }
}
