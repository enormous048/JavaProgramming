package Day44_Abstraction_Interface.warmup;

public abstract class Animal {
    //abstract class cannot be final
    //abstract class - is not concrete(cannot create objects)

    private final String breed, color;
    private int age;
    private final char gender;
    private String name;
    public final static boolean isAlive = true;
    //кожен обьєкт шейрить одну версію(статік) і її не можна змінити(файнал).(завдяки паблік інхериться до всіх сабкласів)

    public Animal(String breed, String color, int age, char gender, String name) {

        if (breed.isEmpty() || color.isEmpty()){
            throw new RuntimeException("Invalid breed or color");
        }
        this.breed = breed;
        this.color = color;
        setAge(age);
        if (!(gender=='M' || gender=='F')){
            throw new RuntimeException("Invalid gender");
        }
        this.gender = gender;
        setName(name);
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new RuntimeException("Invalid name");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public final void drink(){
        System.out.println(name + " drinks water.");
    }
    public abstract void eat();

    public String toString() {
        return getClass().getSimpleName()+"{" +       //щоб не писало енімал кожен раз, гетКлас().гетНейм()  щоб визвати імя класу для певного обьєкта
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
