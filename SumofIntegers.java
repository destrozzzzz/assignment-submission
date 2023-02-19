package javaessentials;
import java.util.Scanner;
public class SumofIntegers {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int sum = 0;

    for (int i = 1; i <= 5; i++) {
        System.out.print("Enter integer #" + i + ": ");
        int num = input.nextInt();
        sum += num;
    }

    System.out.println("The sum of the integers is: " + sum);

    input.close();
}

}
