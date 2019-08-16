import java.util.Scanner;
public class If {
    Scanner sc = new Scanner (System.in);
    public void if1(){
        int a,b;
        char c;
        String s = "+-*/";
        System.out.println("input a,b and char c :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.next().charAt(0);
        double d = (double) a/b;
        if(c == s.charAt(0)) System.out.println("a + b = " + (a+b));
        else if (c == s.charAt(1)) System.out.print("a - b = " + (a-b));
        else if (c == s.charAt(2)) System.out.println("a * b = " + (a*b));
        else System.out.println("a : b = " + d);
    }
    public void if2() {
        int d;
        System.out.println("input day : ");
        d = sc.nextInt();
        if (d <= 31) {
            for (int i = 4; i >= 0; i--) {
                if (d == 3 + i * 7) System.out.println("Monday");
                else if (d == 4 + i * 7) System.out.println("Tuesday");
                else if (d == 5 + i * 7) System.out.println("Wednesday");
                else if (d == 6 + i * 7) System.out.println("Thursday");
                else if (d == 7 + i * 7) System.out.println("Friday");
                else if (d == 8 + i * 7) System.out.println("Saturday");
                else if (d == 9 + i * 7) System.out.println("Sunday");
            }
            if (d == 2) System.out.println("Sunday");
            else if (d == 1) System.out.println("Saturday");
        }
        else System.out.println("Error");
    }
    public void if3(){
        int a;
        double x;
        System.out.println("input electric bill : ");
        a = sc.nextInt();
        if(a <= 50) x = (double) a*0.55;
        else if (a <= 100) x = (double) 50*0.55 + (a - 50) * 0.85;
        else if ( a <= 200) x = (double) 50 * 0.55 + 50 * 0.85 + (a - 100) * 1.2;
        else x = (double) 50 * 0.55 + 50 * 0.85 + 100 * 1.2 + (a-200) * 1.5;
        System.out.println(x + "k VND");
    }
    public void if4(){
        int a,b,c;
        System.out.println("input a,b,c :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) System.out.println("Right triangle");
        else if (a == b || b ==c || a == c) System.out.println("Isosceles triangle");
        else if (a == b && b == c) System.out.println("Equilateral triangle");
        else if (a != b && b != c && a != c) System.out.println("Normal triangle");
        else System.out.println("Square weight triangle");
    }
}
