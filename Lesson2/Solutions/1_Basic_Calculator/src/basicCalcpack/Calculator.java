package basicCalcpack;

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
    /*
     * STEP 7: In each method, add a temporary print statement:
     * System.out.println("int version called"); // in int method
     * System.out.println("double version called"); // in double method
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

    public void test() {
        System.out.println("STARTING TEST RUN...");
        System.out.println("\n---------------------");
        System.out.println("Testing Addition");
        System.out.println("\nOPERATION: 2 + 2");
        System.out.println("RESULT: " + add(2, 2));
        System.out.println("\nOPERATION: 2 + 3.5");
        System.out.println("RESULT: " + add(2, 3.5));
        System.out.println("\nOPERATION: 3.5 + 2");
        System.out.println("RESULT: " + add(3.5, 2));
        System.out.println("\nOPERATION: 3.5 + 6.7");
        System.out.println("RESULT: " + add(3.5, 6.7));
        System.out.println("\n---------------------");
        System.out.println("Testing Subtraction");
        System.out.println("\nOPERATION: 2 - 2");
        System.out.println("RESULT: " + sub(2, 2));
        System.out.println("\nOPERATION: 2 - 3.5");
        System.out.println("RESULT: " + sub(2, 3.5));
        System.out.println("\nOPERATION: 3.5 - 2");
        System.out.println("RESULT: " + sub(3.5, 2));
        System.out.println("\nOPERATION: 3.5 - 6.7");
        System.out.println("RESULT: " + sub(3.5, 6.7));
        System.out.println("\n---------------------");
        System.out.println("Testing Multiplication");
        System.out.println("\nOPERATION: 2 * 2");
        System.out.println("RESULT: " + multiply(2, 2));
        System.out.println("\nOPERATION: 2 * 3.5");
        System.out.println("RESULT: " + multiply(2, 3.5));
        System.out.println("\nOPERATION: 3.5 * 2");
        System.out.println("RESULT: " + multiply(3.5, 2));
        System.out.println("\nOPERATION: 3.5 * 6.7");
        System.out.println("RESULT: " + multiply(3.5, 6.7));
        System.out.println("\n---------------------");
        System.out.println("Testing Division");
        System.out.println("\nOPERATION: 2 / 2");
        System.out.println("RESULT: " + div(2, 2));
        System.out.println("\nOPERATION: 2 / 3.5");
        System.out.println("RESULT: " + div(2, 3.5));
        System.out.println("\nOPERATION: 3.5 / 2");
        System.out.println("RESULT: " + div(3.5, 2));
        System.out.println("\nOPERATION: 3.5 / 6.7");
        System.out.println("RESULT: " + div(3.5, 6.7));
        System.out.println("\n---------------------");
        System.out.println("Testing Modulo");
        System.out.println("\nOPERATION: 2 % 2");
        System.out.println("RESULT: " + mod(2, 2));
        System.out.println("\nOPERATION: 2 % 3.5");
        System.out.println("RESULT: " + mod(2, 3.5));
        System.out.println("\nOPERATION: 3.5 % 2");
        System.out.println("RESULT: " + mod(3.5, 2));
        System.out.println("\nOPERATION: 3.5 % 6.7");
        System.out.println("RESULT: " + mod(3.5, 6.7));
        System.out.println("\n---------------------");
    }

}
