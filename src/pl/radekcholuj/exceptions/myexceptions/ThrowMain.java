package pl.radekcholuj.exceptions.myexceptions;

import pl.radekcholuj.exceptions.throwsexceptions.Utils;

import java.util.Scanner;

public class ThrowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number: ");
            int number = scanner.nextInt();

            try {
                String month = Utils.monthNameByNumber(number);
                System.out.println(month);
            } catch (IllegalArgumentException e){
                System.out.println("Month not found.");
            }
        } while(true);
    }
}
