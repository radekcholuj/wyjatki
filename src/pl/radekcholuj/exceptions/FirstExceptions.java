package pl.radekcholuj.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FirstExceptions {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        // niezonaczony
        try {
            int result = a / b;
            result += 10;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Not divide by 0.");
        }
        // oznaczony
        try {
            FileInputStream fileInputStream = new FileInputStream("/to/ma/byc/sciezka/plik.text");
        } catch (FileNotFoundException e){
            System.out.println("Not exists.");
        }
    }
}
