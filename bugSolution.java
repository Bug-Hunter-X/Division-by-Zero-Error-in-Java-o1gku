public class MyClass {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = 0; // Initialize z to avoid compilation errors
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
        System.out.println(z);
    }
}