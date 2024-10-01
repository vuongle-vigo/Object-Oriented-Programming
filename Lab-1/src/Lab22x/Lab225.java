package Lab22x;

import javax.swing.JOptionPane;

public class Lab225 {

    public static void main(String[] args) {

        String strNum1, strNum2, strNotification;

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        strNotification = strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        strNotification += strNum2;

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        String result = "The calculation for " + strNotification + " is: \n" +
                "Sum: " + sum + "\n" +
                "Difference: " + difference + "\n" +
                "Product: " + product + "\n" +
                "Quotient: " + quotient;

        JOptionPane.showMessageDialog(null, result, "Calculation Result", JOptionPane.INFORMATION_MESSAGE);
    }
}