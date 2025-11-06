class C1{
    public int x = 2;
    protected int y = 3;
    int z = 5;
    private int a = 7;
    public void print(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class C25_Access_Modifiers {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.print();
        System.out.println(obj.x);
        // System.out.println(obj.a); -----> Cannot use private method
    }
}