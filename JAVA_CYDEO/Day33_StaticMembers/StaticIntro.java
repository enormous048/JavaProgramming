package Day33_StaticMembers;

public class StaticIntro {
    //instance - every object has its own copy of fields;

    //static member - every object share the same version of static variable or method.


    //It can be called through className, and there is only one copy of static shared for every object.
    //If there is a change in statics, then this change will affect all objects.
    //Static methods only accepts static variables and doesn't accept instances.



    //Instances belongs to the objects an every object has access to the class.
    //Statics belong to the class and they dont have access to objects.

    //Thats why static method dont take instances but instance methods could take statics.
}

//When deciding in choosing between instances and statics, ask yourselves whether each object should have different
// version of fields or the same version.