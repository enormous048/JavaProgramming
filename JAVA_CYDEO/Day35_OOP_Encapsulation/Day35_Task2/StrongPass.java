package Day35_OOP_Encapsulation.Day35_Task2;

public class StrongPass {
    private String username, password;


    public StrongPass(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public boolean isStrong(){
        boolean result = false;


        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        boolean b1 = false;


        if (password.length()>=8 && !password.contains(" ")){
            b1 = true;
        }
        for (int i = 0; i <= password.length()-1; i++) {
            if(Character.isLetter(password.charAt(i))){
                hasLetter = true;
            }
            if(Character.isDigit(password.charAt(i))){
                hasDigit = true;
            }
            if(!Character.isLetterOrDigit(password.charAt(i))){
                hasSpecialChar = true;
            }
        }

        if (hasDigit && hasLetter && hasSpecialChar && b1){
            result = true;
        }
        return result;

    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        if (isStrong() == false){
            System.out.println("Your password is not strong.");
            return;
        }
        this.password = password;
    }


    public String toString() {
        return "StrongPass{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
