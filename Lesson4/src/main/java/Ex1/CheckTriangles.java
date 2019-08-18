package Ex1;

import java.util.Scanner;

public class CheckTriangles {
    private int a, b, c;
    public void Check(){
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if( b < (a + c) && a < ( b + c ) && ( c < (a + b) )){
            float results;
            float p = (a + b + c) / 2;
            results = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Yes! S = " + results);
        }
    }
}
