
import java . util. Scanner ;
 class Student {
     int a, b;
     Student ()
     {a=0;
     b=0;
     }
 Student (int x , int y)
 {
     a=x;
     b=y;
 }
 void getdata ()
 {
     Scanner sc = new Scanner (System.in) ;
     System.out.println("1st number");
     a=sc.nextInt();
     System.out.println("2nd number");
     b=sc.nextInt();

 }
 void display ()
 {
     System.out.println("a= "+a+"  b= "+b);
 }
 void putdata ()
 { int c = a+b ;
     System.out.println("Addition= "+c);

     }
     public static void main (String []a)
     {
         Student aa = new Student (5,10);
         Student bb = new Student ();
         aa.display();
         aa.putdata();
         bb.getdata();
         bb.putdata();
         bb.putdata();


     }
 }
