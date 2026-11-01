import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Average Calculator =====");
        System.out.print("How many numbers do you want to average? ");
        int count = input.nextInt();

        double sum = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = input.nextDouble();
            sum += number;
        }

        double average = sum / count;
        System.out.println("The average is: " + average);

        input.close();
    }
}
