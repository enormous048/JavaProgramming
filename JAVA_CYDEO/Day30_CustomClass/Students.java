package Day30_CustomClass;

public class Students {

    public String name;
    public int grade;
    public int age;
    public int id;


    // this keyword: is used for calling the instance variable. (especially when the local variable shares the same name)
    public void setInfo(String name, int grade, int age, int id) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.id = id;
    }
    //if the parameter's variable share the same name with instance variable we can use this. keyword
    //як тільки ти викликаєш this. то компайлер розуміє шо ти звертаєшся до інстанс веріабл а не до параметер веріабл.


    //generate -> Constructor > cntrl and check all > OK    -- this shortcut will make setInfo method

    public void code(){
        System.out.println(name + " is coding.");
    }

    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
