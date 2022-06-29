class Rectangle{
    double length;
    double width;
    //Constructor
    public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
    }
    // Method to compute area
    public void area(){
     double area = length * width;
     System.out.println("Area of the rectangle is " + area);
    }
   }