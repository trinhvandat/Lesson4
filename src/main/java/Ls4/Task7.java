package Ls4;

import java.util.Scanner;

public class Task7 {
    public float x,y,kc;
    Scanner inp = new Scanner(System.in);
    public void Cal(){
        System.out.println("Nhap toa do : ");
        x = inp.nextFloat();
        y = inp.nextFloat();
        kc = (float)Math.sqrt( x*x + y*y );
        if(kc==1) System.out.println("Nam trong hinh tron");
        else System.out.println("Ko nam trong hinh tron");
    }
}
