class Calculator{
    int num1;
    int num2;
    int result;
    double num1d;
    double num2d;
    double resultd;
    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    Calculator(double num1d, double num2d){
        this.num1d = num1d;
        this.num2d = num2d;
    }
    //int version of all methods
    int getNum1(){
        return this.num1;
    }
    int getNum2(){
        return this.num2;
    }
    void setnum1(int num1){
        this.num1 = num1;
    }
    void setnum2(int num2){
        this.num2 = num2;
    }
    void addition(int num1,int num2){
        result = num1 + num2;
        System.out.println("int " + result);
    }
    void subtract(int num1,int num2){
        result = num1 - num2;
        System.out.println("int " + result);
    }
    void multiply(int num1,int num2){
        result = num1 * num2;
        System.out.println("int " + result);
    }
    void division(int num1,int num2){
        result = num1 / num2;
        System.out.println("int " + result);
    }
    void modulo(int num1,int num2){
        result = num1 % num2;
        System.out.println("int " + result);
    }
    //double version of all methods
    double getNum1d(){
        return this.num1d;
    }
    double getNum2d(){
        return this.num2d;
    }
    void setnum1d(double num1d){
        this.num1d = num1d;
    }
    void setnum2d(double num2d){
        this.num2d = num2d;
    }
    void addition(double num1d,double num2d){
        resultd = num1d + num2d;
        System.out.println("double " + resultd);
    }
    void subtract(double num1d,double num2d){
        resultd = num1d - num2d;
        System.out.println("double " + resultd);
    }
    void multiply(double num1d,double num2d){
        resultd = num1d * num2d;
        System.out.println("double " + resultd);
    }
    void division(double num1d,double num2d){
        resultd = num1d / num2d;
        System.out.println("double " + resultd);
    }
    void modulo(double num1d,double num2d){
        resultd = num1d % num2d;
        System.out.println("double " + resultd);
    }
}