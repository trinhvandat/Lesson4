package Ls4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public int n;
    public void Cal(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Nhap nam n = ");
        n = inp.nextInt();
        if( n%400 == 0 || (n%4==0 && n%100 != 0)) System.out.println("366");
        else System.out.println("365");
    }
}
