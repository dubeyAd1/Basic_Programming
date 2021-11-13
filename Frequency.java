package com.company;
import java . util . Scanner ;

public class Frequency {
    int[] a = new int [10];
    int Key,i ;
    Scanner sc = new Scanner(System.in);
    void input ()
    { for (i=0;i<10;i++){
        System.out.println("Enter the number of arrays = ");
        a[i]= sc.nextInt();

    }
        System.out.println("Enter the number to be counted = ");
    Key = sc.nextInt();
    }
    void count ()
    { int count =0 ;
        for (i=0;i<10;i++)
        {
            if (a[i]==Key)
                count = count +1 ;
        }
        System.out.println("THE FREQUENCY OF THE REQUIRED NUMBER IS = " + count );
    }

}    class Frequency2 {
     public static void main (String[] a){
         Frequency aa = new Frequency ();
         aa.input();
         aa.count();

    }
}
