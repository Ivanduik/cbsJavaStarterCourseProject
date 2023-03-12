//Завдання 1
//        Напишіть метод, який приймає число та повертає суму цифр цього числа.

import java.util.Scanner;

public class NumberOfDate {
    static String inpStringDate() {
        Scanner inp = new Scanner(System.in);
        int dd = 0, mm = 0, yy = 0;
        String in = inp.nextLine();
        dd = Integer.parseInt(in.substring(0, 2));
        mm = Integer.parseInt(in.substring(3, 5));
        yy = Integer.parseInt(in.substring(6, 10));
        if (dd >= 31 || mm >= 12) return "";
        return in;
    }

    static int dateSumNumber(String date) {
        int dateSum = 0, el;
        int r = 0;
        if (date.length() != 10) {
            return 0;
        }
        for (int i = 0; i < date.length(); i++) {
            el = Character.getNumericValue(date.charAt(i));
            if ((el >= 0) && (el <= 9)) {
                dateSum += el;
            }
        }
        return dateSum;
    }
    public static void main(String[] arg) {
        String date="";
        System.out.println("Input date, format DD/MM/YYYY:");
        date=inpStringDate();
        if(date.equals("") || dateSumNumber(date)==0) System.out.println("Error, date not correct.");
        else         System.out.printf("Sum  numbers of Date= %d", dateSumNumber(date));
    }
}

