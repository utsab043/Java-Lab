# LAB-1: DATA TYPES AND ARRAY IN JAVA

## THEORY:

## DATA TYPES
Data tyes specifies the different sizes and values that can be stored in the variable.It is of two types:

* **Primitive data types**: It includes:
#### 1. Integer
Integer types can hold whole numbers such as 123 and -96. The size of the values that can be stored depends on the integer type that we choose.

* **byte data type: size =1 byte,Range of values that can be stored=-128 to 127**
* **short data type: size=2 byte,Range of values that can be stored=-32768 to 32767**
* **int data type: size=4 bytes,Range of values that can be stored=-2,147,483,648 to 2,147,483,647**
* **long data type: size=8 bytes,Range of values that can be stored=9,223,372,036,854,775,808 to
                  9,223,372,036,854,755,807**

#### 2. Floating Point
Floating point data types are used to represent numbers with a fractional part. Single precision floating point numbers occupy 4 bytes and Double precision floating point numbers occupy 8 bytes. There are two subtypes:

		 
* **float data type: size=4 bytes,Range of values that can be stored=3.4e-038 to 3.4e+038**
* **double data type: size=8 bytes,Range of values that can be stored=1.7e-308 to 1.7e+038**

#### 3. Character
It stores character constants in the memory. It assumes a size of 2 bytes, but basically it can hold only a single character because char stores unicode character sets. It has a minimum value of ‘u0000’ (or 0) and a maximum value of ‘uffff’ (or 65,535, inclusive).

#### 4. Boolean
Boolean data types are used to store values with two states: true or false.

* **Non-primitive data types** : It includes:
#### 1. classes 
#### 2. Interfaces
#### 3. Arrays

## ARRAY
An array is a collection of similar type of elements which have a contiguous memory location.It is of two type:
* Single Dimensional Array
* Multidimensional Array

### Example:
int a[]=new int[2];//declaration and instantiation of single dimensional array

int[][] arr=new int[3][3];//declaration and instantiation of multidimensional array

# CODE FOR IMPLEMENTATION OF ARRAY

## Single Dimensional Array

```javascript
class Testarray{  
public static void main(String args[]){  
int a[]={33,3,4,5};
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
}} 
``` 
### Output:
33
3
4
5

## MultiDimensional Array

```javascript
class Testarray{  
public static void main(String args[]){  
//declaring and initializing 2D array  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
}}  
```
### Output:
1 2 3
2 4 5
4 4 5
