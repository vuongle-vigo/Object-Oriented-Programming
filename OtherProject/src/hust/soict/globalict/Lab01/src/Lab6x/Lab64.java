package OtherProject.src.hust.soict.globalict.Lab01.src.Lab6x;

import java.util.Scanner;

public class Lab64 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter month (full name, abbreviation, or number): ");
            String monthInput = scanner.nextLine().toLowerCase();

            System.out.print("Enter year (non-negative number): ");
            int year;
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                scanner.nextLine();
                if (year < 0) {
                    System.out.println("Invalid year. Please enter a non-negative number.");
                    continue;
                }
            } else {
                System.out.println("Invalid year. Please enter a non-negative number.");
                scanner.nextLine();
                continue;
            }

            int monthNumber = getMonthNumber(monthInput);
            if (monthNumber == -1) {
                System.out.println("Invalid month. Please try again.");
                continue;
            }

            int days = getDaysInMonth(monthNumber, year);
            System.out.println(getMonthName(monthNumber) + " " + year + " has " + days + " days.");
            break;
        }

        scanner.close();
    }

    private static int getMonthNumber(String monthInput) {
        switch (monthInput) {
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            case "march": case "mar.": case "mar": case "3": return 3;
            case "april": case "apr.": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "6": return 6;
            case "july": case "jul": case "7": return 7;
            case "august": case "aug.": case "aug": case "8": return 8;
            case "september": case "sept.": case "sep": case "9": return 9;
            case "october": case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return -1; // Invalid month
        }
    }

    private static int getDaysInMonth(int month, int year) {
        int[] daysInCommonYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysInLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            return daysInLeapYear[month - 1];
        } else {
            return daysInCommonYear[month - 1];
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }
}
