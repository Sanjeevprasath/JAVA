interface Shape{
    void draw();
}
class Circle implements Shape{
   public void draw(){
        System.out.println("Draw a Circle");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Draw a Rectangle");
    }
}
class Interfce{
    public static void main(String[] args){
        Shape s;
        s=new Rectangle();
        s.draw();
        s=new Circle();
        s.draw();
    }
}