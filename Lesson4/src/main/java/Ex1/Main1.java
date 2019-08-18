package Ex1;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws IOException{
        int select1;
        boolean test = true;
        System.out.println("1.Giai phuong trinh bac nhat.");
        System.out.println("2.Giai phuong trinh bac hai.");
        System.out.println("3.Tim so ngay cua nam.");
        System.out.println("4.So lon nhat, So be nhat.");
        System.out.println("5.Kiem tra tam giac.");
        System.out.println("6.Khoang cach giua 2 diem.");
        System.out.println("7.Kiem tra diem trong duong tron.");
        System.out.println("8.Kiem tra ki tu.");
        System.out.println("9.Exit!");
        while(test){
            Scanner Select = new Scanner(System.in);
            select1 = Select.nextInt();
            switch (select1){
                case 1:{
                    System.out.println("1.Giai phuong trinh bac nhat:");
                    Firstequation f = new Firstequation();
                    f.Calculate();
                    break;
                }
                case 2:{
                    Secondequation s = new Secondequation();
                    s.Calculate();
                    break;
                }
                case 3:{
                    Findday f = new Findday();
                    f.Search();
                    break;
                }
                case 4:{
                    MinMax m = new MinMax();
                    m.FindMinMax();
                    break;
                }
                case 5:{
                    CheckTriangles c = new CheckTriangles();
                    c.Check();
                    break;
                }
                case 6:{
                    Distance d = new Distance();
                    d.resolve();
                    break;
                }
                case 7:{
                    Checkpoint c = new Checkpoint();
                    c.Check();
                    break;
                }
                case 8:{
                    CheckCharacter c = new CheckCharacter();
                    c.Check();
                    break;
                }
                case 9:{
                    test = false;
                    break;
                }
            }
        }
    }
}
