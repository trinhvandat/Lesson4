package Ex1;

import java.util.Scanner;

public class MinMax {
    private int[] a;
    public void FindMinMax(){
        Scanner input = new Scanner(System.in);
        for(int i = 1; i <= 4; i ++){
            a[i] = input.nextInt();
        }
        int Min = a[1], Max = a[1];
        for(int i = 2; i <= 4; i ++){
            if( a[i] < Min ){
                Min = a[i];
            }
            if(a[i] > Max){
                Max = a[i];
            }
        }
        System.out.println("Min = " + Min);
        System.out.println("Max = " + Max);
    }
}
