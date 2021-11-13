package com.company;
import java . util.Scanner;
public class Main
{

    public static void main(String[] args) {
	int a []= new int [10];
	int key = 5 ,pos=0,flag=0;
	Scanner sc = new Scanner (System.in);
	for (int i =0;i<10;i++){
	 System.out.println("Enter the number = ")  ;
	 a[i]=sc.nextInt();

    }for (int i=0 ;i<10&&flag==0;i++){
	    if (a[i]==key)
	    {
	        flag=1;
	        pos=i+1;
        }
	}
	   if (flag==1)
           System.out.println("The number is at = "+pos);
	   else
           System.out.println("No. not found ");
        }

}

