//
//Завдання 3
//        Створіть програму, яка виводить у консоль число імені,
//        наприклад, на вхід Roman = R(18) + O(15) + M(13) + A(1) + N(14) = 61, на вихід  61.

import java.util.Scanner;

public class NameNumber {
    static int nameNum(String name) {
        int number = 0;
        for (int i = 0; i < name.length(); i++) {
            if ((name.toUpperCase().charAt(i) >= 65) && (name.toUpperCase().charAt(i) <= 90))
                number += name.toUpperCase().charAt(i) - 64;
            else {
                return 0;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = "";
        System.out.println("Input name, only letter:");
        name = inp.nextLine();
        if (nameNum(name) > 0)
            System.out.printf("Number of name %d", nameNum(name));
        else System.out.println("Error, name not correct !!!");
    }
}
