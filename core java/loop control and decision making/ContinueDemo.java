import java.util.Scanner;
public class ContinueDemo {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int number;
      while(true){
        System.out.print("Enter a even number: ");
        number = scanner.nextInt();
        // checking entered number even or not
        if(number%2 != 0) {
          System.out.println("Please enter even number...");
          continue;
        }else {
          break;
        }
      }
      scanner.close();
      System.out.print("Entered number is- " + number);
    }
  }