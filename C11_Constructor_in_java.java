class MyMainEmployee{
    
    private int id;
    private String name;
    int salary;
    
    // public MyMainEmployee(){
    //     id = 45;
    //     name = "Your Name Here";
    // }

    public MyMainEmployee(String myName,int myId,int s){
        id = myId;
        name = myName;
        salary = s;
    }

    public String getName(){return name;}
    public int getId(){return id;}
    public void setName(String n){this.name = n;}
    public void setId(int n){this.id = n;}
    public void setSalary(int n){this.salary = n;}
    public int getSalary(){return salary;}
    
}
public class C11_Constructor_in_java  {
    public static void main(String[] args) {
        
        MyMainEmployee Alex = new MyMainEmployee("Alex Numer",34,45000);
        
        // Alex.setId(967589);
        // Alex.setName("Alex Numar");

        System.out.println(Alex.getId());
        System.out.println(Alex.getName());
        System.out.println(Alex.getSalary());

    }

}

