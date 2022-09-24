package Day30_CustomClass;

import java.util.Collections;

public class EmployeeMain {
    public static void main(String[] args) {


        Employee empObj1 = new Employee();
        empObj1.setInfo("Frederik", 'M', 19, 20000, true);


        Employee empObj2 = new Employee();
        empObj2.setInfo("Zorro", 'M', 26, 50000, false);


        Employee empObj3 = new Employee();
        empObj3.setInfo("Naz", 'M', 18, 90000, true);



        Employee[] arr = {empObj1, empObj2, empObj3};

        int numberOfFullTime = 0;
        int max = arr[0].salary;
        int min = arr[0].salary;

        for (Employee employee : arr) {
            if (employee.isFullTime == true){
                numberOfFullTime++;
            }
            if (employee.salary > max){
                max = employee.salary;
            }
            if (employee.salary < min){
                min = employee.salary;
            }
        }
        System.out.println("How many people have full time job? - " + numberOfFullTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}