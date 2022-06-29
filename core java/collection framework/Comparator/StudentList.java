import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class StudentList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("ayush","wadhwa", 1, 22));
        studentList.add(new Student("karan","sadhwai", 5, 23));
        studentList.add(new Student("prem","naimani", 3, 23));
        studentList.add(new Student("prem","virwani", 2,21));
        studentList.add(new Student("prem","virwani", 4,21));
        System.out.println("Original List");
        for(Student s : studentList){
            System.out.println("" + s);
        }
        // Sorting the list
        Collections.sort(studentList, new MyComparator());
        System.out.println("Sorted List");
        for(Student s : studentList){
            System.out.println("" + s);
        }
    }
}
