public class PassByValue {
    public static void modifyPrimitive(int number) {
        number = 20;  // Changes the local copy of the variable
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before method call: " + num);  // Output: 10
        modifyPrimitive(num);
        System.out.println("After method call: " + num);   // Output: 10 (no change)
    }
}
