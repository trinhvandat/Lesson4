package Ex1;

import java.util.Scanner;

public class Findday {
    private int year;
    public void Search(){
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        if( year%400==0 || (year%4==0 && year%100!=0) ){
            System.out.println(366);
        }
        else{
            System.out.println(365);
        }
    }
}
