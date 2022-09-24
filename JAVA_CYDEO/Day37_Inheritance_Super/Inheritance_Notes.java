package Day37_Inheritance_Super;

public class Inheritance_Notes {

    //Child must call parent constructor, it is implicitly called if parent constructor is default.
    //If parent constructor is not default, child MUST call it with super keyword.

    //Super keyWord is similar to this() when there is more than one constructor in the same class.
    //But when its child class then we use super() it is referencing to parent class constructor.
    //super.  : calls variables and other methods of super class.
    //super() : calls constructor of super class.


    //Types of Inheritance:
    //1. Single inheritance - one child class extends parent class.
    //2. Hierarchical inheritance - more than one child class extends parent class.
    //3. Multi-Level inheritance - child class extends parent class, and parent class extends grandparent.
    //4. Mixed - hierarchical to parent class but single to grandparent..

    //Child class cannot extend more than one parent class.(Multiple)
}
