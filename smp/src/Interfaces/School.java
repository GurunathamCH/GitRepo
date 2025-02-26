package Interfaces;

public interface School {
/*
 * 
 * An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. 
 * An interface in Java is a blueprint of a behavior. 
 * A Java interface contains static constants and abstract methods.
 * 
 * 
 Uses of Interfaces in Java
Uses of Interfaces in Java are mentioned below:


It is used to achieve total abstraction.
Since java does not support multiple inheritances in the case of class, by using an interface it can achieve multiple inheritances.
Any class can extend only one class, but can implement multiple interfaces.
It is also used to achieve loose coupling.
Interfaces are used to implement abstraction. 
 
 *
 
 interface {
    // declare constant fields
    // declare methods that abstract 
    // by default. 
     * 
     *   
     Relationship Between Class and Interface
A class can extend another class, and similarly, an interface can extend another interface. However, only a class can implement an interface, 
and the reverse (an interface implementing a class) is not allowed.
*********Class to Interface Inheritance is not possible******
     *   
}
 */
	final String SchoolName="ITC";
	void Activity();
	public abstract void Classes();
	
	
}
