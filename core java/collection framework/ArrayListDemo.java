import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
      // List with initial capacity as 2
      List<String> cityList = new ArrayList<>(2);
      cityList.add("London");
      cityList.add("Paris");
      cityList.add("Bangalore");
      cityList.add("Istanbul");
      cityList.add("Delhi");
      cityList.add("Mumbai");
      System.out.println("Original List- ");
      for(String name : cityList){
        System.out.println("City Name - " + name);
      }
      // Removing element at index 3
      String cityName = cityList.remove(3);
      System.out.println("Removed from the List- " + cityName);
      // using removeIf with a predicate
      cityList.removeIf((String name )->name.equalsIgnoreCase("Bangalore"));
      
      System.out.println("List after removal of elements-");
      
      for(String name : cityList){
        System.out.println("City Name - " + name);
      }
    }
}