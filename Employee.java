public class Employee extends Person {
    private String deptName;
    private static int numEmployees;
    private int employeeID;

    public Employee()  {
        this.deptName = "";
        this.employeeID = ++numEmployees;
    }
    public Employee(String deptName) {
        this.deptName = deptName;
        this.employeeID = ++numEmployees;
    }
    public Employee(String name, int birthYear, String deptName) {
        super(name, birthYear);
        this.deptName = deptName;
        this.employeeID = ++numEmployees;
    }
    public String getDeptName() {
        return deptName;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public static int getNumEmployees() {
        return numEmployees;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    // worrk on from here
    @Override
    public boolean equals(Object obj) {
        Employee next = (Employee) obj; 
        if(this.deptName == next.deptName && this.employeeID == next.employeeID && this.numEmployees == next.numEmployees) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        String a = String.format(" Employee: Department: %20s | Employee Number: %3d" , deptName, employeeID);
        
        return super.toString() + a;
        
    }
    public int compareTo(Person p) {
        if(employeeID == ((Employee) p).getEmployeeID()){
            return 0;
        }

        else if(employeeID >= ((Employee) p).getEmployeeID()){
            return 1;
        }

        else{
            return -1;
        }
    }
}
