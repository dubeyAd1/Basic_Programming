package com.company;
import java .util.*;


 class Main {


    public static void main(String[] args) {
        int a, b , ch ;
       Scanner Sc= new Scanner (System.in);

       System.out.println("Enter the first number");
        a=Sc.nextInt();
        System.out.println("Enter the second number");
        b=Sc.nextInt();
        System.out.println("enter your choice 1->Addition 2-> subtraction 3-> multiply 4-> divide \n Enter your choice");
        ch= Sc.nextInt();
       switch (ch) {
           case 1:
               System.out.println("addition=" + (a + b));
           case 2:
               System.out.println("subtraction = " + (a - b));
           case 3:
              System.out.println("multilication="+(a*b));


           case 4:
               System.out.println("divide="+(a/b));

           default:
               System.out.println("Invalid choice");


       }}}
