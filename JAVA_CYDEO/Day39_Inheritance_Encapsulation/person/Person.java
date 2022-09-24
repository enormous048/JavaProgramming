package Day39_Inheritance_Encapsulation.person;

public class Person {
    private String name;
    private int age;
    private char gender;


    public Person(String name, int age, char gender) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            return;
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M' || gender=='F')){
            return;
        }
        this.gender = gender;
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
