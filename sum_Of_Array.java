package com.company;

        import java . util.*;
class demo{
public static void main (String args [])
{Scanner sc = new Scanner (System.in);
int  []a = new int [10];int sum=0;
for (int i =0;i<10;i++)
{
    System.out.println("Enter the number");
    a[i]=sc.nextInt();
}
for (int i = 0; i<10;i++) {
    sum = sum + a[i];
}
    System.out.println("Sum of the array is = "+sum);
}
}