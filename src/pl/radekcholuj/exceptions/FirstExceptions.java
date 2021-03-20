package pl.radekcholuj.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Insert number 1:");
            a = scanner.nextInt();
            System.out.print("Insert number 2:");
            b = scanner.nextInt();
            scanner.nextLine();

            System.out.println(a / b);
            System.out.print("Insert path to file:");
            String path = scanner.nextLine();
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e){
            System.out.println("Not exists.");
        } catch (ArithmeticException e){
            System.out.println("Not divide by 0.");
        }
        catch (Exception e){
            System.out.println("...");
        }


        try {
            System.out.print("Insert number 1:");
            a = scanner.nextInt();
            System.out.print("Insert number 2:");
            b = scanner.nextInt();
            scanner.nextLine();

            System.out.println(a / b);
            System.out.print("Insert path to file:");
            String path = scanner.nextLine();
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException | ArithmeticException e){
            System.out.println("Incorect data.");
        }


        try {
            System.out.print("Insert number 1:");
            a = scanner.nextInt();
            System.out.print("Insert number 2:");
            b = scanner.nextInt();
            scanner.nextLine();

            System.out.println(a / b);
            System.out.print("Insert path to file:");
            String path = scanner.nextLine();
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (Exception e) {
            System.out.println("Incorect data.");
        } finally {
            scanner.close();
        }
    }
}
