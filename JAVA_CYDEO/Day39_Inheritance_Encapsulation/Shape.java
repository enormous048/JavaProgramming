package Day39_Inheritance_Encapsulation;

public class Shape {
    private String name;


    public Shape(String name) {
        setName(name);
    }

    public String getName(){
        return name;
    }
    public void setName(String  name){
        if (name.isEmpty()){
            return;
        }
        this.name = name;
    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }


    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
