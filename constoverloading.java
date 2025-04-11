class Person {
    String name;
    int age;


    public Person() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }

    public Person(String name) {
        this.name = name;
        this.age = 0; 
        System.out.println("Constructor with one parameter called");
    }

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with two parameters called");
    }

   
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class constoverloading {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.displayDetails();
        
        System.out.println();
        
        Person person2 = new Person("Alice"); 
        person2.displayDetails();
        
        System.out.println();
        
        Person person3 = new Person("Bob", 25);
        person3
