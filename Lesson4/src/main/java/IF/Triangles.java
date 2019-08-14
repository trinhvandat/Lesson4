package IF;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class Triangles {
    private int a, b, c;
    public void Check(){
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);
        Scanner input = new Scanner(System.in);
        if( a == b && b == c ){
            System.out.println("Tam Giac Deu!");
        }
        else if( a==b || b==c || a==c ){
            if( (a2 == b2 + c2) || (b2 == a2 + c2) || (c2 == a2 + b2) ){
                System.out.println("Tam Giac Vuong Can.");
            }
            else{
                System.out.println("Tam Giac Can.");
            }
        }
        else if((a2 == b2 + c2) || (b2 == a2 + c2) || (c2 == a2 + b2)){
            System.out.println("Tam Giac Vuong.");
        }
        else {
            System.out.println("Tam Giac Thuong.");
    }
}
}
