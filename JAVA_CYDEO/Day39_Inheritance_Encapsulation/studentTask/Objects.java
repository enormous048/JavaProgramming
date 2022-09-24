package Day39_Inheritance_Encapsulation.studentTask;

public class Objects {
    public static void main(String[] args) {
        Person p = new Person("Naz", 'M', 18);
        System.out.println(p);
        Student s = new Student("Naz", 'M', 18, "Automation", "Cydeo", 1, 'B');


        CydeoStudent st = new CydeoStudent("Naz", 'M', 18, "Automation", "Cydeo", 1, 'B', 25, 1, "Java");

        st.eat();
    }
}
