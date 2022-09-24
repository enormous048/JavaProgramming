package Day44_Abstraction_Interface.warmup;

public final class Parrot extends Animal implements Flyable, Playable{

    public Parrot(String breed, String color, int age, char gender, String name) {
        super(breed, color, age, gender, name);
    }

    public void play(){
        System.out.println("Parrot is playing with you.");
    }

    public void fly(){
        System.out.println(getName() + " flies fast but not highly.");
    }

    public void eat(){
        System.out.println(getName() + " eats parrot food.");
    }

    //Маєм лише один метод флай замість того шоб створювати в кожному класу по одному флай методі.
    //Так само якшо поставим в перент класі флай() то кожен сабклас буде мати свою версію методу флай.

}
