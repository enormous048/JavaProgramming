package Day35_OOP_Encapsulation.encasulation;

public class Person {
    //Developers used to make all instances private, so now we will be using only private for access modifier.
    //Нема нічого складного в геттер і сеттер - просто всередині класу можна дістати приватки, а за межами не можна.

    private String name;
    private int age;
    //With public instances you don't have control: for example age could be 20000, but setAge can provide restriction 0< &&>120


    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    //Return type must match with private variable type
    public String getName(){
        return name;
    }
    //Parameter type must match with private variable type.
    public void setName(String name){
        if (name.equals("")){
            System.out.println("Invalid name");
            System.exit(0);
        }
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<=0 || age>=120){
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age = age;
    }





}
