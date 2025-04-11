class Employee {
    String name;
    int age;
    double salary;

   
    public Employee() {
        this("Unknown", 0, 0.0);  
        System.out.println("No-arg constructor called");
    }

   
    public Employee(String name, int age) {
        this(name, age, 3000.0);
        System.out.println("Constructor with name and age called");
    }

    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("Constructor with name, age, and salary called");
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class chainig {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        employee1.displayDetails();

        System.out.println(); 

       
        Employee employee2 = new Employee("Alice", 25);
        employee2.displayDetails();

        System.out.println();  

       
        Employee employee3 = new Employee("Bob", 30, 5000.0); 
        employee3.displayDetails();
    }
}
