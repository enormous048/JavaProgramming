package Day42_Exceptions_Throw;



class CustomException extends RuntimeException { //if you wanna create unchecked exception

    public CustomException() {
        System.out.println("Custom exception");
    }

    public CustomException(String str) {
        super(str);
    }


}


public class TestException {

    public static void main(String[] args){

        throw new CustomException("Time for a break");

    }
}