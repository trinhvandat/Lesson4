package Ls4;

import java.util.Scanner;

public class Task4 {
    public int a,b,c,d;
    Scanner inp = new Scanner(System.in);
    public void Cal(){
        System.out.println("Nhap a , b , c , d : ");
        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextInt();
        d = inp.nextInt();
        int Max,Min,e,f;
        e = Math.max(a,b);
        f = Math.max(c,d);
        Max = Math.max(e,f);
        e = Math.min(a,b);
        f = Math.min(c,d);
        Min = Math.min(e,f);
        /* e nghi lam vong for se lau hon */
        System.out.println("Max = " + Max);
        System.out.println("Min = " + Min);
    }
}
