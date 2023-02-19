package javaessentials;
import java.util.Scanner;
public class PositiveOrNegative { public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    double num = input.nextDouble();

    if (num > 0) {
        System.out.println(num + " is positive");
    } else if (num == 0) {
        System.out.println(num + " is zero");
    } else {
        System.out.println(num + " is negative");
    }

    input.close();
}

}
