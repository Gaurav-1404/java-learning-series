public class C9_Oops_in_java {
    static class  Employee {
         
        int id;
        String name;
        int salary;
        public void printDetails(){
            System.out.println("My id is: "+ id );
            System.out.println("and My name is: "+name);
            System.out.println(name +"'s sallary is:"+ salary);
            System.out.println();
        }
        // how to get access private private key

        private int mobileNumber ;
        private String surName;

        public void setSurname(String n){ 
            surName = n;
        }
        public String getSurname(){
            return surName;
        }
        public void setMobileNumber(int n){
            mobileNumber =n;
        }
        public int getMobileNumber(){
            return mobileNumber;
        }

        }

        
    public static void main(String[] args) {
        
        Employee Alex =  new Employee(); // Instantiating a new Employee object
        Employee john = new Employee();

        //Setting Attributes for Alex
        Alex.id = 01;
        Alex.name = "Alexa";
        Alex.salary = 25000;
        
        //printing the attributes 
        // System.out.println(Alex.id);
        // System.out.println(Alex.name);

        Alex.printDetails();

        ///Setting Attributes for John
        john.id = 02;
        john.name = "John ";
        john.salary = 35000;
        john.printDetails();
 
        //gives error because private member/key can't access directly
        //john.setSurname = "Alcala";

        Alex.setSurname("Alcala");
        Alex.setMobileNumber(95678765);

        john.setMobileNumber(98765789);
        john.setSurname("Numer");

        System.out.println("john surname is:"+john.getSurname());
        System.out.println("john Mobile Number is: "+john.getMobileNumber());
        System.out.println();

        System.out.println("Alex surname is: "+Alex.getSurname());
        System.out.println("Alex Mobile Number is: "+ Alex.getMobileNumber());
    }
}
