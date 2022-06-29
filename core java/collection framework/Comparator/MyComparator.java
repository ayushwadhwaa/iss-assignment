import java.util.Comparator;
class MyComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
      int firstCmp = o1.getFirstName().compareTo(o2.getFirstName());
      if(firstCmp == 0){
      int lastCmp = o1.getLastName().compareTo(o2.getLastName());
      if(lastCmp == 0){
        if(o2.getId() < o1.getId()){
            return 1;
        }else{
            return -1;
        }
      }else{
        return lastCmp;
      }        
      }else{
        return firstCmp;
      }        
    }    
}