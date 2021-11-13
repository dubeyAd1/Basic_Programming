import java . util.*;
public class demo
{ int a , b ;
    void input ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number = ");
        a= sc.nextInt();
        System.out.println("enter the second number=");
    }
}
class demo2 extends demo
{
    void display ()
    {
        System.out.println("Addition = " +(a+b));

    }
}
class demo3 extends demo {
    void putdata ()
    {
        System.out.println("subtraction = "+(a-b));
    }
}