package Day30_CustomClass;

//access modifier   class keyword   class name {}
public class Dog {
    public String name;
    public String breed;
    public String color;
    public char gender;
    public int age;
    public int mass;

    public void play(){
        System.out.println(name + " is playing!");
    }
    public void eat(){
        System.out.println(name + " is eating!\nMass is " +mass +" kg.");
    }


    public void setInfo(String nameObj, String breedObj, String colorObj, int ageObj, int massObj, char genderObj){
        name = nameObj;
        breed = breedObj;
        color = colorObj;
        age = ageObj;
        mass = massObj;
        gender = genderObj;
    }//для кожного обьекта існує своя копія цього методу тому в філди запихається інфа від різних обєктів

    //if we wanna print the object(dogObj1) in the main method, we should add toString method HERE in this class
    // right click -> generate -> toString() -> uncheck insert Override

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", mass=" + mass +
                '}';
    }


    //Before creating class for objects you need to determine which attributes/fields and actions each object should have

}
