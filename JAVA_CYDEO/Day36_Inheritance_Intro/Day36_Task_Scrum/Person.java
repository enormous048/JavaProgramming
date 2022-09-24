package Day36_Inheritance_Intro.Day36_Task_Scrum;

//З чайлд класами ми оперуєм як зі звичайними раніше, просто батьки і бабусі тепер зберігають спільні фічурс
public class Person {

    protected String name;
    protected int age;
    protected char gender;


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name + " is eating "+ food );
    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
