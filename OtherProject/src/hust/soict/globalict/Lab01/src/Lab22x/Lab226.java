package OtherProject.src.hust.soict.globalict.Lab01.src.Lab22x;

import java.util.Scanner;

public class Lab226 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of equation to solve:");
        System.out.println("1. First-degree equation with one variable");
        System.out.println("2. System of first-degree equations with two variables");
        System.out.println("3. Second-degree equation with one variable");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                solveLinearEquation(scanner);
                break;
            case 2:
                solveLinearSystem(scanner);
                break;
            case 3:
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    // Solve a first-degree equation (ax + b = 0)
    public static void solveLinearEquation(Scanner scanner) {
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Invalid equation! 'a' cannot be zero.");
            return;
        }

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        double x = -b / a;
        System.out.println("Solution: x = " + x);
    }

    // Solve a system of first-degree equations
    public static void solveLinearSystem(Scanner scanner) {
        System.out.println("Enter coefficients for the first equation (a11, a12, b1):");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();

        System.out.println("Enter coefficients for the second equation (a21, a22, b2):");
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Infinitely many solutions!");
            } else {
                System.out.println("No solution!");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Solutions: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Solve a second-degree equation (ax^2 + bx + c = 0)
    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Invalid equation! 'a' cannot be zero.");
            return;
        }

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("No real roots!");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Double root: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Solutions: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}