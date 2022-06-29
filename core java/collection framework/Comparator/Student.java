class Student{
    private String lastName;   
    private String firstName;
    private int id;
    private int age;
    Student(String firstName,String lastName, int id, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.age = age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
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
        return getFirstName() + " " + getLastName()+" "+getId()+" "+getAge();
    }
}
