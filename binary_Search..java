package com.packages;
import java . util . Scanner ;
public class binary_Search {
    int a[] = new int[10];
    int key;
    Scanner sc = new Scanner(System.in);


    void getdata() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the number = ");
            a[i] = sc.nextInt();
        }
        key = sc.nextInt();
    }
    void search (){
        int i , j , flag , mid , pos=0 ;
        i =0;
        j= 9;
        flag=0;
        while (i<=j&&flag==0){
            mid = (i+j)/2;
            if (a[mid] == key ){
                flag=1;
                pos=mid +1 ; }
            if (a[mid]>key){
                j=mid-1;
            }
            if (a[mid]<key){
                i=mid+1;
            }
        }
        if (flag==1)
            System.out.println("Number found at = "+ pos );
        else System.out.println("Number not found = ");
    }
}
class MAin2 {
    public static void main (String a []){
        binary_Search aa = binary_Search();
        aa.getdata();
        aa.search();
    }
}
