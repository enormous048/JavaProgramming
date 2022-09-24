package Day35_OOP_Encapsulation.encasulation;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Naz", 18);

        person.setName("Naz");
        person.setAge(18);

        String name = person.getName();
        int age = person.getAge();

        System.out.println(name +" "+age+" age.");


    }
}
