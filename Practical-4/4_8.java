class SuperShape{
    String color;
    public SuperShape(String color){
        this.color = color;
    }
    @Override 
    public String toString(){
        return "Shape:"+color;
    }
    public double Area(){
        System.err.println("Unknown Shape!");
        return 0;
    }
}
class Rectangle extends SuperShape{
    int length,width;
    public Rectangle(String color,int length,int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public String toString(){
        return "Rectangle:\nLength:"+length+"\nWidth:"+width+"\n"+super.toString();
    }
    
    public double getArea(){
        return length*width;
    }
}
class Triangle extends SuperShape{
    int base ,height;
    public Triangle(String color,int base,int height){
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override 
    public String toString(){
        return "Triangle:\nBase"+base+"\nheight:"+height+"\n"+super.toString();
    }
    public double getArea(){
        return 0.5*base*height;
    }
}
class InterfaceExample {
    public static void main(String[] args) {
        SuperShape s1 = new Rectangle("Blue", 10, 20);
        System.out.println(s1);
        System.out.println("Area"+s1.Area());
        SuperShape s2 = new Triangle("Green", 10, 20);
        System.out.println(s2);
        System.out.println("Area"+s2.Area());
        
    }
}