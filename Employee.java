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
    
    /**
     *The setname method accepts an argument that is stored
     *in the name field.
    */
    public void setname(String Name){
        name = Name;
}
    /**
     *The setidNumber method accepts an argument that is stored
     *in the idNumber field.
    */
    public void setidNumber(int id){
        idNumber = id;
    }
    /**
     *The setdepartment method accepts an argument that is stored
     *in the department field.
    */
    public void setdepartment(String depart){
        department = depart;
    }
    /**
     *The setposition method accepts an argument that is stored
     *in the position field.
    */
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
    /**
     * the getposition method returns the position of the employee
     * @return 
     */
    public String getposition(){
        return position;
    }
    
    
    
    
    
}
