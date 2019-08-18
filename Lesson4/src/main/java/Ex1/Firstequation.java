package Ex1;

import java.util.Scanner;

public class Firstequation {
    private int a, b;
    public void Calculate(){
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();
        System.out.println();
        System.out.print("b = ");
        b = input.nextInt();
        float c = (float) b/a;
        System.out.println("x = " + c);
    }

}
