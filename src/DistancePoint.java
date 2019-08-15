import java.util.Scanner;

public class DistancePoint {
    private double x,y;

    public DistancePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void inPut(){
        System.out.println("Enter x,y : ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
    }
    public double distance(DistancePoint b){
        return Math.sqrt((this.x - b.x)*(this.x - b.x) + (this.y - b.y)*(this.y - b.y));
    }
}
