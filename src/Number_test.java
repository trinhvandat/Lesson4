import java.util.Scanner;
public class Number_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number n1 = new Number();
        int x;
        System.out.println("1.First rank equation.");
        System.out.println("2.Second rank equation");
        System.out.println("3.Year");
        System.out.println("4.Number");
        System.out.println("5.Triangle");
        System.out.println("6.Distance");
        System.out.println("7.Co-ordinate");
        System.out.println("8.Character");
        System.out.println("Select 1-8");
            x = sc.nextInt();
            if(x <= 8 && x >= 1) {
                switch (x) {
                    case 1:
                        n1.first_rank_equation();
                        break;
                    case 2:
                        n1.second_rank_equation();
                        break;
                    case 3:
                        n1.year();
                        break;
                    case 4:
                        n1.number();
                        break;
                    case 5:
                        n1.triangle();
                        break;
                    case 6:
                        n1.distance();
                        break;
                    case 7:
                        n1.co_ordinate();
                        break;
                    case 8:
                        n1.character();
                        break;
                }
                System.out.println("Finish!");
            }
            else System.out.println("Please select again !");

    }
}
