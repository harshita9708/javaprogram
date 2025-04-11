class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public Person(Person other) {
      
        this.name = other.name;
        this.age = other.age;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class copyconstructor {
    public static void main(String[] args) {
    
        Person person1 = new Person("John", 30);
        System.out.println("Original Person:");
        person1.displayDetails();
        System.out.println(); 
        Person person2 = new Person(person1);
        System.out.println("Copied Person:");
        person2.displayDetails();
    }
}
