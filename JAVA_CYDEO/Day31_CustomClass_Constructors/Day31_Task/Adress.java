package Day31_CustomClass_Constructors.Day31_Task;

public class Adress {

    public String street;
    public String city;
    public String state;
    public int buildingNum;

    public int zip;

    public Adress(String street, String city, String state, int buildingNum, int zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.buildingNum = buildingNum;
        this.zip = zip;
    }

    public String toString() {
        return buildingNum +" "+ street+
                "\n" + city + " "+state +" "+zip;
    }
}
