package Day3_EscapeSequence;

class Day3_EscapeSequence {
    public static void main1() {
        System.out.println("Name\n \nGender\n \nCity\n \ndate of birth\n \nSSN");
        // просто System.out.println() без велью всередині - воно зробить тіпа як спейс, проте не треба тратити роботу компайлера пишучи спейс і квоутс в принті
        // cntr alt L   = code formatting for taking away mess
        // windows R +  %temp%   delete temp files to increase performance
        //
        // System.err.println  - використовуться зазвичай для принту помилок і принтиться червоним кольором
        // serr + Enter - шорткат ждя визову цієї команди
        // sout + Enter - shortcut for sysoutprnt
    }

    public static void main2() {
        // \n  starts a new line
        // \t  tab
        // \\  in order to print one backslash(\) we need to print 2 backslashes(\\)
        // \" \"  one or two quotes inside quotes


        System.out.println("/  \\\\");
    }

    public static void diamonds() {
        System.out.println("\t^\n   / \\\n  /   \\\n /     \\\n/       \\\n---------\n\\       /\n \\     /\n  \\   /\n   \\ /\n\tv");
        System.out.println();
        System.out.println("\t^\n   / \\\n  / * \\\n / *** \\\n/ ***** \\\n---------\n\\ ***** /\n \\ *** /\n  \\ * /\n   \\ /\n\tv");
        //Легше буде в цьому завданні пару раз саут писати та видно кут просто ше коли пишеш код
    }


    public static void main(String[] args) {
        diamonds();
    }


}

