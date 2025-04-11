class Vehicle {
    String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}
class Car extends Vehicle {
   
    int doors;

   
    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    public void displayDetails() {
        displayBrand();  
        System.out.println("Doors: " + doors);
    }
}
public class single {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        
        car.displayDetails();
    }
}


