package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int len,bre,area,perim ;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the value of len");
        len=a.nextInt();
        System.out.println("enter the value of bre");
        bre=a.nextInt();
        area=len*bre;
        System.out.println("The area is "+area);
        perim=2*(len+bre);
        System.out.println("the perimeter is "+perim);


    }
}
