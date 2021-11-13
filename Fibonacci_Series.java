package com.company;
import java .util.Scanner;
public class Main {

    public static void main(String[] args) {
	int x=0 , y=1 , z=0,n;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the maximum number : ");
	n=sc.nextInt();
	while (z<=n){System.out.println("Fibonacci series is ::"+z);
	   x=y;
	   y=z;
	   z=x+y;


    }
    }
}
