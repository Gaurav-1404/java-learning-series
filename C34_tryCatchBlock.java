public class C33_ErrorAndException34_tryCatchBlock {
    public static void main(String[] args) {

        System.out.println("Program Started...");

        // Example 1: Handling divide-by-zero error
        try {
            int a = 10;
            int b = 0;

            int result = a / b;  // ❌ This will throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide a number by zero.");
            System.out.println("Exception Message: " + e.getMessage());
        }

        // Example 2: Handling array index error
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // ❌ ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index accessed!");
        }

        System.out.println("Program Ended Normally...");
    }
}
