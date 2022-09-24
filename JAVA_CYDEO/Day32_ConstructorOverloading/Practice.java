package Day32_ConstructorOverloading;

public class Practice {

    public Practice(){
        System.out.println("Default constructor");//outputs text
    }

    public Practice(int parameter){
        this();//outputs "Default constructor"
        System.out.println("Constructor with int parameter"); //outputs text
    }

    public Practice(String par){
        this(12); //calls constr with int parameter; and constr with int parameter calls default constr
        System.out.println("String parameter");//outputs text
    }
}
