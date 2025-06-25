package studentpack;
import java.util.Scanner;

class Student {
    // instance variables
    String name; //show what happens fi these are set to private instead of public --> ies back to why we use setters/getters
    int age;

    // this constructor takes the information put into the created object and sets
    // the approriate instance variables to it
    // This constructor assigns the given values to the instance variables
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // This setter lets me change the age after the object is created
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
        //create a scanner object
        Scanner scanner = new Scanner(System.in);

        // create a Student object
        // this objects accepts 2 parameters a "name" and "age"
        Student student1 = new Student(args[0], Integer.parseInt(args[1]));
        
        //TODO: Lets create another Student object with different values!

        // can directly call the instance variables
        System.out.println("Current student is: " + student1.name + "\nAge: " + student1.age);

        int exit = 0;
        while (exit == 0) {
            System.out.print("Are there any errors? Y/N: ");
            String userResponse = scanner.next();

            while (!userResponse.equals("Y") && !userResponse.equals("N")) {
                System.out.print("Please type 'Y' or 'N': ");
                userResponse = scanner.next();
            }

            if (userResponse.equals("Y")) {
                System.out.print("Pick error type: [N] for name ; [A] for age: ");
                String userResponse2 = scanner.next();

                while (!userResponse2.equals("N") && !userResponse2.equals("A")) {
                    System.out.print("Please type 'N' or 'A': ");
                    userResponse2 = scanner.next();
                }

                if (userResponse2.equals("A")) {
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    student1.setAge(newAge);
                } else {
                    System.out.print("Enter new name: ");
                    String newName = scanner.next();
                    student1.setName(newName);
                }
            }

            System.out.println("Exit? [1] yes; [0] no");
            exit = scanner.nextInt();
        }

        scanner.close();
        //using getter method to access the instance variables
        System.out.println("Final Student Info:\nName: " + student1.getName() + "\nAge: " + student1.getAge());
        System.out.println("Goodbye!");
    }
}
