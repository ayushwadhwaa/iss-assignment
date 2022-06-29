public class OverloadingDemo {
    // overloaded Method
    void overloadedMethod(int i){
     System.out.println("In overloaded Method with int parameter- " + i);
    }
    
    // overloaded Method
    void overloadedMethod(int i, String s){
     System.out.println("In overloaded Method with int and string parameters- " + i + " " + s);
    }
    
    public static void main(String args[]){ 
     OverloadingDemo obj = new OverloadingDemo();
     obj.overloadedMethod(5);
     obj.overloadedMethod(5, "Test");
    }
}