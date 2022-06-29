import java.io.IOException;
import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);
      int choice;
      do {
          System.out.println("----Language Menu----: ");
          System.out.println(" 1. Java");
          System.out.println(" 2. Python");
          System.out.println(" 3. C#");
          System.out.print("Enter your preferred language (1-3): ");
          choice = sc.nextInt();
          //while choice is not between 1..3 be in the loop
      } while( choice < 1 || choice > 3);
      sc.close();
      switch(choice) {
        case 1:
          System.out.println("Preferred Language- Java");            
          break;
        case 2:
          System.out.println("Preferred Language- Python");
          break;
        case 3:
          System.out.println("Preferred Language- C#");
          break;
      }
    }
  }