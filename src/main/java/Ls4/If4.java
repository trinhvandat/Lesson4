package Ls4;

import java.util.Scanner;

public class If4 {
    public int a,b,c;
    Scanner inp = new Scanner(System.in);
    public void Cal(){
        System.out.println("Nhap do dai 3 canh : ");
        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextInt();
        if( ( a+b > c ) && ( a+c > b ) ) {
            if( a == b && a == c ) System.out.println("Tam jac deu");
            else if( (a==b && a*a + b*b == c*c ) || (a==c && a*a + c*c == b*b) || (c==b && c*c + b*b == a*a) )
                System.out.println("Tam jac vuong can");
            else if( a==b || b==c || a==c ) System.out.println("Tam jac can");
            else System.out.println("Tam jac thuong");
        }
        else System.out.println("Ko la tam jac");
    }
}
