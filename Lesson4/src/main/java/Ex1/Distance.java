package Ex1;

import java.util.Scanner;

public class Distance {
    private int x1, x2, y1, y2;
    public void resolve(){
        Scanner input = new Scanner(System.in);
        x1 = input.nextInt();
        x2 = input.nextInt();
        y1 = input.nextInt();
        y2 = input.nextInt();
        double results;
        results = (double) Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) );
        System.out.println("Distance = " + results);
    }
}
