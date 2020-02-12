# LAB 3: TYPES OF VARIABLES, INHERITANCE AND ABSTRACT CLASS

# THEORY:

## VARIABLE

Variables are the name given to a memory location which hold the values while the program  is executed.

## TYPES OF VARIABLES

* Local Variable
A variable defined within a block or method or constructor is called local variable.

* Instance Variable
Instance variables are non-static variables and are declared in a class outside any method, constructor or block.These variables are created when an object of the class is created and destroyed when the object is destroyed.

* Static Variable
These variables are declared similarly as instance variables, the difference is that static variables are declared using the static keyword within a class outside any method constructor or block.
You can create a single copy of static variable and share among all the instances of the class.

### Implentation of types of Variables

```javascript
class variable{
	int data=43;//instance variable
	static int a=39;//static variable
	public void variables(){
	int b=42;//local variable
	System.out.println("local variable is : " + b);
    System.out.println("instance variable is : " + data);
    System.out.println("static variable is : " + a);
}
    public static void main(String[] args) {
    	variable obj = new variable();
    	obj.variables();
    }
}
```
## INHERITANCE IN JAVA

Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.

### SYNTAX

```javascript
class Subclass-name extends Superclass-name  
{  
   //methods and fields  
}  
```
## TYPES OF INHERITANCE

* Single Inheritance
* Multilevel Inheritance
* Hierarchical Inheritance
*
*
