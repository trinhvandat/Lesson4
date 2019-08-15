
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Choice the function that you need: ");
            System.out.println(" 1. Solve First Equation");
            System.out.println(" 2. Solve Second Equation");
            System.out.println(" 3. Find number of  days");
            System.out.println(" 4. Max min in 4 number");
            System.out.println(" 5. Check triangle? Yes/No");
            System.out.println(" 6. Distance between 2 positions");
            System.out.println(" 7. Check 1 point in circle? Yes/No");
            System.out.println(" 8. Check type entered");
            System.out.println(" 9. Calculate the math");
            System.out.println("10. Find the day");
            System.out.println("11. Calculate the elictric bill");
            System.out.println("12. Type of Circle");
            System.out.println("0. End");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            switch (option) {
                case 1: {
                    firstEquation firstequation = new firstEquation(0, 0);
                    firstequation.inPut();
                    firstequation.process();
                    break;
                }
                case 2: {
                    SecondEquation secondEquation = new SecondEquation(0, 0, 0);
                    secondEquation.inPut();
                    secondEquation.process();
                    break;
                }
                case 3: {
                    NumberOfDay numberOfDay = new NumberOfDay();
                    numberOfDay.inPut();
                    numberOfDay.process();
                    break;
                }
                case 4: {
                    MaxMin maxMin = new MaxMin();
                    maxMin.inPut();
                    maxMin.process();
                    break;
                }
                case 5: {
                    Triangle triangle = new Triangle(0, 0, 0);
                    triangle.inPut();
                    triangle.process();
                    break;

                }
                case 6: {
                    DistancePoint distancePoint = new DistancePoint(0, 0);
                    DistancePoint otherDistancePoint = new DistancePoint(0, 0);
                    System.out.println("Enter point1");
                    distancePoint.inPut();
                    System.out.println("Enter point2");
                    otherDistancePoint.inPut();
                    System.out.println("Distance = " + distancePoint.distance(otherDistancePoint));
                    break;
                }
                case 7: {
                    DistancePoint point = new DistancePoint(0, 0);
                    System.out.println("Enter x,y :");
                    DistancePoint otherPoint = new DistancePoint(0, 0);
                    otherPoint.inPut();
                    if (otherPoint.distance(point) < 1) System.out.println("Yes");
                    else System.out.println("No");
                    break;

                }
                case 8: {
                    char x;
                    System.out.println("Enter one char : ");
                    x = scanner.next().charAt(0);
                    if (x >= 48 && x <= 57) System.out.println("This is number");
                    else if ((x >= 65 && x <= 90) || (x >= 97 && x <= 122)) System.out.println("This is Anphabet");
                    else System.out.println("This is special char");
                }
                case 9: {
                    Calculate calculate = new Calculate();
                    calculate.inPut();
                    calculate.process();
                    break;
                }
                case 10: {
                    DayInWeek dayInWeek = new DayInWeek();
                    dayInWeek.inPut();
                    dayInWeek.process();
                    break;
                }
                case 11: {
                    ElectricBill electricBill = new ElectricBill();
                    electricBill.inPut();
                    electricBill.process();
                    break;
                }
                case 12: {

                }
            }

        } while (option != 0);
    }
}

