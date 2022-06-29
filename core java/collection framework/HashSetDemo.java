import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
  public static void main(String[] args) {
    // creating a HashSet
    Set<String> citySet = new HashSet<String>();
    // Adding elements
    citySet.add("London");
    citySet.add(null);
    citySet.add("Tokyo");
    citySet.add("New Delhi");
    citySet.add("New york");
    citySet.add("Mumbai");
    citySet.add("New Delhi");
    // iterating HashSet
    for(String city : citySet){
      System.out.println("City- " + city);        
    }
  }
}