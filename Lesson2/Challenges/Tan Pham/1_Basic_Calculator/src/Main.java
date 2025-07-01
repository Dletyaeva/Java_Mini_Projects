/*
 * Author:
 * Date:
 * Description: //TELL ME WHAT THE CODE DOES
 */

/*
 * STEP 1: Create a class called `Calculator` (Don't declare it public bc it will clash with the public main class)
 * 
 * STEP 2: Inside the class create 4 instance variables
 *         - Two instance variables to store integer values 
 *         - Two instance variables to store decimal (double) values
 * 
 * STEP 3.A: Inside the class, define a constructor that:
 *         - takes 2 integer parameters (e.g "int num1, int num2")
 *         - Assign each parameter to the correct instance variable using `this`
 *         - Example: `this.num1 = num1;`
 * 
 * STEP 3.B: Add a second constructor that takes two double parameters.
 *         - Assign the values to the correct double instance variables using `this`
 * 
 * STEP 3.C: Add a no-argument constructor that sets all instance variables (int and double) to 0.
 * 
 * STEP 4: Inside the class, define 4 `setter` methods and 4 `getter` methods:
 *           - Two for the integer variables (e.g., setNum1, getNum1)
 *           - Two for the double variables (e.g., setDNum1, getDNum1)
 *
 *         For example:
 *             - `setNum1(int value1)` sets the first value
 *             - `getNum1()` returns the first value
 *             - Repeat for the second value
 *
 *         These methods will help you update the Calculator object with user input
 *
 * STEP 5: Inside the Calculator class, create public methods for:
 *         - `add()` → returns the sum of the two instance variables with return type "int"
 *         - `subtract()` → returns the difference with return type "int"
 *         - `multiply()` → returns the product with return type "int"
 *         - `divide()` → returns the quotient (use integer division) with return type "int"
 *         - `modulo()` → returns the remainder with return type "int"
 *
 * STEP 6: For each of the above methods, create an overloaded version that:
 *         - takes two `double` parameters
 *         - returns a `double` result
 *
 *         For example:
 *             int add(int a, int b)           → uses int parameters
 *             double add(double a, double b)  → uses double parameters
 *
 * STEP 7: In each method, add a temporary print statement:
 *         System.out.println("int version called");     // in int method
 *         System.out.println("double version called");  // in double method
 *
 * STEP 8: Test all versions of your Calculator methods using specific values.
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
 *      - i.e set the class instance variables with user input
 */



/*Tan Pham
 6/31
 It is a calculator that calculates
 */


 import java.util.Scanner;
 class Calculator{
     Scanner user = new Scanner(System.in);
     boolean doubleMode;
     int Num1;
     int Num2;
     double dNum1;
     double dNum2;
     public Calculator(int number1, int number2){
          this.Num1 = number1;
          this.Num2 = number2;
          this.doubleMode = false;
     }
     public Calculator(double a, double b){
         this.dNum1 = a;
         this.dNum2 = b;
         this.doubleMode = true;
     }
     public void setNum1(int a){
         this.Num1 = a;
     }
     public void setNum2(int a){
         this.Num2 = a;
     }
     public void setdNum1(double a){
         this.dNum1 = a;
     }
     public void setdNum2(double a){
         this.dNum2 = a;
     }
     public int getNum1(){
         return Num1;
     }
     public int getNum2(){
         return Num2;
     }
     public double getdNum1(){
         return dNum1;
     }
     public double getdNum2(){
         return  dNum2;
     }
     public int add(int a, int b){
         System.out.println("int version called");
         return a + b;
         //adds the two ints together
         }
     public double add(double a, double b){
         System.out.println("double version called");
         return a + b;
     }
         public int subtract(int a, int b){
         System.out.println("int version called");
         return a - b;
         //subtracts the two ints
         }
         public double subtract(double a, double b){
             System.out.println("double version called");
             return a - b;
         }
         public int multiply(int a, int b){
         System.out.println("int version called");
           return a * b;
           //multiply the two ints
         }
         public double multiply(double a, double b){
             System.out.println("double version called");
             return a * b;
         }
         public int divide(int a, int b){
         System.out.println("int version called");
           if(b != 0){
             return a / b;
           } else {
             int zero = 0;
             System.out.print("ERROR: DVIDE BY ");
             return zero;
           }
         }
         public double divide(double a, double b){
         System.out.println("double version called");
             if(b != 0){
                 return a / b;
               } else {
                 int zero = 0;
                 System.out.print("ERROR: DVIDE BY ");
                 return zero;
               }
         }
         
         public int modulo(int a, int b){
         System.out.println("int version called");
         return a % b;
         //find the remainder of the two ints
         }
         public double modulo(double a, double b){
         System.out.println("double version called");
            return a % b;
     }
     public void setNumbers(){
     System.out.println("First or Second Number?");
     int i = 0;
     while(i == 0){
     String choice = user.nextLine();
     switch(choice){
         case "First":
         if(doubleMode){
             System.out.println("Number?");
             double newDoNum1 = user.nextDouble();
             setdNum1(newDoNum1);
         } else {
             System.out.println("Number?");
             int newNum1 = user.nextInt();
             setNum1(newNum1);
         } 
         i++;
         break;
         case "Second":
         if(doubleMode){
             System.out.println("Number?");
             double newDoNum2 = user.nextDouble();
             setdNum2(newDoNum2);
         } else {
             System.out.println("Number?");
             int newNum1 = user.nextInt();
             setNum2(newNum1);
         } 
         i++;
         break;
         default: System.out.println("Invalid Choice");
         break;
     }
     }       
 }
 
 public void getNumber(){
     System.out.println("First or Second");
     int h = 0;
     while(h == 0){
     String choiceGet = user.nextLine();
     switch (choiceGet) {
         case "First":
             if(doubleMode){
                 System.out.println(getdNum1());
             } else {
                 System.out.println(getNum1());
             }
             h++;
             break;
         case "Second":
         if(doubleMode){
             System.out.println(getdNum2());
         } else{
             System.out.println(getNum2());
         }
         h++;
         break;
         default:System.out.println("Invalid Choice");
          break;
     }
 }
 }
 public void modeChange(){
   if(doubleMode == true){
      this.doubleMode = false;
      System.out.println("Mode Changed to int mode");
   } else if(doubleMode == false){
      this.doubleMode = true;
      System.out.println("Mode Changed to double mode");}
   }
   public void modeOptions(){
      System.out.println("Mode Options:\nCheck\nSwitch\nBack");
      String modeChoice = user.nextLine();
      switch(modeChoice){
         case "Check":
         if(this.doubleMode){
            System.out.println("In Double Mode");
        } else {System.out.println("In int Mode");}
        break;
        case "Switch":
        modeChange();
        break;
        case "Back":
        break;
        default:System.out.println("Invalid Returning to Main Menu");
        break;
      }
   }
   
 
 public void test(Calculator x){
     System.out.println("6+5= " + x.add(6, 5));
     System.out.println("3.5+4.5= " + x.add(3.5, 4.5));
     System.out.println("6.5+5= " + x.add(6.5, 5));
     System.out.println("10-5= " + x.subtract(10, 5));
     System.out.println("10.5-1.5= " + x.subtract(10.5, 1.5));
     System.out.println("15.5-5= " + x.subtract(15.5, 5));
     System.out.println("5*2= " + x.multiply(5, 2));
     System.out.println("9*3.5= " + x.multiply(9, 3.5));
     System.out.println("3*2.5= " + x.multiply(3, 2.5));
     System.out.println("20/4= " + x.divide(20, 4));
     System.out.println("10.5/2.5= " + x.divide(10.5, 2.5));
     System.out.println("13/6.5= " + x.divide(13, 6.5));
     System.out.println("3/0= " + x.divide(3, 0));
     System.out.println("4.5/0= " + x.divide(4.5, 0));
     System.out.println("13%3= " + x.modulo(13, 3));
     System.out.println("15.5%2.5= " + x.modulo(15.5, 2.5));
     System.out.println("21%5.5= " + x.modulo(21, 5.5));
 }
 }

 public class Main{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     Number choice1 = null;
     Number choice2 = null;
     System.out.println("Hello World, This is my Calculator.\nBelow please enter the two numbers you would like to use(this can be changed).\nAfter Please select an option by typing in the exact name of that option");
     System.out.println("First Number?");
     if (input.hasNextInt()) {
          choice1 = input.nextInt();
     } else if (input.hasNextDouble()) {
          choice1 = input.nextDouble();} else {System.out.println("Default used");}
     System.out.println("Second Number");{
         if (input.hasNextInt()){
              choice2 = input.nextInt();
         } else if (input.hasNextDouble()){
              choice2 = input.nextDouble();
         } else {System.out.println("Default used");}
     }
     Calculator Calc;
     if( choice1 instanceof Integer && choice2 instanceof Integer){
         Calc = new Calculator(choice1.intValue(),choice2.intValue() );
     } else if( choice1 instanceof Double || choice2 instanceof Double){
         Calc = new Calculator(choice1.doubleValue(),choice2.doubleValue() );
     } else{Calc = new Calculator(0,0);}
     if(Calc.doubleMode){
         System.out.println("In Double Mode");
     } else {System.out.println("In int Mode");}
     int j = 0;
     input.nextLine();
     while(j == 0){
     System.out.println("\nOptions:\nMode\nSet Numbers\nGet Numbers\nAdd\nSubtract\nMultiply\nDivide\nModulo\nDemo\nDone\n");
     String task = input.nextLine();
     switch(task){
     case "Mode":
     Calc.modeOptions();
     break;
     case "Set Numbers":
         Calc.setNumbers();
         System.out.println();
         break;
     case "Get Numbers":
         Calc.getNumber();
         System.out.println();
         break;
     case "Add":
     if(Calc.doubleMode){
         System.out.println(Calc.add(Calc.dNum1, Calc.dNum2));
     } else {
         System.out.println(Calc.add(Calc.Num1, Calc.Num2));
     }
     System.out.println();
     break;
     case "Subtract":
     if(Calc.doubleMode){
         System.out.println(Calc.subtract(Calc.dNum1, Calc.dNum2));
     } else {
         System.out.println(Calc.subtract(Calc.Num1, Calc.Num2));
     }
     System.out.println();
     break;
     case "Multiply":
     if(Calc.doubleMode){
         System.out.println(Calc.multiply(Calc.dNum1, Calc.dNum2));
     } else {
         System.out.println(Calc.multiply(Calc.Num1, Calc.Num2));
     }
     System.out.println();
     break;
     case "Divide":
     if(Calc.doubleMode){
         System.out.println(Calc.divide(Calc.dNum1, Calc.dNum2));
     } else {
         System.out.println(Calc.divide(Calc.Num1, Calc.Num2));
     }
     System.out.println();
     break;
     case "Modulo":
     if(Calc.doubleMode){
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
    //1. Define the `main` method
     /* 2. Create your objects (scanner, calculator, etc)
     *      - HINT: for calculator object use default no-args constructor
     * 3. create and call a test function
     *      - Calling all the methods directly with mixed values
     *      - print all the results
     *      - HINT: all Helper functions are defined below the `main` function
     * 4. Greet the user
     * 5. Prompt the user to choose a calculator operation
     *      - Options: add, subtract, multiply, divide, modulo
     * 6. Ask the user to enter 2 values
     * 6. Call the appropriate method based on the user’s choice
     * 7. Print the result
     */