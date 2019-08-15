import java.util.Scanner;

public class Triangle {
    private double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void inPut(){
        System.out.println("Enter 3 edges : ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }
    boolean checkTriangle(double a, double b, double c){
        if(a + b > c && a + c > b && b + c > a) return true;
        else return false;
    }
    public void process(){
        if (checkTriangle(a,b,c)){
            double p = (a + b + c) / 2;
            double h = p * (p - a) * (p - b) * (p - c);
            double acreage3 = Math.sqrt(h);
            System.out.println(" This is three edges of triangle and S =  " + acreage3);
        }
        else System.out.println("This is not three edges of triangle");
    }
}
