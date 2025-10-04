package lesson36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ededi daxil edin: ");
            int number = sc.nextInt();

            System.out.print("Kicik hed: ");
            int min = sc.nextInt();

            System.out.print("Boyuk hed: ");
            int max = sc.nextInt();

            check(number, min, max);
        } catch (OutOfRangeValueException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    public static void check(int number, int min, int max) throws OutOfRangeValueException {
        if (number >= min && number <= max) {
            throw new OutOfRangeValueException("Eded verilen araliqdadir");
        }else {
            throw new OutOfRangeValueException("Eded verilen araliqda deyil");
        }
    }
}
