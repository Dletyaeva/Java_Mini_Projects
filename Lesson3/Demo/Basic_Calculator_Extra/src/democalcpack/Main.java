package democalcpack;
import java.io.*;
import java.util.Scanner;

public class Main {
    // NOTE: Instead of hardcoding the path everywhere, we define it once as a
    // constant
    private static final String PATH = "C:/Users/letya/Github/Github/pius_summer_2025/Java_Mini_Projects/Lesson3/Demo/Basic_Calculator_Extra/src/bin/democalcpack/testOutput.txt";

    public static void main(String[] args) {
        //check that all arguments are given
        if(args.length < 3){
            System.out.println("Please enter: Integer, Integer, Double, Double");
        }

        Scanner scanner = new Scanner(System.in);

        // NOTE: Save original System.out so we can restore it after printing to file
        PrintStream og = System.out;

        /*
         * This Test object is used to run automatic tests before the user interacts.
         * It pulls test values from command line args. This is different from the
         * original challenge where values may have been hardcoded.
         */
        Test testRun = new Test(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Double.parseDouble(args[2]),
                Double.parseDouble(args[3]));

        // Welcome message and testing intro
        System.out.println("Welcome to Calculator-X2!\nStarting Test Run.\n");

        // Redirect output to a file for test run results
        try (PrintStream fileout = new PrintStream(PATH)) {
            System.setOut(fileout); // Output goes to file now
            testRun.test_All(); // Run all predefined test cases
        } catch (FileNotFoundException e) {
            System.err.println("Error writing to file.");
        } finally {
            System.setOut(og); // Restore normal console output
        }
        
        // Begin interactive calculator session
        runCalculator(scanner);
        scanner.close();
    }

    public static void runCalculator(Scanner scanner) {
        boolean exit = false;
        System.out.println(
                "Now your turn!\nEnter an operation with only 2 numbers\nlist of operations: [+](addition); [-](subtraction); [/](division); [*](multiplication); [%](modulo)\nexample: 1 + 2\n");
        while (!exit) {
            Calculator calculator = new Calculator(); // fresh calculator for every loop
            boolean exit2 = false;
            boolean val1IsInt = false;
            boolean val2IsInt = false;

            while (!exit2) {
                System.out.print("Operation: ");
                String operation = scanner.nextLine();

                // ----- PARSING OPERATION INPUT -----

                /*
                 * We split the user's full input into tokens using a second Scanner.
                 * This lets us treat "3.5 * 6" as:
                 * 1st number → operand 1
                 * operator → "*"
                 * 2nd number → operand 2
                 * without using .charAt() or substring logic.
                 */
                Scanner parseOperation = new Scanner(operation);

                // Try reading the first number.
                // If it's an int (e.g. 2), store it and mark it as an int
                // Else if the value is not an integer check if it is a decimal
                // If it's a decimal (e.g. 3.5), Java promotes it to a double.
                if (parseOperation.hasNextInt()) {
                    calculator.set_Value1(parseOperation.nextInt());
                    val1IsInt = true;
                } else if (parseOperation.hasNextDouble()) {
                    calculator.set_Value1(parseOperation.nextDouble());
                    // NOTE: No need to mark val1IsInt = false — it's already false
                } else {
                    System.out.println("First input must be a number.");
                    exit2 = true;
                }

                // Next comes the operator, like "+" or "*"
                String operator = parseOperation.next();

                // Make sure it's one of our allowed operators
                if (!operator.equals("+") && !operator.equals("-") &&
                        !operator.equals("/") && !operator.equals("*") && !operator.equals("%")) {
                    System.out.println("Invalid operator.");
                    exit2 = true;
                }

                // Now parse the second number — same logic as before
                if (parseOperation.hasNextInt()) {
                    calculator.set_Value2(parseOperation.nextInt());
                    val2IsInt = true;
                } else if (parseOperation.hasNextDouble()) {
                    calculator.set_Value2(parseOperation.nextDouble());
                } else {
                    System.out.println("Third input must be a number.");
                    exit2 = true;
                }

                parseOperation.close();

                // NOTE: The next block dispatches to the correct method depending on types
                if (operator.equals("+")) {
                    if (val1IsInt && val2IsInt) {
                        int result = calculator.add(calculator.getInt_Value1(), calculator.getInt_Value2());
                        System.out.printf("Result: %.2f\n", result); // Formatting result
                    } else if (val1IsInt && !val2IsInt) {
                        double result = calculator.add(calculator.getInt_Value1(), calculator.getDouble_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else if (!val1IsInt && val2IsInt) {
                        double result = calculator.add(calculator.getDouble_Value1(), calculator.getInt_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else {
                        double result = calculator.add(calculator.getDouble_Value1(), calculator.getDouble_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    }
                } else if (operator.equals("-")) {
                    if (val1IsInt && val2IsInt) {
                        int result = calculator.sub(calculator.getInt_Value1(), calculator.getInt_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else if (val1IsInt && !val2IsInt) {
                        double result = calculator.sub(calculator.getInt_Value1(), calculator.getDouble_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else if (!val1IsInt && val2IsInt) {
                        double result = calculator.sub(calculator.getDouble_Value1(), calculator.getInt_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else {
                        double result = calculator.sub(calculator.getDouble_Value1(), calculator.getDouble_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    }
                } else if (operator.equals("*")) {
                    if (val1IsInt && val2IsInt) {
                        int result = calculator.multiply(calculator.getInt_Value1(), calculator.getInt_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else if (val1IsInt && !val2IsInt) {
                        double result = calculator.multiply(calculator.getInt_Value1(), calculator.getDouble_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else if (!val1IsInt && val2IsInt) {
                        double result = calculator.multiply(calculator.getDouble_Value1(), calculator.getInt_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else {
                        double result = calculator.multiply(calculator.getDouble_Value1(),
                                calculator.getDouble_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    }
                } else if (operator.equals("/")) {
                    if (val1IsInt && val2IsInt) {
                        int result = calculator.div(calculator.getInt_Value1(), calculator.getInt_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else if (val1IsInt && !val2IsInt) {
                        double result = calculator.div(calculator.getInt_Value1(), calculator.getDouble_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else if (!val1IsInt && val2IsInt) {
                        double result = calculator.div(calculator.getDouble_Value1(), calculator.getInt_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else {
                        double result = calculator.div(calculator.getDouble_Value1(), calculator.getDouble_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    }
                } else if (operator.equals("%")) {
                    if (val1IsInt && val2IsInt) {
                        int result = calculator.mod(calculator.getInt_Value1(), calculator.getInt_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else if (val1IsInt && !val2IsInt) {
                        double result = calculator.mod(calculator.getInt_Value1(), calculator.getDouble_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else if (!val1IsInt && val2IsInt) {
                        double result = calculator.mod(calculator.getDouble_Value1(), calculator.getInt_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    } else {
                        double result = calculator.mod(calculator.getDouble_Value1(), calculator.getDouble_Value2());
                        System.out.printf("Result: %.2f\n", result);
                    }
                } else {
                    // Fallback error message
                    System.out.println("Something went wrong. Input format:` number [operator] number`- put SPACES!");
                }

                // Inner loop only runs once per operation (can be changed if needed)
                exit2 = true;
            }

            // Ask user if they want to go again
            System.out.println("Would you like to exit y/n: ");
            String userInput = scanner.next();
            scanner.nextLine(); // Clear leftover newline so nextLine() doesn't misfire
            if (userInput.equals("y")) {
                exit = true;
            }
        }

        // End of program
        System.out.println("Good-bye!");

    }
}
