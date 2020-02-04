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
int n1=l1.nextInt();
int n2=l1.nextInt();
Pranay l=new Pranay();
Accessing l2=new Accessing();
Data2 l3=new Data2();
l.hello();
l.price(n1,n2);
l.price(n1,n2,10.0);
l2.access();
l3.hello();
}
}
