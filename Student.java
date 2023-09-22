public class Student extends Person{
    private static int numStudents;
    private int studentID;
    private Course[] coursesTaken;
    private int numCoursesTaken;
    private boolean isGraduate;
    private String major = "undeclared";

    public Student() {
        super();
        this.coursesTaken = new Course[50];
        this.numCoursesTaken = 0;
        this.isGraduate = false;
        studentID = numStudents + 1; 		
        numStudents++;
    }
    public Student(boolean isGraduate) {
        super();
        this.coursesTaken = new Course[50];
        this.numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        studentID = numStudents + 1; 		
        numStudents++;
    }

    public Student(String major, boolean isGraduate) {
        super();
        this.major = major;
        this.coursesTaken = new Course[50];
        this.numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        studentID = numStudents + 1; 		
        numStudents++;
    }
    
    public Student(String name, int birthYear, String major, boolean isGraduate) {
        super(name, birthYear);
        this.major = major;
        this.coursesTaken = new Course[50];
        this.numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        studentID = numStudents + 1; 		
        numStudents++;
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    public int getNumCoursesTaken() {
        return numCoursesTaken;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public int getStudentID() {
        return studentID;
    }
    
    public String getMajor() {
        return major;
    }

    public void setGraduate(boolean isGraduate) {
        this.isGraduate = isGraduate;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addCourseTaken(Course course) {
        if(numCoursesTaken < 50) {
            coursesTaken[numCoursesTaken] = course;
            numCoursesTaken += 1;
        }
    }
    public void addCoursesTaken(Course [] course) {
        this.coursesTaken = course;
    }

    public Course getCourseTaken(int index) {
        if (index < 0 || index > numCoursesTaken - 1) {
            return null;
        }
        return coursesTaken[index];
    }

    public String getCourseTakenAsString(int index) {
        if (index < 0 || index > numCoursesTaken - 1) {
            return "";
        }
        return coursesTaken[index].getCourseDept() + "-" + coursesTaken[index].getCourseNum();
    }

    public String getAllCoursesTakenAsString() {
        int i;
        String save = "";
        for (i = 0; i < numCoursesTaken; i++) {
            save = save + getCourseTakenAsString(i) + ", ";
        }
        return save;
    }

    @Override
    public boolean equals(Object obj) {
        Student next = (Student) obj; 
        // TODO Auto-generated method stub
        if(this.numStudents == next.numStudents && this.studentID == next.studentID && this.numCoursesTaken == next.numCoursesTaken && this.isGraduate == next.isGraduate && this.major == next.major && this.coursesTaken == next.coursesTaken) {
            return true;
        }
        else {
            return false;
        }
        
    }

    @Override
    public String toString() {
        String check = "";
        if(isGraduate == true) {
            check = "Graduate";
        }
        else {
            check = "Undergraduate";
        }
    String ans = super.toString() + String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, check, numCoursesTaken, getAllCoursesTakenAsString());
    return ans;
    }

    @Override
    public int compareTo(Person p) {
        if(numCoursesTaken == ((Student) p).getNumCoursesTaken()){
            return 0;
        }

        else if(numCoursesTaken >= ((Student) p).getNumCoursesTaken()){
            return 1;
        }

        else{
            return -1;
        }
    }
        // numCoursesTaken
    
}



