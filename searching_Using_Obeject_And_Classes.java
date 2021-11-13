package com.company;
import java.util.Scanner;

 class Main {
     int a[] = new int[5];
       int key = 4 ; ;

     void getdata() {
         Scanner sc = new Scanner(System.in);
         for (int i = 0; i < 5; i++) {
             System.out.println("Enter the values = ");
             a[i] = sc.nextInt();
         }
     }
         void putdata () {
         int i = 0 , flag=0 , pos =0;
         for (i=0;i<5 && flag==0;i++) {
             if (a[i] == key) {
                 flag = 1;
                 pos = i + 1;

             }
         }

             if (flag == 1)
                 System.out.println("Number found at = " + pos);
              else System.out.println("Number not found !!!");

        }



     }

 class demo {
     public static void main (String args []){
         Main aa = new Main ();
         aa.getdata();
         aa.putdata();
     }
 }