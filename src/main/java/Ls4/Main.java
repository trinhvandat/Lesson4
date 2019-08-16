package Ls4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean kt= true;
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        Task4 t4 = new Task4();
        Task5 t5 = new Task5();
        Task6 t6 = new Task6();
        Task7 t7 = new Task7();
        Task8 t8 = new Task8();

        If1 i1 = new If1();
        If2 i2 = new If2();
        If3 i3 = new If3();
        If4 i4 = new If4();

        while(kt){
            System.out.println("1.Task 1 :");
            System.out.println("2.Task 2 :");
            System.out.println("3.Task 3 :");
            System.out.println("4.Task 4 :");
            System.out.println("5.Task 5 :");
            System.out.println("6.Task 6 :");
            System.out.println("7.Task 7 :");
            System.out.println("8.Task 8 :");
            System.out.println("9.If 1 :");
            System.out.println("10.If 2 :");
            System.out.println("11.If 3 :");
            System.out.println("12.If 4 :");
            System.out.println("0. Exit :");
            int snack = inp.nextInt();
            switch ( snack ){
                case 0 :
                    kt = false;
                    break;
                case 1 :
                    t1.Cal();
                    break;
                case 2 :
                    t2.Cal();
                    break;
                case 3 :
                    t3.Cal();
                    break;
                case 4 :
                    t4.Cal();
                    break;
                case 5 :
                    t5.Cal();
                    break;
                case 6 :
                    t6.Cal();
                    break;
                case 7 :
                    t7.Cal();
                    break;
                case 8 :
                    t8.Cal();
                    break;
                case 9 :
                    i1.Cal();
                    break;
                case 10 :
                    i2.Cal();
                    break;
                case 11 :
                    i3.Cal();
                    break;
                case 12 :
                    i4.Cal();
                    break;
            }
        }
    }
}
