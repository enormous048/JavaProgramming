package Day10_Ternaries.Day10_Task;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 25;
        String result = "";

        if (age > 0 && age < 150){
            if (age < 18){
                result = "Teenager";

            } else if (age >=21 && age <55 ) {
                result = "Adult";
                
            }else {
                result = "Senior";
            }


        }else {
            result = "Invalid age group";
        }
        System.out.println(result);




    }
}
