
import java.util.Scanner;

class Calculator {
    boolean doubleMode;
    int Num1;
    int Num2;
    double dNum1;
    double dNum2;

    public Calculator(int number1, int number2) {
        this.Num1 = number1;
        this.Num2 = number2;
        this.doubleMode = false;
    }

    public Calculator(double a, double b) {
        this.dNum1 = a;
        this.dNum2 = b;
        this.doubleMode = true;
    }

    public Calculator() {
        this.Num1 = 0;
        this.Num2 = 0;
        this.dNum1 = 0;
        this.dNum2 = 0;
        this.doubleMode = true;
    }

    public void setNum1(int a) {
        this.Num1 = a;
    }

    public void setNum2(int a) {
        this.Num2 = a;
    }

    public void setdNum1(double a) {
        this.dNum1 = a;
    }

    public void setdNum2(double a) {
        this.dNum2 = a;
    }

    public int getNum1() {
        return Num1;
    }

    public int getNum2() {
        return Num2;
    }

    public double getdNum1() {
        return dNum1;
    }

    public double getdNum2() {
        return dNum2;
    }

    public int add(int a, int b) {
        System.out.println("int version called");
        System.out.print(a + "+" + b + "= ");
        return a + b;
        // adds the two ints together
    }

    public double add(double a, double b) {
        System.out.println("double version called");
        System.out.print(a + "+" + b + "= ");
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println("int version called");
        System.out.print(a + "-" + b + "= ");
        return a - b;
        // subtracts the two ints
    }

    public double subtract(double a, double b) {
        System.out.println("double version called");
        System.out.print(a + "-" + b + "= ");
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.println("int version called");
        System.out.print(a + "*" + b + "= ");
        return a * b;
        // multiply the two ints
    }

    public double multiply(double a, double b) {
        System.out.println("double version called");
        System.out.print(a + "*" + b + "= ");
        return a * b;
    }

    public int divide(int a, int b) {
        System.out.println("int version called");
        if (b != 0) {
            System.out.print(a + "/" + b + "= ");
            return a / b;
        } else {
            System.out.print("ERROR: DIVIDE BY ");
            return 0;
        }
    }

    public double divide(double a, double b) {
        System.out.println("double version called");
        if (b != 0) {
            System.out.print(a + "/" + b + "= ");
            return a / b;
        } else {
            System.out.print("ERROR: DIVIDE BY ");
            return 0;
        }
    }

    public int modulo(int a, int b) {
        System.out.println("int version called");
        System.out.print(a + "%" + b + "= ");
        return a % b;
        // find the remainder of the two ints
    }

    public double modulo(double a, double b) {
        System.out.println("double version called");
        System.out.print(a + "%" + b + "= ");
        return a % b;
    }

    public void setNumbers(Scanner user) {
        System.out.println("First or Second Number?");
        int i = 0;
        while (i == 0) {
            String choice = user.nextLine();
            switch (choice) {
                case "First":
                    if (doubleMode) {
                        System.out.println("Number?");
                        double newDoNum1 = user.nextDouble();
                        user.nextLine();
                        setdNum1(newDoNum1);
                    } else {
                        System.out.println("Number?");
                        int newNum1 = user.nextInt();
                        user.nextLine();
                        setNum1(newNum1);
                    }
                    i++;
                    break;
                case "Second":
                    if (doubleMode) {
                        System.out.println("Number?");
                        double newDoNum2 = user.nextDouble();
                        user.nextLine();
                        setdNum2(newDoNum2);
                    } else {
                        System.out.println("Number?");
                        int newNum2 = user.nextInt();
                        user.nextLine();
                        setNum2(newNum2);
                    }
                    i++;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

    public void getNumber(Scanner user) {
        System.out.println("First or Second");
        int h = 0;
        while (h == 0) {
            String choiceGet = user.nextLine();
            switch (choiceGet) {
                case "First":
                    if (doubleMode) {
                        System.out.println(getdNum1());
                    } else {
                        System.out.println(getNum1());
                    }
                    h++;
                    break;
                case "Second":
                    if (doubleMode) {
                        System.out.println(getdNum2());
                    } else {
                        System.out.println(getNum2());
                    }
                    h++;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

    public void modeChange() {
        if (doubleMode == true) {
            this.doubleMode = false;
            System.out.println("Mode Changed to int mode");
        } else if (doubleMode == false) {
            this.doubleMode = true;
            System.out.println("Mode Changed to double mode");
        }
    }

    public void modeOptions(Scanner user) {
        System.out.println("Mode Options:\nCheck\nSwitch\nBack");
        String modeChoice = user.nextLine();
        switch (modeChoice) {
            case "Check":
                if (this.doubleMode) {
                    System.out.println("In Double Mode");
                } else {
                    System.out.println("In int Mode");
                }
                break;
            case "Switch":
                modeChange();
                break;
            case "Back":
                break;
            default:
                System.out.println("Invalid Returning to Main Menu");
                break;
        }
    }

    public void test(Calculator x) {
        System.out.println(x.add(6, 5));
        System.out.println(x.add(3.5, 4.5));
        System.out.println(x.add(6.5, 5));
        System.out.println(x.subtract(10, 5));
        System.out.println(x.subtract(10.5, 1.5));
        System.out.println(x.subtract(15.5, 5));
        System.out.println(x.multiply(5, 2));
        System.out.println(x.multiply(9, 3.5));
        System.out.println(x.multiply(3, 2.5));
        System.out.println(x.divide(20, 4));
        System.out.println(x.divide(10.5, 2.5));
        System.out.println(x.divide(13, 6.5));
        System.out.println(x.divide(3, 0));
        System.out.println(x.divide(4.5, 0));
        System.out.println(x.modulo(13, 3));
        System.out.println(x.modulo(15.5, 2.5));
        System.out.println(x.modulo(21, 5.5));
    }
}
