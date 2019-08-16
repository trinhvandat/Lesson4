import java.util.Scanner;
public class If_test {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        If i1 = new If();
        int x;
        System.out.println("1.If1");
        System.out.println("2.If2");
        System.out.println("3.If3");
        System.out.println("4.If4");
        System.out.println();
        System.out.print("Please select : ");
        x = sc.nextInt();
        switch (x){
            case 1 :
                i1.if1();
                break;
            case 2 :
                i1.if2();
                break;
            case 3 :
                i1.if3();
                break;
            case 4 :
                i1.if4();
                break;
        }
        System.out.println(" Program complete !");
    }
}
