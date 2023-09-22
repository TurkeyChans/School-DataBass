public class Course {
    private boolean isGraduateCourse;
    private int courseNum;
    private String courseDept;
    private int numCredits;

    public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
        this.isGraduateCourse = isGraduateCourse;
        this.courseNum = courseNum;
        this.courseDept = courseDept;
        this.numCredits = numCredits;
    }
    public boolean isGraduateCourse() {
        return isGraduateCourse;
    }
    public int getCourseNum() {
        return courseNum;
    }
    public String getCourseDept() {
        return courseDept;
    }
    public int getNumCredits() {
        return numCredits;
    }
    public String getCourseName() {
        if(isGraduateCourse == true) {
            return "G" + courseDept + courseNum;
        }
        else {
            return "U" + courseDept + courseNum;
        }
    }
    @Override
    public boolean equals(Object obj) {
        Course next = (Course) obj; 
        if(this.courseNum == next.courseNum && this.courseDept == next.courseDept && this.numCredits == next.numCredits && this.isGraduateCourse == next.isGraduateCourse) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        if(isGraduateCourse == true) {
            String Ans = String.format("Course: %3s-%3d | Number of Credits: %02d | Graduate", courseDept, courseNum, numCredits, isGraduateCourse);
            return Ans;
        }
        else {
            String Ans = String.format("Course: %3s-%3d | Number of Credits: %02d | Undergraduate", courseDept, courseNum, numCredits, isGraduateCourse);
            return Ans;
        }
    }
    public int compareTo(Course c) {
        
        if(courseNum == c.getCourseNum()){
            return 0;
        }

        else if(courseNum >= c.getCourseNum()){
            return 1;
        }

        else{
            return -1;
        }
        
    }
}
