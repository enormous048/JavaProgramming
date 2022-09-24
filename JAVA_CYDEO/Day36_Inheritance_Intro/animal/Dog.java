package Day36_Inheritance_Intro.animal;

public class Dog extends Animal{ // Dog is an Animal

    //якшо заімпортити а не заінхеритити то дог не буде мати своїх нейм брід і тд, а буде юзати проперті енімал класу.
    //import: borrowing
    //inherit: own


    public Dog(String name, String breed, String color, char gender, int size, int age) {
        super(name, breed, color, gender, size, age);
    }

    //сприймай це так ніби тут створені всі методи які є в перент класі.
    public void bark(){
        System.out.println( name + "is barking.");
    }
}

/*
Dog has 6 variables, 4 methods inherited, 1 created;  total 6 fields, 5 methods
*/