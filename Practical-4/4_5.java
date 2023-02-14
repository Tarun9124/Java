
class MainTest implements i {
    public double area() {
        return (pi * r * r);
    }

    public static void main(String[] args) {
        GrandParent g = new Parent();
        g.show(10, 20);
        g = new Child();
        g.show(30, 20);
        g = new GrandParent();
        g.show(40, 50);

        i i1 = new MainTest();

        System.out.println(i1.area());
    }
}

class GrandParent {
    void show(int x, int y) {
        System.out.println("GrandParent Method! : " + x + " " + y);
    }

}

class Parent extends GrandParent {
    void show(int x, int y) {
        System.out.println("Parent Method! : " + x + " " + y);
    }
}

class Child extends Parent {
    void show(int x, int y) {
        System.out.println("Child Method!show: " + x + " " + y);
    }
}

interface i {
    double pi = 3.14, r = 5;

    double area();
}
