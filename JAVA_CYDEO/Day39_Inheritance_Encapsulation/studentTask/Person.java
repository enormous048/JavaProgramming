package Day39_Inheritance_Encapsulation.studentTask;

public class Person {
    private String name;
    private char gender;
    private int age;


    public Person(String name, char gender, int age) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            return;
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M' || gender=='F')){
            System.out.println("Invalid gender");
            return;
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            return;
        }
        this.age = age;
    }

    public void eat(){
        System.out.println(name+ " is eating.");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
