package democalcpack;

public class Test extends Calculator{
    private int t_int1;
    private int t_int2;
    private double t_db1;
    private double t_db2;

    //default constructor
    public Test(){
        this.t_int1 = 0;
        this.t_int2 = 0;
        this.t_db1 = 0;
        this.t_db2 = 0;        
    }

    public Test(int intA, int intB, double dbA, double dbB){
        this.t_int1 = intA;
        this.t_int2 = intB;
        this.t_db1 = dbA;
        this.t_db2 = dbB;
    }

    //test 2 integer values for each method
    void testAdd_int(){
        System.out.println("Testing Addition with 2 Integers\nInputs: " + t_int1 + ", " + t_int2);
        int sum = add(t_int1, t_int2);
        System.out.println("Result:" + sum + "\n");
    }

    void testSub_int(){
        System.out.println("Testing Subtraction with 2 Integers\nInputs: " + t_int1 + ", " + t_int2);
        int difference = sub(t_int1, t_int2);
        System.out.println("Result:" + difference + "\n");
    }
    
    void testDiv_int(){
        System.out.println("Testing Division with 2 Integers\nInputs: " + t_int1 + ", " + t_int2);
        int quotient = div(t_int1, t_int2);
        System.out.println("Result:" + quotient + "\n");
    }
    
    void testMultiply_int(){
        System.out.println("Testing Multiplication with 2 Integers\nInputs: " + t_int1 + ", " + t_int2);
        int product = multiply(t_int1, t_int2);
        System.out.println("Result:" + product + "\n");
    }

    void testMod_int(){
        System.out.println("Testing Modulo with 2 Integers\nInputs: " + t_int1 + ", " + t_int2);
        int remainder = mod(t_int1, t_int2);
        System.out.println("Result:" + remainder + "\n");
    }
    
    //test 2 decimal values for each method
    void testAdd_double(){
        System.out.println("Testing Addition with 2 Decimals\nInputs: " + t_db1 + ", " + t_db2);
        double sum = add(t_db1, t_db2);
        System.out.println("Result:" + sum + "\n");        
    }

    void testSub_double(){
        System.out.println("Testing Subtration with 2 Decimals\nInputs: " + t_db1 + ", " + t_db2);
        double difference = sub(t_db1, t_db2);
        System.out.println("Result:" + difference + "\n");        
    }

    void testDiv_double(){
        System.out.println("Testing Division with 2 Decimals\nInputs: " + t_db1 + ", " + t_db2);
        double quotient = div(t_db1, t_db2);
        System.out.println("Result:" + quotient + "\n");        
    }

    void testMultiply_double(){
        System.out.println("Testing Multiplication with 2 Decimals\nInputs: " + t_db1 + ", " + t_db2);
        double product = multiply(t_db1, t_db2);
        System.out.println("Result:" + product + "\n");        
    }

    void testMod_double(){
        System.out.println("Testing Modulo with 2 Decimals\nInputs: " + t_db1 + ", " + t_db2);
        double remainder = mod(t_db1, t_db2);
        System.out.println("Result:" + remainder + "\n");        
    }

    //test a mix of values for each method
    void testAdd_mix(){
        System.out.println("Testing Addition with Mix Inputs v.1\nInputs: " + t_int1 + ", " + t_db2);
        double sum1 = add(t_int1, t_db2);
        System.out.println("Result:" + sum1 + "\n");
        
        System.out.println("Testing Addition with Mix Inputs v.2\nInputs: " + t_db1 + ", " + t_int2);
        double sum2 = add(t_db1, t_int2);
        System.out.println("Result:" + sum2 + "\n");
        
    }

    void testSub_mix(){
        System.out.println("Testing Subtration with Mix Inputs v.1\nInputs: " + t_int1 + ", " + t_db2);
        double difference1 = sub(t_int1, t_db2);
        System.out.println("Result:" + difference1 + "\n");
        
        System.out.println("Testing Subtration with Mix Inputs v.2\nInputs: " + t_db1 + ", " + t_int2);
        double difference2 = sub(t_db1, t_int2);
        System.out.println("Result:" + difference2 + "\n"); 
    }

    void testDiv_mix(){
        System.out.println("Testing Division with Mix Inputs v.1\nInputs: " + t_int1 + ", " + t_db2);
        double quotient1 = div(t_int1, t_db2);
        System.out.println("Result:" + quotient1 + "\n");
        
        System.out.println("Testing Division with Mix Inputs v.2\nInputs: " + t_db1 + ", " + t_int2);
        double quotient2 = div(t_db1, t_int2);
        System.out.println("Result:" + quotient2 + "\n");   
    }

    void testMultiply_mix(){
        System.out.println("Testing Multiplication with Mix Inputs v.1\nInputs: " + t_int1 + ", " + t_db2);
        double product1 = multiply(t_int1, t_db2);
        System.out.println("Result:" + product1 + "\n");
        
        System.out.println("Testing Multiplication with Mix Inputs v.2\nInputs: " + t_db1 + ", " + t_int2);
        double product2 = multiply(t_db1, t_int2);
        System.out.println("Result:" + product2 + "\n");  
    }

    void testMod_mix(){
        System.out.println("Testing Modulo with Mix Inputs v.1\nInputs: " + t_int1 + ", " + t_db2);
        double remainder1 = mod(t_int1, t_db2);
        System.out.println("Result:" + remainder1 + "\n");
        
        System.out.println("Testing Modulo with Mix Inputs v.2\nInputs: " + t_db1 + ", " + t_int2);
        double remainder2 = mod(t_db1, t_int2);
        System.out.println("Result:" + remainder2 + "\n");         
    }
    
    void test_All(){
        testAdd_int();
        testAdd_double();
        testAdd_mix();

        testSub_int();
        testSub_double();
        testSub_mix();

        testMultiply_int();
        testMultiply_double();
        testMultiply_mix();

        testDiv_int();
        testDiv_double();
        testDiv_mix();

        testMod_int();
        testMod_double();
        testMod_mix();
    }

}
