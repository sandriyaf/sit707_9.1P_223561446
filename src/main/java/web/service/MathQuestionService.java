package web.service;

public class MathQuestionService {

    public static double q1Addition(String number1, String number2) {
        if (number1 == null || number2 == null || number1.isEmpty() || number2.isEmpty()) {
            throw new IllegalArgumentException("Number1 and Number2 must not be empty or null.");
        }

        try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            return num1 + num2;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format for Number1 or Number2.");
        }
    }

    public static double q2Subtraction(String number1, String number2) {
        if (number1 == null || number2 == null || number1.isEmpty() || number2.isEmpty()) {
            throw new IllegalArgumentException("Number1 and Number2 must not be empty or null.");
        }

        try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            return num1 - num2;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format for Number1 or Number2.");
        }
    }
    
    public static double q3Multiplication(String number1, String number2) {
        if (number1 == null || number2 == null || number1.isEmpty() || number2.isEmpty()) {
            throw new IllegalArgumentException("Number1 and Number2 must not be empty or null.");
        }

        try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            return num1 * num2;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format for Number1 or Number2.");
        }
    }

}
