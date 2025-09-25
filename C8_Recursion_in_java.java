public class C8_Recursion_in_java {

    static void factorial(int n,int fact){

        if(n==0){
            System.out.println(fact);
            return;
        }
        fact *= n;
        factorial(n-1, fact);
    }
    //pattern
    /*
     * 
     * *
     * * *
     * * * *
     * * * * *
     */
    static void pattern1(int n){
        
        for(int i=0;i<n;i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // print sum of n natural number
    static void sum(int n , int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        sum(n-1, sum);
    }

    // pattern using recursion
    static void parttern1Recusion(int n,int idx){
        if(idx==n){
            return;
        }
        for(int i=0;i<=idx;i++){
            System.out.print("* ");
        }
        System.out.println();
        parttern1Recusion(n, idx+1);
    }


    public static void main(String[] args) {

        int a=5;
        factorial(a,1);

        //parttern 1
        pattern1(a);

        //sum n netural numeber
        sum(20, 0);

        //pattern 1 Using Recursion
        parttern1Recusion(a, 0);
        
    }
}
