interface CollegeSample{
    void college1();
    void college2();
}
interface StudentSample extends CollegeSample{
    void student1();
    void student2();
}
class Student implements StudentSample{
    public void student1(){
        System.out.println("Alpha");
    }
    public void student2(){
        System.out.println("Bravo");
    }
    // we have to declare the function of root interface/ parent interface
    public void college1(){
        System.out.println("College ABCD");
    }
    public void college2(){
        System.out.println("College EFGH");
    }
}

public class C21_inheritance_in_interfaces {
    public static void main(String[] args) {
        
        Student st1 = new Student();

        st1.student1();
        st1.student2();
        st1.college1();
        st1.college2();
    }
}
