//Завдання 1
//        Напишіть метод, який приймає число та повертає суму цифр цього числа.
import java.util.Scanner;
public class SumOfNumber {
    static double inpDouble() {

        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextDouble()) {
            System.out.printf("You input not correct value !!!%nTry again%n");
            inp.next();
        }
        return inp.nextDouble();
    }


    static int sumNumber(double number) {
        String sumStr = "";
        int sum = 0;
        sumStr = String.valueOf(number);
        for (int i = 0; i < sumStr.length(); i++) {
            if (sumStr.charAt(i) != ',' && sumStr.charAt(i) != '.')
                sum += Character.getNumericValue(sumStr.charAt(i));
        }
        return sum;
    }

    static int sumNumber(int number) {
        String sumStr = "";
        int sum = 0;
        sumStr = String.valueOf(number);
        for (int i = 0; i < sumStr.length(); i++)
            sum += Character.getNumericValue(sumStr.charAt(i));
        return sum;
    }

    public static void main(String[] arg) {
        double inNumber;
        System.out.println("Input number:");
        inNumber = inpDouble();
        System.out.printf("Sum of numbers = %d", sumNumber(inNumber));
    }
}
