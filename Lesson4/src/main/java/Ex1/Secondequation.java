package Ex1;

import java.util.Scanner;

public class Secondequation {
    private float a, b, c;

    public void Calculate() {
        Scanner input = new Scanner(System.in);
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        float delta = (float) Math.pow(b, 2) - 4 * a * c;
        if( delta < 0 ){
            System.out.println("No Solution");
        }
        else if( delta == 0){
            float x;
            x = ((-b) / (2 * a));
            System.out.println("x = " + x);
        }
        else {
            float x1, x2;
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
