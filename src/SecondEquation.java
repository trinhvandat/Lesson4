import java.util.Scanner;

public class SecondEquation {
    private double a,b,c;

    public SecondEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void inPut(){
        System.out.println("Nhap a,b,c : ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
    }
    public  void process(){
        double denta = b*b - 4*a*c;
        if(denta < 0) System.out.println("Pt vo nghiem");
        else if(denta == 0) System.out.println("x1 = x2 = " + -b/(2*a));
        else {
            double x1 = (-b + Math.sqrt(denta))/(2*a);
            double x2 = (-b - Math.sqrt(denta))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
