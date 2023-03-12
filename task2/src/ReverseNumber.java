import java.util.Scanner;

//Завдання 2
//        Напишіть метод, який приймає число, яке не містить нулів та повертає цифри у зворотному порядку.
//        Наприклад, на вхід 789, на вихід 987.
public class ReverseNumber {
    static int inputInt() {
        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextInt()) {
            System.out.printf("You input not integer value !!!%nTry again%n");
            inp.next();
        }
        return inp.nextInt();
    }

    static int reverseNum(int num) {
        int revNum = 0;
        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            if ((num % 10) == 0)
                return 0;
            else num /= 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        int inpN;
        System.out.println("Input integer number without 0: ");
        inpN = inputInt();
        if (reverseNum(inpN) == 0)
            System.out.println("Error, not correct number");
        else
            System.out.println("Reverse number - " + reverseNum(inpN));
    }
}
