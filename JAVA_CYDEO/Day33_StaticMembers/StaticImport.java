package Day33_StaticMembers;

import static utilities.MathUtility.maxOfTwo; //if we dont need all methods from utility we can do static import

public class StaticImport {

    //regular import : imports everything from a package/class
    //import packageName.className
    //import packageName.*


    //static import : imports only static members from a class
    //import packageName.className.staticMember
    //import packageName.className.*


    //we can use static import when we need only static members.
    //the advantage is that after import you dont need to call statics by className anymore


    public static void main(String[] args) {
        int max = maxOfTwo(12, 22); //here we dont give className anymore

    }
}
