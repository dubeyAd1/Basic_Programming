package com.company;
import java.util.Scanner;
 class Main {

     public static void main(String[] args) {
         int a, b, ch;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first number");
         a = sc.nextInt();
         System.out.println("Enter the second number");
         b = sc.nextInt();
         System.out.println("enter your choice 1 -> addition 2-> subteraction 3-> multiply 4-> divide ");
         ch= sc.nextInt();
         if(ch==1)
         System.out.println("Addition="+(a+b));
         else if (ch==2)
             System.out.println("Subtraction="+(a-b));
         else if ( ch ==3)
             System.out.println("multiplication="+(a*b));
         else if (ch==4)
System.out.println("Divide="+(a/b)) ;
         else
             System.out.println("invalid choice");





     }}