import java.util.*;
abstract class Data1  // Abstract class 
{
abstract public void hello();
}

interface working // using the interface here
{
void access();
}

class Accessing implements working //Implementing the interface methods here
{
public void access()
{
System.out.println("The method in interface is accessed here."); //Printing the data
}
}


class Pranay extends Data1  //using of Encapsulation and inheritance is used to implement the abstract class.
{
public static int c =100;
public void price(int a,int b)
{
System.out.println("Encapsulation is used here "+(a+b+c));
}
public void price(int a,int b,double d)
{
System.out.println("Method Overloading is used here "+(a+b+c+d));
}
public void hello()
{
System.out.println("Hello World!");
}
}

class Data2 extends Data1
{
public void hello()
{
System.out.println("Hello , Welcome to my world of coding !"); //using of method overriding here
}
}



class Data
{
public static void main(String[] args)
{

Scanner l1=new Scanner(System.in);
int n1=l1.nextInt();   // Reading a value.
int n2=l1.nextInt();    // Reading another value.
Pranay l=new Pranay();   //Creating a object for Pranay class.
Accessing l2=new Accessing(); // Creating object for Accessing class.
Data2 l3=new Data2();  // Creating object for Data2 class.
l.hello(); // calling the hello method.
l.price(n1,n2); // calling the price method.
l.price(n1,n2,10.0); // Calling the price method to check method overloading.
l2.access(); //calling the access class to check method in interface is implemented or not.
l3.hello(); //calling the hello method for checking the method overriding.
}
}
