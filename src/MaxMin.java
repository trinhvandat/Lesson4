import java.util.Scanner;

public class MaxMin {
    private int a,b,c,d;
    public void inPut(){
        System.out.println("Enter a, b, c, d: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
    }
    public void process(){
        int max1 = 0 ,max2 = 0,min1 = 0,min2 = 0;
        if(a >= b) {
            max1 = a;
            min1 = b;
        }
        if( c >= d){
            max2 = c;
            min2 = d;
        }
        if(max1 >= max2) System.out.println("Max : " + max1);
        else System.out.println("Min : " + max2);
        if(min1 <= min2) System.out.println("Min : " + min1);
        else System.out.println("Min : " + min2);

    }
}
