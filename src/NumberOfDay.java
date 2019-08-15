import java.util.Scanner;

public class NumberOfDay {
    private int n;
    public void inPut(){
        System.out.println("Enter Year that you want to search : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
    }
    public void process(){
        if((n % 400 == 0 || n % 4 == 0) && (n%100 != 0)) System.out.println(n + " has 366 day");
        else System.out.println(n + " has 365 day");
    }
}
