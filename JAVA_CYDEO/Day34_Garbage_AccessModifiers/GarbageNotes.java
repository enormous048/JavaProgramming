package Day34_Garbage_AccessModifiers;

public class GarbageNotes {

    //Garbage collection is a process of destroying objects that are no longer needed

    //every object has finalize method, and jvm periodically runs collector, and if object is unreferenced that finalize method destroys it

    //Unreferenced objects:
    //Dog d = new Dog();
    //d = null; //null can only be used in non primitives/ empty string is object, but null means nothing at all

    //Dog d1 = new Dog();
    //Dog d2 = new Dog();
    //d1 = d2; //here first object is available fot collector


    //d, d1, d2 are reference names so by nulling or by changing reference to another object, the previous objects become unreferenced
}
