package Day36_Inheritance_Intro.animal;

public class Zoo {
    //Робим те саме шо вже робили, створюєм обьект класу.
    //Сприймай чайлд класи як раніше звичайні класи - просто тепер легше надати спільні фічурс в перент класі.


    public static void main(String[] args) {
        Dog dog = new Dog("Baki", "Haski", "White", 'M', 12, 18);
        dog.eat();
        dog.bark();
      //  dog.scratch();  no relation between cat and dog

        Cat cat = new Cat("Murr", "UFO", "Black and White", 'M', 5, 12);
        cat.scratch();

        Fish fish = new Fish("Goldy", "gold fish", "golden", 'F', 1, 3);
        fish.swim();

    }
}
