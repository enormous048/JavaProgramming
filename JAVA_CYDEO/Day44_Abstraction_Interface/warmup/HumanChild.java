package Day44_Abstraction_Interface.warmup;

public final class HumanChild implements Playable{ //інтерфейс можуть юзати і класи які не є австракт класи чи сабкласи


    private int age;
    private final char gender;

    public HumanChild(int age, char gender) {
        setAge(age);
        if (gender != 'M' && gender!= 'F'){
            throw new RuntimeException("Invalid gender");
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new RuntimeException("Invalid age");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void play(){
        System.out.println("Human child is playing.");
    }
}
