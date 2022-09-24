package Day37_Inheritance_Super;


class A{
    public A(){
        System.out.println("A");
    }
}


class B extends A{
    public B(){
        //Here it is implicitly called super(); keyword //prints A
        System.out.println("B");                        //prints B
    }

}




public class ConstructorPractice {

    public static void main(String[] args) {
        B b = new B(); //як тільки створив обьєкт то констактор виконався, тому не треба нічо принтувати
                       // it is automatically executed when you create object


    }
}
