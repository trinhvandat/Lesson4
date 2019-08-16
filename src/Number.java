import java.text.DecimalFormat;
import java.util.Scanner;
public class Number {
    Scanner sc = new Scanner (System.in);
    public void first_rank_equation(){
        int a,b;
        float x;
        System.out.println("input a,b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a == b && a == 0) System.out.println(" coutless variable equation !");
        else {
            x = (float) -b / a;
            DecimalFormat df = new DecimalFormat("0.000");
            System.out.println("x = " + df.format(x));
        }
    }
    public void second_rank_equation(){
        int a,b,c;
        System.out.println("Input a,b,c : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double d = (double) Math.pow(b,2) - 4*a*c;
        double x1 ,x2;
        if(d < 0) System.out.println("No variable !");
        else if (d == 0) {
            x1 = (double) -b/(2*a);
            System.out.println("Only one variable : " + x1);
        }
        else {
            x1 = (double)(-b + Math.sqrt(d)) / (2 * a);
            x2 = (double)(-b - Math.sqrt(d)) / (2 * a);
            System.out.println("We have 2 variables : " + x1 + " and " + x2);
        }
    }
    public void year(){
        int y;
        System.out.println("input year: ");
        y = sc.nextInt();
        if(y % 400 == 0 || y % 4 == 0 && y % 100 != 0)
            System.out.println("number of day : " + 366);
        else System.out.println("number of day : " + 365);
    }
    public void number(){
        int a,b,c,d;
        System.out.println("input integer : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println("max = " + Math.max(Math.max(a,b) , Math.max(c,d))) ;
    }
    public void triangle(){
        int a,b,c;
        System.out.println("input a,b,c : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a+b <= c || a+c <= b || b+c <=a) System.out.println("isn't triangle");
        else System.out.println("this is triangle");
    }
    public void distance(){
        int a,b,c,d;
        System.out.println("input co-ordinate x :");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("input co-ordinate y : ");
        c = sc.nextInt();
        d = sc.nextInt();
        double dis = (double) Math.sqrt(Math.pow((a-c) , 2) + Math.pow((b-d) , 2));
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("distance : " + df.format(dis));
    }
    public void co_ordinate(){
        int x ,y;
        System.out.println("input co-ordinate A : ");
        x = sc.nextInt();
        y = sc.nextInt();
        if(Math.pow(x,2) + Math.pow(y,2) <= 1) System.out.println("True !");
        else System.out.println("False !");
    }
    public void character(){
        char c;
        System.out.println("input char c: ");
        c = sc.next().charAt(0);
        if(c >= 48 && c <= 57) System.out.println("Number !");
        else if(c >= 65 && c <= 90 || c >= 97 && c <= 122) System.out.println("Alphabet !");
        else System.out.println("Another !");
    }

}
