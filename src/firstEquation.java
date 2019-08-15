import java.util.Scanner;

public class firstEquation {
    private float a,b;

    public firstEquation(float a, float b) {
        this.a = a;
        this.b = b;
    }
    public void inPut(){
        System.out.print("Enter a,b : ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
    }
    public void process(){
        float x;
        x = b/a;
        System.out.println("x = " + x);

    }
}
