public class C33_ErrorAndException {
     
    public static void main(String[] args) {

        // ---------------------------
        // 1. Syntax Error Example
        // ---------------------------

        int a = 6;

        /*
         * Syntax errors occur when the code violates Java's grammar rules.
         * These errors are detected by the compiler before running the program.
         *
         * For example:
         * System.out.println(a + b);
         * Here 'b' is not declared, so the compiler shows:
         * "cannot find symbol: variable b"
         *
         * Syntax errors must be fixed before the program can run.
         */

        // System.out.println(a + b);  // ❌ Uncommenting this will cause a syntax error


        // ---------------------------
        // 2. Logical Error Example
        // ---------------------------

        /*
         * Logical errors are mistakes in the program's logic.
         * These programs will run but produce wrong output.
         *
         * Example: calculating the area of a rectangle but using wrong formula.
         */

        int length = 5;
        int breadth = 10;

        int wrongArea = length + breadth;   // ❌ Logical error (should be multiplication)
        int correctArea = length * breadth; // ✔ Correct logic

        System.out.println("Wrong Area (Logical Error): " + wrongArea);
        System.out.println("Correct Area: " + correctArea);


        // ---------------------------
        // 3. Runtime Exception Example
        // ---------------------------

        /*
         * Runtime exceptions occur while the program is running.
         * Example: dividing a number by zero.
         *
         * The program compiles successfully but crashes while running.
         */

        try {
            int result = a / 0;  // ❌ Runtime Exception: ArithmeticException
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Runtime Exception Caught: " + e);
        }


        // ---------------------------
        // Summary
        // ---------------------------
        /*
         * Three main types of errors in Java:
         *
         * 1. Syntax Error: Found by compiler (e.g., missing semicolon, undeclared variable).
         * 2. Logical Error: Program runs but gives wrong output.
         * 3. Runtime Error (Exception): Occurs while running the program (e.g., divide by zero).
         *
         * Java handles runtime errors using try-catch blocks.
         */

        System.out.println("Program completed successfully!");
    }
} 