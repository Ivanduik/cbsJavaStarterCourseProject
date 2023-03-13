//Завдання 4
//        Створіть програму, яка виводить у консоль число дати. Наприклад,
//        на вхід 02/11/1995 = 0 + 2 + 1 + 1 + 1 + 9 + 9 + 5 = 28, на вихід = 28.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class NumberOfDate {
    static String inputString() {
        Scanner inpDAte = new Scanner(System.in);
        return inpDAte.nextLine();
    }

    static Boolean isValidDate(String inDate) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            format.setLenient(false);
            format.parse(inDate);
            return true;
        } catch (ParseException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    static int dateSumNumber(String date) {
        int dateSum = 0;
        String strDate = date.replace("/", "");
        for (int i = 0; i < strDate.length(); i++)
            dateSum += Character.getNumericValue(strDate.charAt(i));
        return dateSum;
    }

    public static void main(String[] arg) throws ParseException {
        String date="";
        System.out.println("Input date, format DD/MM/YYYY:");
        date = inputString();
        if (isValidDate(date)) System.out.printf("Sum numbers of Date= %d", dateSumNumber(date));
        else System.out.println("Error, date not correct.");
    }
}

