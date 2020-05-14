# This is an example Java project created via STS as a Java Project, utilizing:

- Generic Interface(MyGenInterface)
- Generic Class(MyGenCLass)
- Regular Class(My RegularClass)
- A static MainEntry(MainEntry)

************************************************************************************
##You must have Spring Tool Suite installed, as well as the latest version of java jdk.
************************************************************************************

## How to import, and run project
- First, copy the github url of the rmeote project by going to the github link
- Then, copy the URL.
- On STS, go to File->import->Git->Project from Git
- click next
- click clone URL
- click NExt
- click Next
- choose remote branch
- click next
- choose "Destination" "Directory" for the project to be created in
- click Finish

## To run
In STS, click on this project Run As ->JavaApplication(select MainEntry)

# Explanation of code

### MyGenInterface
- This interface takes 2 genertic types K,V, with the below methdos:
 - public K getKey();
 - public v getValue();



### MyGenClass
- This class implements the "MyGenInterface" interface
 - It has attributes "K key" and "V value" that can be inherited
 - It has a constructor that takes "K _key", "V _value" inputs and initializes "key", "value" attributes
 - It has implementation of "getKey" and "getValue" methods, returning "key" and "value" respectively

### MyRegularClass

- This class is a regular class with a public static generic method called getSum
 - getSum takes T generic class that can be the children of java's Number class
 - getSum takes 2 inputs of "T inp1", "T inp2"
 - getSum returns type T inp1

### MainEntry
- Has a static main method
 - In the main method, the following local variables are made:
  - mgi1 of type MyGenInterface that takes Integer and String as K,V
  - mgi2 of type MyGenInterace that takes Integer and Integer as K,V
  - Initializses mgi1 to instance of MyGenCLass with inputs(1, "Mike")
  - Initializes mgi2 to instance of MyGenCLass with inputs(1,2017)
  - The integer i1 is set to return the value from MyRegularClass using getSum method passing (10,20)
  - Float f1 is set to return the value from MyRegularClass using getSum method passing (100f,200f)
 - In the main method, there is a System.out.println statement that prints key and value of mgi1 and mgi2 instances
 - In the main method, there is a System.out.println statement that prints i1 and f1.