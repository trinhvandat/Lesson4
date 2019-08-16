package Ls4;

import java.util.Scanner;

public class If1 {
    Scanner inp = new Scanner(System.in);
    public int a,b;
    public float x;
    public void Cal(){
        char c;
        System.out.println("Nhap a , b va toan tu : ");
        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.next().charAt(0);
        if( c == '+') x = a + b;
        if( c == '-') x = a - b;
        if( c == '*') x = a * b;
        if( c == '/') x = (float) a / b;
        System.out.println("x = " + x);
    }
}
