package extraCalcpack;

/*
 * STEP 1: Create a `public` class called `Calculator`
 *         - inside the class create 4 instance variables
 */
public class Calculator{
    private int int_var1;
    private int int_var2;
    private double d_var1;
    private double d_var2;

    //default constructor for the class if no parameters are given when first initializing an object
    public Calculator(){
        this.int_var1 = 0;
        this.int_var2 = 0;
        this.d_var1 = 0;
        this.d_var2 = 0;
    }

/* 
* STEP 2: Inside the class, define a constructor that:
*         - takes 2 integer parameters (e.g "int num1, int num2")
*         - Assign each parameter to the correct instance variable using `this`
*         - Example: `this.num1 = num1;`
*/ 
    //correction - needed 2 constructors to account for double and int input
    public Calculator(int var1, int var2){
        this.int_var1 = var1;
        this.int_var2 = var2;
    }

    public Calculator(double var1, double var2){
        this.d_var1 = var1;
        this.d_var2 = var2;
    }
 /* STEP 2.B: Inside the class, define two `setter` methods and two `getter` methods:
 *         - Each **setter** method takes ONE parameter and sets the value of an instance variable
 *         - Each **getter** method returns the value of the corresponding instance variable
 *
 *         For example:
 *             - `setNum1(int value)` sets the first value
 *             - `getNum1()` returns the first value
 *             - Repeat for the second value
 *
 *         These methods will help you update the Calculator object with user input
 */

    void set_Value1(int var1){
        this.int_var1 = var1;
    }

    void set_Value1(double var1){
        this.d_var1 = var1;
    }

    void set_Value2(int var2){
        this.int_var2 = var2;
    }

    void set_Value2(double var2){
        this.d_var2 = var2;
    }
    
    int getInt_Value1(){
        return int_var1;
    }

    int getInt_Value2(){
        return int_var2;
    }

    double getDouble_Value1(){
        return d_var1;
    }

    double getDouble_Value2(){
        return d_var2;
    }
 /* STEP 3: Inside the Calculator class, create public methods for:
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
 */
    //addition
    int add(int a, int b){
        System.out.println("int version called");
        return a + b;
    }

    double add(double a, double b){
        System.out.println("double version called");
        return a + b;
    }

    //subtraction
    int sub(int a, int b){
        System.out.println("int version called");
        return a - b;
    }

    double sub(double a, double b){
        System.out.println("double version called");
        return a - b;
    }

    //multiplication
    int multiply(int a, int b){
        System.out.println("int version called");
        return a * b;
    }

    double multiply(double a, double b){
        System.out.println("double version called");
        return a * b;
    }

    //division
    int div(int a, int b){
        System.out.println("int version called");
        return a / b;
    }

    double div(double a, double b){
        System.out.println("double version called");
        return a / b;
    }

    //module
    int mod(int a, int b){
        System.out.println("int version called");
        return a % b;
    }

    double mod(double a, double b){
        System.out.println("double version called");
        return a % b;
    }

}