class Student implements Comparable<Student> {
    private String lastName;   
    private String firstName;
    private int id;
    Student(String firstName,String lastName, int id){
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getId(){
        return id;
    }
    @Override
    public String toString(){        
        return getFirstName() + " " + getLastName()+" "+getId();
    }
    @Override
    public int compareTo(Student s) {
        int firstCmp = this.getFirstName().compareTo(s.getFirstName());
        return firstCmp != 0 ? firstCmp :  this.getLastName().compareTo(s.getLastName());
    }
}
