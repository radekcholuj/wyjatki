package pl.radekcholuj.exceptions;

import java.io.FileInputStream;

public class FirstExceptions {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        // niezonaczony
        int result = a/b;
        result+=10;
        System.out.println(result);
        // oznaczony
        FileInputStream fileInputStream = new FileInputStream("/to/ma/byc/sciezka/plik.text");
    }
}
