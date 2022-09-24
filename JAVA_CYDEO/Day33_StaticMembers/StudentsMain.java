package Day33_StaticMembers;

class Students {
    public String name;
    public char gender, grade;
    public int age, studentId;

    public Students(String name){
        this.name = name;
    }


    public Students(String name, char gender){
        this(name); //то то саме шо ми в мейн методі викликаєм по суті
        this.gender = gender;
    }
    public Students(String name, char gender, int age){
        this(name, gender);
        this.age = age;
    }
    public Students(String name, char gender, int age, int studentId){
        this(name, gender, age);
        this.studentId = studentId;
    }



    public Students(String name, int studentId){
        this(name);
        this.studentId = studentId;
    }
    public Students(String name, int studentId, char grade){
        this(name, studentId);
        this.grade = grade;
    }
    public Students(String name, int studentId, char grade, char gender){
        this(name, studentId, grade);
        this.gender = gender;
    }



    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", studentId=" + studentId +
                '}';
    }
}

public class StudentsMain{//not best practice to create different classes inside one file, its for sharing tasks

    public static void main(String[] args) {
        Students st = new Students("Naz", 'M', 18);

    }


}
