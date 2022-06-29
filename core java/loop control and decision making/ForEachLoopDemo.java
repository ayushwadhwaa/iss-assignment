import java.util.ArrayList;
import java.util.List;

public class ForEachLoopDemo {
    public static void main(String[] args) {
      List<String> languages = new ArrayList<String>();
      languages.add("C");
      languages.add("C++");
      languages.add("Java"); 
      languages.add("Python");        
      for(String language : languages){
        System.out.println(language);
      }
    }
  }