package Day33_StaticMembers;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee33 employee = new Employee33();
        employee.workPlace = "Google";


        Employee33 employee2 = new Employee33();
        employee2.workPlace = "Microsoft"; //заново ініціалізуєш то воно міняється для всіх обьєктів

    } 
}
