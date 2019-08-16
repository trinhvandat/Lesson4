package Ls4;

import java.util.Scanner;

public class If3 {
    public int x;
    Scanner inp = new Scanner(System.in);
    public void Cal(){
        System.out.println("Nhap so luong dien tieu thu : ");
        x = inp.nextInt();
        int p;
        int a = 50 * 550;
        int b = a + 50 * 850;
        int c = b + 100 * 1200;

        if( x <= 50 ) p = x * 550;
        else if( x <= 100 ) p = a + ( x - 50 ) * 850;
        else if( x <= 200 ) p = b + ( x - 100 ) * 1200;
        else p = c + ( x - 200 ) * 1500;
        System.out.println("So tien = " + p);
    }
}
