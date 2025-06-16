import java.util.Scanner;
//The class name doesn't really fit to what we are doing - what is a better name?
class Demo_1 {
    // instance variables
    String name;
    int age;

    // this constructor takes the information put into the created object and sets
    // the approriate instance variables to it
    public Demo_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // I can reset the age from the one originally provided with a setter method
    // setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // getter for age
    public int getAge() {
        return this.age;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for name
    public String getName() {
        return this.name;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // create an object
        // this objects accepts 2 parameters a "name" and "age"
        Demo_1 student1 = new Demo_1(args[0], Integer.parseInt(args[1]));
        
        //TODO: Lets add another instance of the class!

        System.out.println("Current student is: " + student1.name + "\nAge: " + student1.age);

        // Other Goofy things
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        while(exit == 0){
            System.out.print("Are there any errors? Y/N: ");
            String userResponse = scanner.next();
            System.out.print("\n");

            while ((!userResponse.equals("Y")) && (!userResponse.equals("N"))) {
                System.out.print("Incorrect input type either 'Y' / 'N' : ");
                userResponse = scanner.next();

            }
            
            if (userResponse.equals("Y")) {
                System.out.print("Pick error type: [N] for name ; [A] for age: ");
                String userResponse2 = scanner.next();

                while((!userResponse2.equals("N")) && (!userResponse2.equals("A"))) {
                    System.out.print("Incorrect input type either 'N' / 'A': ");
                    userResponse2 = scanner.next();

                } 
                
                if (userResponse2.equals("A")) {
                    System.out.print("Type new age: ");
                    int newAge = scanner.nextInt();
                    student1.setAge(newAge);
                    System.out.print("\n");

                } else {
                    System.out.println("Type new name: ");
                    userResponse2 = scanner.next();
                    student1.setName(userResponse2);
                    System.out.print("\n");
                }
            }
            System.out.println("Exit? [1] yes; [0] no");
            exit = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Current Student Name: " + student1.getName() + "\nCurrent Student Age: " + student1.getAge());
        System.out.println("Good bye!");
    }
}
