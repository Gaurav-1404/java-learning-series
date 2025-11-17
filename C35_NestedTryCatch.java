public class C35_NestedTryCatch {
    public static void main(String[] args) {

        // Creating an array of marks
        int[] marks = new int[3];
        marks[0] = 20;
        marks[1] = 25;
        marks[2] = 23;

        try {
            System.out.println("Welcome!");

            // ------------------------------
            //  INNER TRY–CATCH (Level 2)
            // ------------------------------
            try {
                // This will throw ArrayIndexOutOfBoundsException 
                System.out.println(marks[9]); 
            
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This index is out of array. Exception handled in Level 2.");
            }

        } catch (Exception e) {
            // This catch block will run if the outer try has any unhandled exception
            System.out.println("Outer Exception: " + e);
        }

        System.out.println("Program finished normally.");
    }
}
