package pl.radekcholuj.exceptions.throwsexceptions;

import java.util.Scanner;

public class ThrowsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();

        try {
            int result = Math.div(num1, num2);
            System.out.println(num1 + "/" + num2 + "=" + result);
        } catch (ArithmeticException e){
            System.out.println("Not divide by 0.");
        }
    }
}
