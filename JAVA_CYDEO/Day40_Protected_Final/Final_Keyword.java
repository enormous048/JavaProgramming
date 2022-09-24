package Day40_Protected_Final;

public class Final_Keyword {


    //Final variable becomes a constant.
    //We can not reassign or modify a final variable, prints compiler error if we trying to reassign

    //Final Methods: Implementation of the method becomes unchangeable
    //Final methods can not be overridden


    //Final class is a class that can not be extended

    public final static double pi = 3.14;//якшо якась веріабл ніколи не міняється то вона має бути файнал
    //Static could be reassigned later in class, but final no.
    final String dataOfBirth;
    final String firstProgrammingLanguage;

    //Якшо файнал веріабл ще не есайнута, то вибє помилку якшо поряд не буде констрактора
    public Final_Keyword(String dataOfBirth, String firstProgrammingLanguage) {
        this.dataOfBirth = dataOfBirth;
        this.firstProgrammingLanguage = firstProgrammingLanguage;
    }
}
