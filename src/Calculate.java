import java.util.Scanner;

public class Calculate {
    private float a,b;
    private char x;
    public void inPut(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b and char");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        x = scanner.next().charAt(1);
    }
    public void process(){
        if(x == '+'){
            System.out.println("Result = " + (a + b));
        }
        else if(x == '-') System.out.println("Result = " + (a-b));
        else if(x == '%') System.out.println("Result = " + (a%b));
        else System.out.println("Result = " + (a/b));
    }
}
