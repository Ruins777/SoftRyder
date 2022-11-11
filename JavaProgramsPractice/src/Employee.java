public class Employee {
    public static void main(String[] args) {

        EmployeeData e1 = new EmployeeData();

        //setting values to the variable
        e1.setName("Rohit");
        e1.setEmp_id(713);
        e1.setSalary(5000);
        e1.setPosition("Senior QA Engineer");

        //Displaying the values of the variable
        System.out.println("************************************************");
        System.out.println("Employee Name:- " +e1.getName());
        System.out.println("Employee Id:- " +e1.getEmp_id());
        System.out.println("Employee Salary:- " +e1.getSalary());
        System.out.println("Employee Position:- " +e1.getPosition());
        System.out.println("************************************************");
    }
}