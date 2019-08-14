package IF;

import java.util.Scanner;
import java.io.IOException;
public class Main2 {
    public static void main(String[] args) throws IOException{
        System.out.println("1.Tinh Gia Tri Bieu Thuc.");
        System.out.println("2.Tim Thu Trong Tuan.");
        System.out.println("3.Tinh Tien Dien.");
        System.out.println("4.Loai Tam GIac.");
        System.out.println("0.Exit!");
        boolean test = true;
        while (test){
            Scanner Select = new Scanner(System.in);
            int select;
            select = Select.nextInt();
            switch (select){
                case 0:{
                    test = false;
                    break;
                }
                case 1:{
                    System.out.println("1.Tinh Gia Tri Bieu Thuc:");
                    Calculate f = new Calculate();
                    f.Resolve();
                    break;
                }
                case 2:{
                    System.out.println("2.Tim Thu Trong Tuan.");
                    CheckDay c = new CheckDay();
                    c.findDay();
                    break;
                }
                case 3:{
                    System.out.println("3.TinhTien Dien.");
                    Money m = new Money();
                    m.Change();
                    break;
                }
                case 4:{
                    System.out.println("4.Loai Tam Giac.");
                    Triangles t = new Triangles();
                    t.Check();
                    break;
                }
            }
        }
    }
}
