/*
 * Author: Daleela
 * Date: 06/23/2025
 * Description:
 */

import java.util.Scanner;

//STEP 1: Create a class called `Calculator` (Don't declare it public bc it will clash with the public main class)
class Calculator {
    /*
     * STEP 2: Inside the class create 4 instance variables
     * - Two instance variables to store integer values
     * - Two instance variables to store decimal (double) values
     */
    int int_Num1, int_Num2;
    double db_Num1, db_Num2;

    /*
     * STEP 3.A: Inside the class, define a constructor that:
     * - takes 2 integer parameters (e.g "int num1, int num2")
     * - Assign each parameter to the correct instance variable using `this`
     * - Example: `this.num1 = num1;`
     */
    public Calculator(int a, int b) {
        this.int_Num1 = a;
        this.int_Num2 = b;
    }

    /*
     * STEP 3.B: Add a second constructor that takes two double parameters.
     * - Assign the values to the correct double instance variables using `this`
     */
    public Calculator(double a, double b) {
        this.db_Num1 = a;
        this.db_Num2 = b;
    }

    // STEP 3.C: Add a no-argument constructor that sets all values (int
    // and double) to 0.
    public Calculator() {
        this.int_Num1 = 0;
        this.int_Num1 = 0;
        this.db_Num1 = 0;
        this.db_Num2 = 0;
    }

    /*
     * STEP 4: Inside the class, define 4 `setter` methods and 4 `getter` methods:
     * - Two for the integer variables (e.g., setNum1, getNum1)
     * - Two for the double variables (e.g., setDNum1, getDNum1)
     *
     * For example:
     * - `setNum1(int value1)` sets the first value
     * - `getNum1()` returns the first value
     * - Repeat for the second value
     *
     * These methods will help you update the Calculator object with user input
     */
    public void setNum1(int a) {
        this.int_Num1 = a;
    }

    public void setNum1(double a) {
        this.db_Num1 = a;
    }

    public void setNum2(int a) {
        this.int_Num2 = a;
    }

    public void setNum2(double a) {
        this.db_Num2 = a;
    }

    public int getIntNum1() {
        return int_Num1;
    }

    public int getIntNum2() {
        return int_Num2;
    }

    public double getDNum1() {
        return db_Num1;
    }

    public double getDNum2() {
        return db_Num2;
    }

    /*
     * STEP 5: Inside the Calculator class, create public methods for:
     * - `add()` → returns the sum of the two instance variables with return type
     * "int"
     * - `subtract()` → returns the difference with return type "int"
     * - `multiply()` → returns the product with return type "int"
     * - `divide()` → returns the quotient (use integer division) with return type
     * "int"
     * - `modulo()` → returns the remainder with return type "int"
     */
    public int add(int a, int b) {
        System.out.println("Int version");
        return a + b;
    }

    public int sub(int a, int b) {
        System.out.println("Int version");
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.println("Int version");
        return a * b;
    }

    public int div(int a, int b) {
        System.out.println("Int version");
        return a / b;
    }

    public int mod(int a, int b) {
        System.out.println("Int version");
        return a % b;
    }

    /*
     * STEP 6: For each of the above methods, create an overloaded version that:
     * - takes two `double` parameters
     * - returns a `double` result
     *
     * For example:
     * int add(int a, int b) → uses int parameters
     * double add(double a, double b) → uses double parameters
     */
    public double add(double a, double b) {
        System.out.println("Double version");
        return a + b;
    }

    public double sub(double a, double b) {
        System.out.println("Double version");
        return a - b;
    }

    public double multiply(double a, double b) {
        System.out.println("Double version");
        return a * b;
    }

    public double div(double a, double b) {
        System.out.println("Double version");
        return a / b;
    }

    public double mod(double a, double b) {
        System.out.println("Double version");
        return a % b;
    }

    /*
     * STEP 7: In each method, add a temporary print statement:
     * System.out.println("int version called"); // in int method
     * System.out.println("double version called"); // in double method
     *
     * STEP 8: Test all versions of your Calculator methods using specific values.
     * You have two options:
     *
     * Option A: Create a separate `test()` method inside your Main class
     * - This method should manually call the different overloaded methods
     * - Use test values like:
     * calc.add(2, 3);
     * calc.add(2.0, 3.5);
     * calc.add(3, 4.7);
     * calc.add(3.5, 2);
     *
     * Option B: Play the role of the user!
     * - Run your program normally
     * - When prompted, enter values like:
     * - Two integers
     * - Two decimals
     * - One int, one double
     * - Observe which version of the method is called (check the printouts)
     *
     * In either case:
     * - Record what you see
     * - Be ready to explain what happened next time!
     */

}

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
        test(calculator);

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
                        System.out.println("RESULT: " + calculator.add(calculator.getIntNum1(), calculator.getIntNum2()));
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
                        System.out.println("RESULT: " + calculator.sub(calculator.getIntNum1(), calculator.getIntNum2()));
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
                        System.out.println("RESULT: " + calculator.multiply(calculator.getIntNum1(), calculator.getIntNum2()));
                        break;
                    case 2:
                        System.out.println("RESULT: " + calculator.multiply(calculator.getDNum1(), calculator.getIntNum2()));
                        break;
                    case 3:
                        System.out.println("RESULT: " + calculator.multiply(calculator.getIntNum1(), calculator.getDNum2()));
                        break;
                    case 4:
                        System.out.println("RESULT: " + calculator.multiply(calculator.getDNum1(), calculator.getDNum2()));
                    default:
                        break;
                }

                break;

            case "/":
                switch (caseVariable) {
                    case 1:
                        System.out.println("RESULT: " + calculator.div(calculator.getIntNum1(), calculator.getIntNum2()));
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
                        System.out.println("RESULT: " + calculator.mod(calculator.getIntNum1(), calculator.getIntNum2()));
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

    public static void test(Calculator calculator){
        System.out.println("STARTING TEST RUN...");
        System.out.println("\n---------------------");
        System.out.println("Testing Addition");
        System.out.println("\nOPERATION: 2 + 2");
        System.out.println("RESULT: " + calculator.add(2, 2));
        System.out.println("\nOPERATION: 2 + 3.5");
        System.out.println("RESULT: " + calculator.add(2, 3.5));
        System.out.println("\nOPERATION: 3.5 + 2");
        System.out.println("RESULT: " + calculator.add(3.5, 2));
        System.out.println("\nOPERATION: 3.5 + 6.7");
        System.out.println("RESULT: " + calculator.add(3.5, 6.7));
        System.out.println("\n---------------------");
        System.out.println("Testing Subtraction");
        System.out.println("\nOPERATION: 2 - 2");
        System.out.println("RESULT: " + calculator.sub(2, 2));
        System.out.println("\nOPERATION: 2 - 3.5");
        System.out.println("RESULT: " + calculator.sub(2, 3.5));
        System.out.println("\nOPERATION: 3.5 - 2");
        System.out.println("RESULT: " + calculator.sub(3.5, 2));
        System.out.println("\nOPERATION: 3.5 - 6.7");
        System.out.println("RESULT: " + calculator.sub(3.5, 6.7));
        System.out.println("\n---------------------");
        System.out.println("Testing Multiplication");
        System.out.println("\nOPERATION: 2 * 2");
        System.out.println("RESULT: " + calculator.multiply(2, 2));
        System.out.println("\nOPERATION: 2 * 3.5");
        System.out.println("RESULT: " + calculator.multiply(2, 3.5));
        System.out.println("\nOPERATION: 3.5 * 2");
        System.out.println("RESULT: " + calculator.multiply(3.5, 2));
        System.out.println("\nOPERATION: 3.5 * 6.7");
        System.out.println("RESULT: " + calculator.multiply(3.5, 6.7));
        System.out.println("\n---------------------");
        System.out.println("Testing Division");
        System.out.println("\nOPERATION: 2 / 2");
        System.out.println("RESULT: " + calculator.div(2, 2));
        System.out.println("\nOPERATION: 2 / 3.5");
        System.out.println("RESULT: " + calculator.div(2, 3.5));
        System.out.println("\nOPERATION: 3.5 / 2");
        System.out.println("RESULT: " + calculator.div(3.5, 2));
        System.out.println("\nOPERATION: 3.5 / 6.7");
        System.out.println("RESULT: " + calculator.div(3.5, 6.7));
        System.out.println("\n---------------------");
        System.out.println("Testing Modulo");
        System.out.println("\nOPERATION: 2 % 2");
        System.out.println("RESULT: " + calculator.mod(2, 2));
        System.out.println("\nOPERATION: 2 % 3.5");
        System.out.println("RESULT: " + calculator.mod(2, 3.5));
        System.out.println("\nOPERATION: 3.5 % 2");
        System.out.println("RESULT: " + calculator.mod(3.5, 2));
        System.out.println("\nOPERATION: 3.5 % 6.7");
        System.out.println("RESULT: " + calculator.mod(3.5, 6.7));
        System.out.println("\n---------------------");
    }

}
