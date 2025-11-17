import java.net.Socket;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString() + " I am a tString()";
    }
    public String getMessage(){
        return "I am a getMessage()";
    }
}
public class C36_ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println();
                e.printStackTrace();
            }
        }
    }
}
