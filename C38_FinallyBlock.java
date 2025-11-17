public class C38_FinallyBlock {

    public static void main(String[] args) {
        try{
            int a = 5;
            int b = 0;
            int c = a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is the end of program");
        }
    }
}