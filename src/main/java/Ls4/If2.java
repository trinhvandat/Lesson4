package Ls4;

import java.util.Scanner;

public class If2 {
    public int x;
    Scanner inp = new Scanner(System.in);
    public void Cal(){
        System.out.println("Nhap vao 1 ngay trong thang 3 : ");
        x = inp.nextInt();
        int n = ( x - 1 ) % 7;
        if( n==0 ) System.out.println("Thu 7");
        if( n==1 ) System.out.println("Chu nhat");
        if( n==2 ) System.out.println("Thu 2");
        if( n==3 ) System.out.println("Thu 3");
        if( n==4 ) System.out.println("Thu 4");
        if( n==5 ) System.out.println("Thu 5");
        if( n==6 ) System.out.println("Thu 6");
    }
}
