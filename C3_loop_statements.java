public class C3_loop_statements {
    
    public static void main(String[] args) {
        
        // 1. For loop
        System.out.println("For loop:");
        for(int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        
        // 2. While loop
        System.out.println("\nWhile loop:");
        int j = 1;
        while(j <= 5) {
            System.out.println("j = " + j);
            j++;
        }
        
        // 3. Do-while loop
        System.out.println("\nDo-while loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while(k <= 5);
        
        // 4. For-each loop
        System.out.println("\nFor-each loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for(int num : numbers) {
            System.out.println("num = " + num);
        }
    }
}
