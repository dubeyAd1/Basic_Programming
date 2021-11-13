package com.company;
import java .util.Scanner;
public class Main {

    public static void main(String[] args) {
        int i , x ,y, pro=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base::");
        x= sc.nextInt();

        System.out.println("Enter the power::");
        y= sc.nextInt();
        for (pro=1;y>0;y=y-1)
        {pro=pro*x;

        }System.out.println(pro);
    }}
