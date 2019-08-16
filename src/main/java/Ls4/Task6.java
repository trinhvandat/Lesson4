package Ls4;

import java.util.Scanner;

public class Task6 {
    Scanner inp = new Scanner(System.in);
    public float x1,y1,x2,y2;
    public void Cal(){
        System.out.println("Toa do A = ");
        x1 = inp.nextFloat();
        y1 = inp.nextFloat();
        System.out.println("Toa do B = ");
        x2 = inp.nextFloat();
        y2 = inp.nextFloat();
        float kc;
        kc = (float) Math.sqrt ( Math.pow ( x2-x1 , 2 ) + Math.pow ( y2-y1 , 2 ) );
        System.out.println("Khoang cach AB = " + kc);
    }
}
