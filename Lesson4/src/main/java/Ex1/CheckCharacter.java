package Ex1;

import java.util.Scanner;
import java.io.IOException;
public class CheckCharacter {
    private char kt;
    public void Check() throws IOException{
        Scanner input = new Scanner(System.in);
        kt =(char) System.in.read();
        if( kt >= 0 && kt <=9 ){
            System.out.println("This is int!");
        }
        else if(kt >= 'A' && kt <= 'z'){
            System.out.println("This is Char");
        }
        else{
            System.out.println("Other Char!");
        }
    }
}
