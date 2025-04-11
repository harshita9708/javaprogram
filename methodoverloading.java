class Calculator {
    

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    

    public double add(double a, double b) {
        return a + b;
    }


    public String add(String a, String b) {
        return a + b;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(10, 20));         
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));     
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.3));        
        System.out.println("Concatenation of two strings: " + calc.add("Hello ", "World")); 
    }
}
