public class GeneralStaff extends Employee {
    private String duty;
    public GeneralStaff() {
        super();
        this.duty = "";
    }
    public GeneralStaff(String duty) {
        super();
        this.duty = duty;
    }
    public GeneralStaff(String depString, String duty) {
        super(depString);
        this.duty = duty;
    }
    public GeneralStaff(String name, int birthYear, String deptName, String duty) {
        super(name, birthYear, deptName);
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }
    //work on
    @Override
    public boolean equals(Object obj) {
        GeneralStaff next = (GeneralStaff) obj;
        if(this.duty == next.duty) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String toString() {
        return super.toString() + String.format(" GeneralStaff: Duty: %10s", duty);
    }
}
