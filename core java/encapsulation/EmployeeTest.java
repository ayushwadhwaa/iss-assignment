public class EmployeeTest {
  public static void main(String[] args) {
    Employee employee = new Employee();
    employee.setEmpId("E001");
    employee.setLastName("Test");
    employee.setFirstName("Name");
    employee.setAge(35);
    System.out.println("Added Employee- " + employee);
  }
}