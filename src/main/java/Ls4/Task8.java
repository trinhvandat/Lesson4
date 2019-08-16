package Ls4;

import java.util.Scanner;
//import java.lang.string;


public class Task8 {
    Scanner inp = new Scanner(System.in);
    public void Cal(){
        System.out.println("Nhap vao 1 ky tu : ");
        char c = inp.next().charAt(0);
        if( c >= '0' && c <= '9') System.out.println("Chu so");
        else{
            if( ( c >= 'a' && c <= 'z' ) || ( c >= 'A' && c <= 'Z' )) System.out.println("Chu cai");
            else System.out.println("ky tu");
        }
    }
}
