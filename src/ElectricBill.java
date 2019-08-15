import java.util.Scanner;

public class ElectricBill {
    private int x;
    public void inPut(){
        System.out.println("Enter the electric number : ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
    }
    public void process(){
        long sum = 0;
        if(x <= 50) {
            sum = 550 * 50;
        }
        else{
            sum = 550 * 50;
            x = x - 50;
            if( x <= 50){
                sum += x * 850;
            }
            else {
                sum += 50 * 850;
                x -= 50;
                if(x <= 100){
                    sum += x *1200;
                }
                else {
                    sum += 100 * 1200;
                    x -= 100;
                    sum += x * 1500;
                }
                }

        }
        System.out.println("Total Money = " + sum);
    }
}
