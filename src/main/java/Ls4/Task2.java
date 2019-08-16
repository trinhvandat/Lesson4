package Ls4;

import java.util.Scanner;

public class Task2 {
    public int a,b,c;
    public float x1,x2;
    public void Cal(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 2\nNhap he so a , b va c :");
        a= inp.nextInt();
        b= inp.nextInt();
        c= inp.nextInt();
        int del = b*b - 4*a*c;
        if(del<0) System.out.println("Vo nghiem");
        if(del==0) {
            x1= (float) - b / (2 * a);
            System.out.println("Co 1 nghiem : " + x1);
        }
        if(del>0){
            x1= (float) ( -b + Math.sqrt (del) ) / (2*a);
            x2= (float) ( -b - Math.sqrt (del) ) / (2*a);
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        }

    }
}
