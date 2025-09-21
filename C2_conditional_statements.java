import java.util.Scanner;
public class C2_conditional_statements {

    public static void main(String[] args) {
        
        //if
        int a=6;
        if(a>0){
            System.out.println(a);
        }

        //else if
        if(a < 0){
            System.out.println(a*a);
        }
        else if(a == 0) {
            System.out.println(a);
        }
        else{
            System.out.println(a-a);
        }
        
        //Nested if
        int x = 3;
        int y = 6;
        int z = 2;
        if(x<y){
            if(x<z){
                System.out.println("x is smaller");
            }
            else{
                System.out.println("z is smaller");
            }
        }
        else{
            if(y<z){
                System.out.println("y is smaller");
            }
            else{
                System.out.println("z is smaller");
            }
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = sc.nextInt();

        //Switch case
        switch (month) {
            
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("may");
                break;

            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("sept");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
            System.out.println("wrong input");
                break;
            
        }
        sc.close();
    } 
}
