public class C10_Oops_class_methods_practice {
    static class Employee {

        int salary;
        int getSalary() {
            return salary;
        }
        String name;
        String getName(){
            return name;
        }
        void setName (String newName){
            name = newName;
        }
        
    }
    static class Square {
    
        int side;
        public int area(){
            return(side*side);
        }
        public int perimeter(){
            return(4*side);
        }
    }
    // games type class
    static class TommyVecetti {

        // methods for different actions
        void hit() {
            System.out.println("Tommy is hitting!");
        }

        void run() {
            System.out.println("Tommy is running!");
        }

        void fire() {
            System.out.println("Tommy is firing!");
        }
    }



    public static void main(String[] args) {
        
        Employee Alex = new Employee();
        Employee Bhavya = new Employee();
        Alex.salary = 23000;
        Bhavya.salary = 25000;
        Alex.name = "Alex alcala";
        Bhavya.name = "Bhavya bhati";

        System.out.println(Alex.getName());
        System.out.println(Alex.salary);
        System.out.println();

        System.out.println(Bhavya.getName());
        System.out.println(Bhavya.salary);
        System.out.println();

        Bhavya.setName("Muskan");
        System.out.println(Bhavya.getName());
        System.out.println();

        //Square class Objects

        Square A1 = new Square();
        Square A2 = new Square();
        A1.side = 10;
        A2.side = 5;
        System.out.println("Square A1 area is: "+A1.area());
        System.out.println("Square A2 area is: "+A2.area());
        System.out.println();
        System.out.println("A1 perimeter is : "+ A1.perimeter());
        System.out.println("A2 perimeter is : "+A2.perimeter());

        // TommyVecetti class

        TommyVecetti tommy = new TommyVecetti();
        System.out.println();
        // calling methods
        tommy.hit();
        tommy.run();
        tommy.fire();

    }
    
}
