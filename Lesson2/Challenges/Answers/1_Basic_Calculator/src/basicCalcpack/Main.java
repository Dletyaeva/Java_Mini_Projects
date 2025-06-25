package basicCalcpack;
/*
 * Author: Daleela
 * Date: 06/23/2025
 * Description: A Simple calculator that first tests all the opertaions with hardcoded valuesa and prints the outputs. Then takes one user operation and prints the output.
 * List of operations: addition, subtraction, division, multiplication, modulo
 */

import java.util.Scanner;
/*
 * HINTS:
 * - The Calculator class should NOT be defined inside the Main class
 * - To take user input, use the Scanner package from the Java standard library
 * - Use `if-else` or `switch` to handle user choices
 * - Keep your print statements in the overloaded methods for now to help with
 * testing
 * - Use getter and/or setter methods to update the instance variables with user
 * input
 */

/*
 * REQUIREMENTS:
 * - All methods must be public
 * - Your main method must interact with the user through the terminal
 * - You must test each operation with both `int` and `double` values
 * - All methods should use the Calculator's instance variables for input
 * - i.e set the class instance variables with user input
 */

public class Main {
    // 1. Define the `main` method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 5. Create an instance of Calculator with default constructor
        Calculator calculator = new Calculator();

        // Extra: Try calling all methods directly from main with mixed values
        calculator.test();

        // 2. Greet the user
        // 3. Prompt the user to choose a calculator operation
        // Options: add, subtract, multiply, divide, modulo
        System.out.println(
                "Welcome to Calculator-X1!\nChoose an operation: [+]add; [-]subtract; [*]multiply; [/]divide; [%]modulo\n");
        System.out.print("Operation: ");
        String operator = scanner.next();

        while (!operator.equals("+") && !operator.equals("-") && !operator.equals("/") && !operator.equals("*")
                && !operator.equals("%")) {
            System.out.print("Enter a valid operator:");
            operator = scanner.next();
        }

        // 4. Ask the user to enter 2 values
        System.out.print("Enter value 1: ");
        boolean intTrue1 = false;

        while (!scanner.hasNextInt() && !scanner.hasNextDouble()) {
            System.out.print("Please enter a number: ");
            scanner.next();
        }

        if (scanner.hasNextInt()) {
            calculator.setNum1(scanner.nextInt());
            intTrue1 = true;
        } else if (scanner.hasNextDouble()) {
            calculator.setNum1(scanner.nextDouble());
        } else {
            System.out.println("Something went wrong");
        }

        System.out.print("Enter value 2: ");
        boolean intTrue2 = false;

        while (!scanner.hasNextInt() && !scanner.hasNextDouble()) {
            System.out.print("Please enter a number: ");
            scanner.next();
        }

        if (scanner.hasNextInt()) {
            calculator.setNum2(scanner.nextInt());
            intTrue2 = true;
        } else if (scanner.hasNextDouble()) {
            calculator.setNum2(scanner.nextDouble());
        } else {
            System.out.println("Something went wrong");
        }

        int caseVariable = 0;

        if (intTrue1 && intTrue2) {
            caseVariable = 1;
        } else if (!intTrue1 && intTrue2) {
            caseVariable = 2;
        } else if (intTrue1 && !intTrue2) {
            caseVariable = 3;
        } else {
            caseVariable = 4;
        }

        // 6. Call the appropriate method based on the user’s choice
        // 7. Print the result
        switch (operator) {
            case "+":
                switch (caseVariable) {
                    case 1:
                        System.out
                                .println("RESULT: " + calculator.add(calculator.getIntNum1(), calculator.getIntNum2()));
                        break;
                    case 2:
                        System.out.println("RESULT: " + calculator.add(calculator.getDNum1(), calculator.getIntNum2()));
                        break;
                    case 3:
                        System.out.println("RESULT: " + calculator.add(calculator.getIntNum1(), calculator.getDNum2()));
                        break;
                    case 4:
                        System.out.println("RESULT: " + calculator.add(calculator.getDNum1(), calculator.getDNum2()));
                    default:
                        break;
                }
                break;

            case "-":
                switch (caseVariable) {
                    case 1:
                        System.out
                                .println("RESULT: " + calculator.sub(calculator.getIntNum1(), calculator.getIntNum2()));
                        break;
                    case 2:
                        System.out.println("RESULT: " + calculator.sub(calculator.getDNum1(), calculator.getIntNum2()));
                        break;
                    case 3:
                        System.out.println("RESULT: " + calculator.sub(calculator.getIntNum1(), calculator.getDNum2()));
                        break;
                    case 4:
                        System.out.println("RESULT: " + calculator.sub(calculator.getDNum1(), calculator.getDNum2()));
                    default:
                        break;
                }
                break;

            case "*":
                switch (caseVariable) {
                    case 1:
                        System.out.println(
                                "RESULT: " + calculator.multiply(calculator.getIntNum1(), calculator.getIntNum2()));
                        break;
                    case 2:
                        System.out.println(
                                "RESULT: " + calculator.multiply(calculator.getDNum1(), calculator.getIntNum2()));
                        break;
                    case 3:
                        System.out.println(
                                "RESULT: " + calculator.multiply(calculator.getIntNum1(), calculator.getDNum2()));
                        break;
                    case 4:
                        System.out.println(
                                "RESULT: " + calculator.multiply(calculator.getDNum1(), calculator.getDNum2()));
                    default:
                        break;
                }

                break;

            case "/":
                switch (caseVariable) {
                    case 1:
                        System.out
                                .println("RESULT: " + calculator.div(calculator.getIntNum1(), calculator.getIntNum2()));
                        break;
                    case 2:
                        System.out.println("RESULT: " + calculator.div(calculator.getDNum1(), calculator.getIntNum2()));
                        break;
                    case 3:
                        System.out.println("RESULT: " + calculator.div(calculator.getIntNum1(), calculator.getDNum2()));
                        break;
                    case 4:
                        System.out.println("RESULT: " + calculator.div(calculator.getDNum1(), calculator.getDNum2()));
                    default:
                        break;
                }

                break;

            case "%":
                switch (caseVariable) {
                    case 1:
                        System.out
                                .println("RESULT: " + calculator.mod(calculator.getIntNum1(), calculator.getIntNum2()));
                        break;
                    case 2:
                        System.out.println("RESULT: " + calculator.mod(calculator.getDNum1(), calculator.getIntNum2()));
                        break;
                    case 3:
                        System.out.println("RESULT: " + calculator.mod(calculator.getIntNum1(), calculator.getDNum2()));
                        break;
                    case 4:
                        System.out.println("RESULT: " + calculator.mod(calculator.getDNum1(), calculator.getDNum2()));
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        scanner.close();

    }
}
