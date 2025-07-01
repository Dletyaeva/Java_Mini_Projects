package studentpack;

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
