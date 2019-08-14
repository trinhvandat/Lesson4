package IF;

import java.util.Scanner;

public class CheckDay {
    private int day;
    public void findDay(){
        Scanner input = new Scanner(System.in);
        day = input.nextInt();
        int c = day % 7;
        switch (c){
            case 1:{
                System.out.println("Saturday");
                break;
            }
            case 2:{
                System.out.println("Sunday");
                break;
            }
            case 3:{
                System.out.println("Monday");
                break;
            }
            case 4:{
                System.out.println("Tuesday");
                break;
            }
            case 5:{
                System.out.println("Wednesday");
                break;
            }
            case 6:{
                System.out.println("Thursday");
                break;
            }
            case 0:{
                System.out.println("Friday");
                break;
            }
        }
    }
}
