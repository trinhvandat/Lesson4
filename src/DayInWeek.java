import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class DayInWeek {
    private int x;
    public void inPut(){
        System.out.println("Enter the day in March");
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
    }
    public void process(){
        if(x % 7 == 1) System.out.println("It is Saturday");
        else if(x % 7 == 2 ) System.out.println("It is Sunday");
        else if(x % 7 == 3 ) System.out.println("It is Monday");
        else if(x % 7 == 4 ) System.out.println("It is Tuesday");
        else if(x % 7 == 5 ) System.out.println("It is Wednesday");
        else if(x % 7 == 6 ) System.out.println("It is Thurday");
        else if(x % 7 == 0 ) System.out.println("It is Friday");
    }
}
