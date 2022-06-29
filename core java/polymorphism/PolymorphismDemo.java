// Super Class
class Shape{
    protected double length;
    Shape(double length){
    this.length = length;
    }
    void area(){
    }
}
// Child class
class Square extends Shape{
//constructor to initialize length
    Square(double side){
    super(side); // calling the super class constructor  
    }
//Overriding the area() method
void area(){
    System.out.println("In area method of square");
    System.out.println("Area of square - " + length*length);
    }
}
// Child class
class Circle extends Shape{
    //constructor to initialize length
    Circle(double radius){
    super(radius); // calling the super class constructor 
    }
    //Overriding the area() method
    void area(){
    System.out.println("In area method of circle");
    System.out.println("Area of cirlce - " + 22/7*length*length);;
    }
}
public class PolymorphismDemo {
    public static void main(String[] args){
    Shape shape;
    Square square = new Square(5.0); 
    Circle circle = new Circle(5.0); 
    // shape dynamically bound to the Square object referenced by square
    shape = square;
    // area method of the square called
    shape.area(); 
    // shape dynamically bound to the Circle object referenced by circle
    shape = circle; 
    // area method of the circle called
    shape.area();   
    }
}