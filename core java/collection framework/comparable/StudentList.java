import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class StudentList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("ayush","wadhwa", 1));
        studentList.add(new Student("karan","sadhwai", 5));
        studentList.add(new Student("prem","naimani", 3));
        studentList.add(new Student("prem","virwani", 2));
        System.out.println("Original List");
        for(Student s : studentList){
            System.out.println("" + s);
        }
        // Sorting the list
        Collections.sort(studentList);
        System.out.println("Sorted List");
        for(Student s : studentList){
            System.out.println("" + s);
        }
    }
}
