import java.util.*;
public class C6_Methods_in_java {
 
    //mothods is the function of java like c
    static int sum(int a,int b){
        int z;
        if (a<b) {
            z = a+b;
        }
        else{
            z=a-b;
        }
        return z;
    }

    //Method over Loading 
        void greet(){
            System.out.println("Good morning!");
        }
        void greet(int a){
            for(int i=0;i<a;i++)
                System.out.println("Good moening!");
        }
        void greet(String ch){
            System.out.println("Good morning! "+ ch);
        }
        
    //varargs
    static void asum(int ...arr){
        // available as int[] arr;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    
    
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers a,b:");
        a = sc.nextInt();
        b = sc.nextInt();
        int ans = sum(a, b);
        System.out.println(ans);
        
        // methods overloading
        C6_Methods_in_java ar = new C6_Methods_in_java();
        ar.greet();
        ar.greet(a);
        
        System.out.println();
        String ch = "Alex";
        ar.greet(ch);

        // varargs use case
        asum(a,b);
        
        asum(1,3,5,7);
        sc.close();
    }
}