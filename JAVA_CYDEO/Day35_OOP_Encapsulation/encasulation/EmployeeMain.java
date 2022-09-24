package Day35_OOP_Encapsulation.encasulation;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Naz", 'F', 18, 50000);
        System.out.println(emp);


        //Getter and Setter окремі методи бо інакше якшо нам треба хіба одну верібл змінити то прийдеться всі інші міняти.
        Employee emp2 = new Employee("Kamaz", 'M', 32, 100000);
        emp2.setSalary( emp2.getSalary() + 100000 );

        System.out.println(emp2);



    }
}

