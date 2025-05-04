package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validation {

    static Scanner sc = new Scanner(System.in);

    public static double getDoubleRange(String msg, double min, double max) {
        while (true) {
            try {
                System.out.println(msg);
                double n = Double.parseDouble(sc.nextLine());
                if (n < min || n > max) {
                    System.err.println("Please enter number in range [" + min + ", " + max + "]");
                    continue;
                }
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Invalid number! Try again.");
            }
        }

    }
    
    
    public static int getIntRange( String msg, int min, int max) {
    while (true) {
        System.out.print(msg);
        try {
            int n = Integer.parseInt(sc.nextLine());
            if (n >= min && n <= max) return n;
            System.out.println("Out of range [" + min + "," + max + "]");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number!");
        }
    }
}

    public static String getNonEmptyString(String msg) {
        while (true) {
            System.out.println(msg);
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) {
                return s;
            }
            System.out.println("Input cannot be empty.");
        }
    }

    public static Date getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);
        while (true) {
            try {
                return sdf.parse(sc.nextLine().trim());
            } catch (ParseException e) {
                System.err.println("Invalid date format. Use dd-MM-yyyy.");
            }
        }
    }

    public static double getDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }
    }
}
