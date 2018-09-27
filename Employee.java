/**
 * Richard Fitzgerald
 * CH3PC1 - Employee Class
 * 9/25/18
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    /**
     * Employee class constructor Initializes the fields
     * name, idNumber, department, position.
     */
    
    public Employee(String Name, int id, String depart, String pos){
        name = Name;
        idNumber = id;
        department = depart;
        position = pos;
    }
    
    
    
    
    public void setname(String Name){
        name = Name;
}
    public void setidNumber(int id){
        idNumber = id;
    }
    public void setdepartment(String depart){
        department = depart;
    }
    public void setposition(String pos){
        position = pos;
    }
    /**
     * The getname method returns the name of the employee
     */
    
    public String getname(){
        return name;
    }
    /**
     *The getidNumber method returns the id Number of the employee. 
     */
    public int getidNumber(){
        return idNumber;
    }
    /**
     * The getdepartment method returns the department of the employee 
     */
    public String getdepartment(){
        return department;
    }
    public String getposition(){
        return position;
    }
    
    
    
    
    
}
