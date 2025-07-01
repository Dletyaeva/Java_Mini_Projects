package democalcpack;
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

    public Calculator(int var1, int var2){
        this.int_var1 = var1;
        this.int_var2 = var2;
    }

    public Calculator(double var1, double var2){
        this.d_var1 = var1;
        this.d_var2 = var2;
    }

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