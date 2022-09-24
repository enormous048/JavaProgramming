package Day40_Protected_Final;

public class EncapsulationReview {

    //Encapsulation: data hiding
    //               give private access modifier to fields
    //               generate public getters and setters to read/write private fields

    private String str;

    public String getStr(){
        return str;
    }
    public void setStr(String str){
        this.str = str;
    }


    //Inheritance: IS A relations
    //             child class: inherits variables and methods that are visible from parent
    //             parent class: doesnt inherit anything from child
}
