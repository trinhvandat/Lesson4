package IF;
import java.io.IOException;
import java.util.Scanner;

public class Calculate {
    private int a, b;
    private char c;
    public void Resolve () throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("a = ");
        a = input.nextInt();
        System.out.println("b = ");
        b = input.nextInt();
        System.out.println("Sign = ");
        c = (char) System.in.read();
        if( c == '+' ){
            int kq = a + b;
            System.out.println(a + "+" + b + " = " + kq);
        }
        else if(c == '-'){
            int kq = a - b;
            System.out.println(a + "-" + b + " = " + (kq));
        }
        else if( c == '*' ){
            int kq = a * b;
            System.out.println(a +"*" + b + " = " + kq);
        }
        else {
            float kq = (float) a / b;
            System.out.println(a + "/" + b + " = " + kq);
        }
    }
}
