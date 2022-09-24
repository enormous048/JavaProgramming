package Day43_Abstraction_Class.employee;

public abstract class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name,  int age,  char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new RuntimeException("Invalid age");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M' || gender=='F')){
            throw new RuntimeException("Invalid gender");
        }
        this.gender = gender;
    }

    public void sleep(){
        System.out.println(getName()+" sleeps every day.");  //dont need to be abstract because everyone sleeps same
    }

    public abstract void eat();

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
