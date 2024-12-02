import java.util.Scanner;

public class Main {
    // method to display three numbers in increasing order
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        // sort the numbers using comparisons and swaps
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("The numbers in increasing order are: " + num1 + ", " + num2 + ", " + num3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        // call the method to display the sorted numbers
        displaySortedNumbers(num1, num2, num3);
    }
}