import java.util.Scanner;

class negativeRadiusException extends Exception{
    public String getMessage(){
        return "Radius can't be negative";
    }
}
public class C37_throwAndThrows {
    public static double area(int r)throws negativeRadiusException{
        if(r<0){
            throw new negativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int c = divide(6, 1);
            System.out.println(c);

            int r = sc.nextInt();
            System.out.println(area(r));
        }
        catch(negativeRadiusException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception  " + e);
        }
        sc.close();
    }
}
