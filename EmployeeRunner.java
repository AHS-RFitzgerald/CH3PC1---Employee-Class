/**
 * Richard Fitzgerald
 * CH3PC1 - Employee Runner
 * Programming III - AP
 * 9/25/18
 */
public class EmployeeRunner {

   
    public static void main(String[] args) {
        Employee data = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        System.out.println("The employee's name is " + data.getname());
        System.out.println("The employee's ID number is " + data.getidNumber());
        System.out.println("The employee's department is " + data.getdepartment());
        System.out.println("The employee's department is " + data.getposition());
        
        System.out.println("");
        
        Employee data2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        System.out.println("The employee's name is " + data2.getname());
        System.out.println("The employee's ID number is " + data2.getidNumber());
        System.out.println("The employee's department is " + data2.getdepartment());
        System.out.println("The employee's department is " + data2.getposition());
        
        System.out.println("");
        
        Employee data3 = new Employee("Joy Rogers",81774, "Manufatoring", "Engineer");
        System.out.println("The employee's name is " + data3.getname());
        System.out.println("The employee's ID number is " + data3.getidNumber());
        System.out.println("The employee's department is " + data3.getdepartment());
        System.out.println("The employee's department is " + data3.getposition());
    }

}
