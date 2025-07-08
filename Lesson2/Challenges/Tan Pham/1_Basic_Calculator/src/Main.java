
/*Tan Pham
 6/31
 It is a calculator that calculates
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Number choice1 = null;
        Number choice2 = null;
        System.out.println(
                "Hello World, This is my Calculator.\nBelow please enter the two numbers you would like to use(this can be changed).\nAfter Please select an option by typing in the exact name of that option");
        System.out.println("First Number?");
        if (input.hasNextInt()) {
            choice1 = input.nextInt();
        } else if (input.hasNextDouble()) {
            choice1 = input.nextDouble();
        }
        System.out.println("Second Number");
        {
            if (input.hasNextInt()) {
                choice2 = input.nextInt();
            } else if (input.hasNextDouble()) {
                choice2 = input.nextDouble();
            }
        }
        Calculator Calc;
        if (choice1 == null || choice2 == null) {
            Calc = new Calculator();
            System.out.println("Default used");
        }
        if (choice1 instanceof Integer && choice2 instanceof Integer) {
            Calc = new Calculator(choice1.intValue(), choice2.intValue());
        } else if (choice1 instanceof Double || choice2 instanceof Double) {
            Calc = new Calculator(choice1.doubleValue(), choice2.doubleValue());
        } else {
            Calc = new Calculator();
            System.out.println("Default used");
        }
        if (Calc.doubleMode) {
            System.out.println("In Double Mode");
        } else {
            System.out.println("In int Mode");
        }
        input.nextLine();
        int j = 0;
        while (j == 0) {
            System.out.println(
                    "\nOptions:\nMode\nSet Numbers\nGet Numbers\nAdd\nSubtract\nMultiply\nDivide\nModulo\nDemo\nDone\n");
            String task = input.nextLine();
            switch (task) {
                case "Mode":
                    Calc.modeOptions(input);
                    break;
                case "Set Numbers":
                    Calc.setNumbers(input);
                    System.out.println();
                    break;
                case "Get Numbers":
                    Calc.getNumber(input);
                    System.out.println();
                    break;
                case "Add":
                    if (Calc.doubleMode) {
                        System.out.println(Calc.add(Calc.dNum1, Calc.dNum2));
                    } else {
                        System.out.println(Calc.add(Calc.Num1, Calc.Num2));
                    }
                    System.out.println();
                    break;
                case "Subtract":
                    if (Calc.doubleMode) {
                        System.out.println(Calc.subtract(Calc.dNum1, Calc.dNum2));
                    } else {
                        System.out.println(Calc.subtract(Calc.Num1, Calc.Num2));
                    }
                    System.out.println();
                    break;
                case "Multiply":
                    if (Calc.doubleMode) {
                        System.out.println(Calc.multiply(Calc.dNum1, Calc.dNum2));
                    } else {
                        System.out.println(Calc.multiply(Calc.Num1, Calc.Num2));
                    }
                    System.out.println();
                    break;
                case "Divide":
                    if (Calc.doubleMode) {
                        System.out.println(Calc.divide(Calc.dNum1, Calc.dNum2));
                    } else {
                        System.out.println(Calc.divide(Calc.Num1, Calc.Num2));
                    }
                    System.out.println();
                    break;
                case "Modulo":
                    if (Calc.doubleMode) {
                        System.out.println(Calc.modulo(Calc.dNum1, Calc.dNum2));
                    } else {
                        System.out.println(Calc.modulo(Calc.Num1, Calc.Num2));
                    }
                    System.out.println();
                    break;
                case "Demo":
                    Calc.test(Calc);
                    System.out.println();
                    break;
                case "Done":
                    j++;
                    System.out.println("Thank you for testing");
                    input.close();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    System.out.println();
                    break;
            }
        }
    }
}
