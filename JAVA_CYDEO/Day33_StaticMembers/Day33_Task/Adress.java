package Day33_StaticMembers.Day33_Task;

public class Adress {
    public String  street, city, state;
    public int zipCode;

    public static String country = "USA",
            planet = "Earth";

    public Adress(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return  street + '\n' +
                 city + " "+state +" "+ zipCode;
    }
}
