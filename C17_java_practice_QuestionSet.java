/* QUESTIONS
  1.  Create a class Circle and use inheritance to create another class Cylinder from it.
  2.  Create a class Rectangle and use inheritance to create another class Cuboid. Try to keep it as close to real world scenario as possible.
  3.  Create methods for area and Volume in (1).
  4.  Create methods for area & volume in (2). Also create getters and setters.
  5.  What is the order of Constructor execution for the following inheritance hierarchy:
    Base
      ↓
    Derived1
      ↓
    Derived2
    Derived2 obj = new Derived2();
    Which constructor(s) will be executed & in what order?
 */

class Circle{
    protected int radius;
    void setRadius(int r){
        this.radius = r;
    }
    double area(){
        return this.radius*this.radius*3.14f;
    }
    double volume(){
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }
}
class Cylinder extends Circle{
    protected int height;
    void setHeight(int h){
        this.height = h;
    }
    double area(){
        return 2 * Math.PI * radius * (radius + height);

    }
    double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class Rectangle{
    protected int length,width;
    void setLength(int l){
        this.length = l;
    }
    void setWidth(int w){
        this.width = w;
    }
    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }
    double area(){
        return length * width;
    }
}
class Cuboid extends Rectangle{
    protected int height;
    void setHeight(int h){
        this.height = h;
    }
    int getHeight(){
        return height;
    }
    double area(){
        return 2 * (length * width + width * height + height * length);
    }
    double volume() {
        return length * width * height;
    }
}

// Q-5:
class Base {
    Base() {
        System.out.println("Base class constructor called");
    }
}

class Derived1 extends Base {
    Derived1() {
        System.out.println("Derived1 class constructor called");
    }
}

class Derived2 extends Derived1 {
    Derived2() {
        System.out.println("Derived2 class constructor called");
    }
}



public class C17_java_practice_QuestionSet {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();

        circle.setRadius(5);
        System.out.println("circle area: " + circle.area());

        cylinder.setRadius(7);
        cylinder.setHeight(5);
        System.out.println("cylinder area: " + cylinder.area());

        circle.setRadius(3);
        System.out.println("Circle volume: " + circle.volume());

        cylinder.setRadius(4);
        cylinder.setHeight(5);
        System.out.println("cylinder volume: " + cylinder.volume());

        Rectangle rectangle = new Rectangle();
        Cuboid cuboid = new Cuboid();

        rectangle.setLength(5);
        rectangle.setWidth(4);
        System.out.println("the area of rectangle is: " + rectangle.area());

        cuboid.setLength(5);
        cuboid.setWidth(4);
        cuboid.setHeight(3);

        System.out.println("The length, width and height os the cuboid is: " + cuboid.getLength() + " , " + cuboid.getWidth() + " , " + cuboid.getHeight());
        System.out.println("The area of the cuboid is: " + cuboid.area());
        System.out.println("The volume of the cuboid is: " + cuboid.volume());

       
        Derived2 obj = new Derived2();
    } 
}