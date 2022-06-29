abstract class Shape{
	int side1,side2;
	void setSides(int side1 , int side2){
		this.side1 = side1;
		this.side2 = side2;
	}
	void setSide(int side){
		this.side1 = this.side2 = side;
	}
	void displaySides(){
		System.out.println("side1 ="+this.side1);
		System.out.println("side2 ="+this.side2);
	}
	abstract void area();
}
class Rectangle extends Shape{
	Rectangle(int side1,int side2){
		setSides(side1,side2);
	}
	void area(){
		System.out.println("Area of Rectangle ="+(side1*side2));
	}
}
class Triangle extends Shape{
		Triangle(int side1, int side2){
			setSides(side1,side2);
		}
		void area(){
			System.out.println("Area of Triangle ="+0.5*(side1*side2));
		}
}
class ShapeDemo{
	public static void main(String[] args) {
		Shape shape;
		Rectangle rectangle = new Rectangle(10,20);
		Triangle triangle = new Triangle(5,10);
		shape=rectangle;
		shape.area();
		shape=triangle;
		shape.area();
	}
}