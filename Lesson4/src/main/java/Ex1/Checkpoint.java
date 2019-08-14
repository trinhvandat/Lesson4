package Ex1;

import java.util.Scanner;

public class Checkpoint {
    private int x, y;
    public void Check(){
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        double kc = (double)( Math.pow(x, 2) * Math.pow(y, 2) );
        if( kc < 1 ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No!");
        }
    }
}
