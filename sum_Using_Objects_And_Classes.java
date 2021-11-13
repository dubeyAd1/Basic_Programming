package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

class Main { int a,b ;
 void getdata ()
 { System.out.println ("Enter the first number");
 Scanner sc = new Scanner(System.in);
 a=sc.nextInt();
     System.out.println("Enetr the second number");
     b = sc.nextInt();
 }

 void putdata ()
 {
     System.out.println("Addition = "+(a+b));

 }

 public static void main (String []a){
     Main aa = new Main ();
     aa.getdata();
     aa.putdata();




 }
 }

