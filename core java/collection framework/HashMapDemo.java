import java.util.Map;
import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
      // creating HashMap
      Map<String, String> langMap = new HashMap<String, String>();
      // Storing (key, value) pair to HashMap
      langMap.put("ENG", "English");
      langMap.put("NLD", "Dutch");
      langMap.put("ZHO", "Chinese");
      langMap.put("BEN", "Bengali");
      langMap.put("ZUL", "Zulu");
      // retrieving value using key
      String language = langMap.get("BEN");
      System.out.println("Language- " + language);
      System.out.println("-- Map Elements --");
      for(String key : langMap.keySet()){
        System.out.println("key: "+key+" value: "+langMap.get(key));
      }
    }
}