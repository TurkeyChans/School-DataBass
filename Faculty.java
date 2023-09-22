public class Faculty extends Employee {
    private Course[] coursesTaught;
    private int numCoursesTaught;
    private boolean isTenured;

    public Faculty() {
        super();
        this.coursesTaught = new Course[100];
        this.numCoursesTaught = 0;
        this.isTenured = false;
    }
    public Faculty(boolean isTenured) {
        super();
        coursesTaught = new Course[100];
        numCoursesTaught = 0;
        this.isTenured = isTenured;
    }
    public Faculty(String deptName, boolean isTenured) {
        super(deptName);
        this.coursesTaught = new Course[100];
        this.numCoursesTaught = 0;
        this.isTenured = isTenured;
    }
    public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
        super(name, birthYear, deptName);
        this.coursesTaught = new Course[100];
        this.numCoursesTaught = 0;
        this.isTenured = isTenured;
    }
    public boolean isTenured() {
        return isTenured;
    }
    public int getNumCoursesTaught() {
        return numCoursesTaught;
    }
    public void setTenured(boolean isTenured) {
        this.isTenured = isTenured;
    }
    // work on
    public void addCourseTaught(Course course) {
        if(numCoursesTaught < 100) {
            coursesTaught[numCoursesTaught] = course;
            numCoursesTaught += 1;
        }
    }
    public void addCoursesTaught(Course [] course) {
        this.coursesTaught = course;
    }

    public Course getCourseTaught(int index) {
        if (index < 0 || index > numCoursesTaught - 1) {
            return null;
        }
        return coursesTaught[index];
    }

    public String getCourseTaughtAsString(int index) {
        if (index < 0 || index > numCoursesTaught - 1) {
            return "";
        }
        return coursesTaught[index].getCourseDept() + "-" + coursesTaught[index].getCourseNum();
    }

    public String getAllCoursesTaughtAsString() {
       int i;
       String save = "";
       for (i = 0; i < numCoursesTaught; i++) {
            save = save + getCourseTaughtAsString(i) + ", ";
        }
       return save;
    }

    @Override
    public boolean equals(Object obj) {
        Faculty next = (Faculty) obj; 
        if(this.coursesTaught == next.coursesTaught && this.numCoursesTaught == next.numCoursesTaught && this.isTenured == next.isTenured) {
            return true;
        }
        return false;
    }

   @Override
   public String toString() {
       String Or = "";
       if(isTenured == true) {
            Or = "Is Tenured";
        }
       else {
            Or = "Not Tenured";
        }
    String ans = super.toString() + String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", Or, numCoursesTaught, getAllCoursesTaughtAsString());
    return ans;

   }

    @Override
    public int compareTo(Person p) {
        if(numCoursesTaught == ((Faculty) p).getNumCoursesTaught()){
            return 0;
        }

        else if(numCoursesTaught >= ((Faculty) p).getNumCoursesTaught()){
            return 1;
        }

        else{
            return -1;
        }
    }
}
