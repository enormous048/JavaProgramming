package Day52_Interface_Lambda;

@FunctionalInterface
public interface MySecondFuncInterface<T> {

    //if we wanna work not only with one data type in parameter then upper we give generic type <T>

    //later if you pass to method a string then T changes to String, int and so on.

    void test(T t);


}
