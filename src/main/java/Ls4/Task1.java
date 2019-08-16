package Ls4;

import java.util.Scanner;

public class Task1 {
    public int a,b;
    public float x;
    public void Cal(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 1\na = ");
        a = inp.nextInt();
        System.out.println("b = ");
        b = inp.nextInt();
        x= (float)-b/a;
        System.out.println("x = "+ x);
    }
}
