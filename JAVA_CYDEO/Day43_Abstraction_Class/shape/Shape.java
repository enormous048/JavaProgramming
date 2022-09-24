package Day43_Abstraction_Class.shape;

public abstract class Shape {
    //Тепер перент клас можна кожен раз абстрактом робити, шоб потім коли буде метод для оверрайду - шоб не треба було боді давати
    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Name can not be empty.");
        }
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();


}
