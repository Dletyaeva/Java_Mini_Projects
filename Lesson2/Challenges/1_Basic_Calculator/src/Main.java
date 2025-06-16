/*
 * Author:
 * Date:
 * Description: //TELL ME WHAT THE CODE DOES
 */

/*
 * STEP 1: Create a `public` class called `Calculator`
 *         - inside the class create 2 instance variables
 * 
 * STEP 2: Inside the class, define a constructor that:
 *         - takes 2 integer parameters (e.g "int num1, int num2")
 *         - Assign each parameter to the correct instance variable using `this`
 *         - Example: `this.num1 = num1;`
 * 
 * STEP 2.B: Inside the class, define two `setter` methods and two `getter` methods:
 *         - Each **setter** method takes ONE parameter and sets the value of an instance variable
 *         - Each **getter** method returns the value of the corresponding instance variable
 *
 *         For example:
 *             - `setNum1(int value)` sets the first value
 *             - `getNum1()` returns the first value
 *             - Repeat for the second value
 *
 *         These methods will help you update the Calculator object with user input
 *
 * STEP 3: Inside the Calculator class, create public methods for:
 *         - `add()` → returns the sum of the two instance variables with return type "int"
 *         - `subtract()` → returns the difference with return type "int"
 *         - `multiply()` → returns the product with return type "int"
 *         - `divide()` → returns the quotient (use integer division) with return type "int"
 *         - `modulo()` → returns the remainder with return type "int"
 *
 * STEP 4: For each of the above methods, create an overloaded version that:
 *         - takes two `double` parameters
 *         - returns a `double` result
 *
 *         For example:
 *             int add(int a, int b)           → uses int parameters
 *             double add(double a, double b)  → uses double parameters
 *
 * STEP 5: In each method, add a temporary print statement:
 *         System.out.println("int version called");     // in int method
 *         System.out.println("double version called");  // in double method
 *
 * STEP 6: Test all versions of your Calculator methods using specific values.
 *         You have two options:
 *
 *         Option A: Create a separate `test()` method inside your Main class
 *                   - This method should manually call the different overloaded methods
 *                   - Use test values like:
 *                         calc.add(2, 3);
 *                         calc.add(2.0, 3.5);
 *                         calc.add(3, 4.7);
 *                         calc.add(3.5, 2);
 *
 *         Option B: Play the role of the user!
 *                   - Run your program normally
 *                   - When prompted, enter values like:
 *                         - Two integers
 *                         - Two decimals
 *                         - One int, one double
 *                   - Observe which version of the method is called (check the printouts)
 *
 *         In either case:
 *         - Record what you see
 *         - Be ready to explain what happened next time!
 */


/*
 * HINTS:
 * - The Calculator class should NOT be defined inside the Main class
 * - To take user input, use the Scanner package from the Java standard library
 * - Use `if-else` or `switch` to handle user choices
 * - Keep your print statements in the overloaded methods for now to help with testing
 * - Use getter and/or setter methods to update the instance variables with user input
 */

/*
 * REQUIREMENTS:
 * - All methods must be public
 * - Your main method must interact with the user through the terminal
 * - You must test each operation with both `int` and `double` values
 * - All methods should use the Calculator's instance variables for input
 */



public class Main {
    /*
     * 1. Define the `main` method
     * 2. Greet the user
     * 3. Prompt the user to choose a calculator operation
     *      - Options: add, subtract, multiply, divide, modulo
     * 4. Ask the user to enter 2 values
     *      - You may start with integers, then test doubles
     * 5. Create an instance of Calculator using the integer constructor
     * 6. Call the appropriate method based on the user’s choice
     * 7. Print the result
     *
     * Extra: Try calling the double methods directly from main with mixed values
     */
}
