package IF;

import java.util.Scanner;

public class Money {
    private int number;
    public void Change(){
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        double money = 0;
        if( number <= 50 ){
            money += (double)number * 550;
        }
        else{
            money += (double)50 * 550;
            number -= 50;
            if( number <= 50 ){
                money += (double)number * 850;
            }
            else {
                money += (double)50 * 850;
                number -= 50;
                if( number <= 100 ){
                    money += (double)number * 1200;
                }
                else {
                    money += (double)100 * 1200 ;
                    number -= 100;
                    money += number * 1500;
                }
            }
        }
        System.out.println("Money = " + money);
    }
}
