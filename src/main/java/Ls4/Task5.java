package Ls4;

import java.util.Scanner;

public class Task5 {
    public float a,b,c;
    Scanner inp = new Scanner(System.in);
    public void Cal(){
        System.out.println("Nhap do dai a ,b , c : ");
        a = inp.nextFloat();
        b = inp.nextFloat();
        c = inp.nextFloat();
        int kt=0;
        if( a+b > c && a+c > b ) kt=1;
        if( kt==0 ) System.out.println("ko la tam jac");
        else {
            System.out.println("la tam jac\n");
            float p,s;
            p = (a + b + c) / 2;
            s = (float) Math.sqrt( p * (p-a) * (p-b) * (p-c) );
            System.out.println("dien tich = " + s);
        }
    }
}
