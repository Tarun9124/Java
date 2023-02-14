class A {
    void m1()
    {
       System.out.println("A class m1 method.");
    }  
}
class B extends A {
    void m1()
    {
       System.out.println("B class m1 method.");
    }  
}
class C extends A {
    void m1()
    {
       System.out.println("C class m1 method.");
    }  
}
class dispatch{
    public static void main(String args[])
    {
        A a1 = new A();
        a1.m1();
        a1 = new B();
        a1.m1();
        a1 = new C();
        a1.m1();
    }
}