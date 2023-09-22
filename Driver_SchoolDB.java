// https://youtu.be/7QssSDzZfBg
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Driver_SchoolDB {
	static Course[] course = new Course[100];
	static Student[] student = new Student[100];
	static Faculty[] faculty = new Faculty[100];
	static GeneralStaff[] generalstaff = new GeneralStaff[100];

	
	

	public static String Start_End_tags() {
		return "**************************************************************";
	}

	public static String Mid_tag() {
		return "************************************************";
	}
	
	
	public static void main(String[] args) throws IOException {
		
		int i;
		boolean s;
		try {
		File file = new File("SchoolDB_Initial.txt");
		Scanner scan = new Scanner(file);
			s = true;
		}
		catch (FileNotFoundException e) {
			s = false;
		}
		
		
		
		
		//display
		
		if(s) {
		File file = new File("SchoolDB_Initial.txt");
		Scanner scan = new Scanner(file);

		//display
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		Course c1 = new Course(true, 771, "MAT", 4);
		Course c2 = new Course(true,777,"CMP",4);
		Course c3 = new Course(true,711,"CMP",4);
		Course c4 = new Course(true,723,"MAT",4);
		Course c5 = new Course(false,168,"CMP",4);
		Course c6 = new Course(false,338,"CMP",4);

		Faculty f1 = new Faculty();
		Faculty f2 = new Faculty(true);
		Faculty f3 = new Faculty("MAT", false);
		Faculty f4 = new Faculty("Superman",1938,"PHY",true);

		GeneralStaff g1 = new GeneralStaff();
		GeneralStaff g2 = new GeneralStaff("advise students");
		GeneralStaff g3 = new GeneralStaff("Sanitation","clean");
		GeneralStaff g4 = new GeneralStaff("Flash Gordon",1934,"Security","safety");

		Student s1 = new Student();
		Student s2 = new Student(false);
		Student s3 = new Student("Math", false);
		Student s4 = new Student("Wonderwoman",1941,"JST",true);
		System.out.println();
		System.out.println(Start_End_tags());
		System.out.println("SCHOOL DATABASE INFO:");
		System.out.println();
		System.out.println(Mid_tag());
		System.out.println("COURSES:");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(Mid_tag());
		System.out.println(Mid_tag());
		System.out.println("PERSONS:");
		System.out.println(Mid_tag());
		System.out.println(Mid_tag());
		System.out.println("EMPLOYEES:");
		System.out.println(Mid_tag());
		System.out.println(Mid_tag());
		System.out.println("GENERAL STAFF:");
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		System.out.println(Mid_tag());
		System.out.println(Mid_tag());
		System.out.println("FACULTY:");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(Mid_tag());
		System.out.println(Mid_tag());
		System.out.println("STUDENTS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(Mid_tag());
		System.out.println(Start_End_tags());
		System.out.println();
		}
		
		else {
			FileWriter writer = new FileWriter("SchoolDB_Updated.txt");
			String f_exit = "N";
			String f_course_name1 = "";
			int f = 0;
			int a = 0;
			int s1 = 0;
			int gs = 0;
			int c = 0;
			boolean c_gradu;
			boolean f_ten = false;
			String c_writer;
			String f_name1;
			int f_num1 = 0; 
			boolean s_ten = false;
			boolean f_scan_course_name = false;
			boolean exit = false;
			String menu;
			
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a couser for graduate or undergraduate. Type 'G' for Graduate or 'U' for Undergraduate");
			String c_under = input.next();
			
			if(c_under.equals("G")) {
				c_gradu = true;
				c_writer = "true";
			}
			else {
				c_gradu = false;
				c_writer = "false";
			}
			System.out.println("Please enter a course for number of the course");
			
			int c_number = input.nextInt();
			
			System.out.println("Please enter a course for name of the course");
			
			String c_name = input.next();
			
			System.out.println("Please enter a course for credits of the course");
			
			int c_creadits = input.nextInt();
			
			writer.write("Course: " + c_writer + ", " + c_number + ", " + c_name + ", " + c_creadits);
			
			
			Course course1 = new Course(c_gradu, c_number, c_name, c_creadits);
			
			course[c] = course1;
			c++;
			do {
				
			System.out.println("Selete one of the school datebass type");
			System.out.println("Type 'Faculty': Create a faculty");
			System.out.println("Type 'Student': Create a student");
			System.out.println("Type 'GenralStaff': Create a genral staff");
			System.out.println("Type 'Course': Create a Course");
			System.out.println("Type 'Exit': To exit the program");
			
			menu = input.next();
			if(menu.equals("Faculty")) {
			do {
				System.out.println("Is faculty tenured Y/N / if unkown type 'none'");
				String f_Tenured = input.next();
				if(!f_Tenured.equals("none")) {
					
				if(f_Tenured.equals("Y")) {
					f_ten = true;
				}
				
				else {
					f_ten = false;
				}
				
				}
				System.out.println("Name of the course the faculty teaching / if unkown type 'none'");
				String f_course_name = input.next();
				
				
				System.out.println("Name of the faculty / if unkown type 'none'");
				String f_name = input.next();
				
				System.out.println("Birth year of the faculty / if unkown type '0'");
				int f_num = input.nextInt();
				
				if(f_Tenured.equals("none")) {
					Faculty Faculty1 = new Faculty();
					faculty[f] = Faculty1;
					f++;
					writer.write(String.format("\n")); 
					writer.write("Faculty:");
					
					
				}
				else if(f_course_name.equals("none")) {
					Faculty Faculty2 = new Faculty(f_ten);
					faculty[f] = Faculty2;
					f++;
					writer.write(String.format("\n")); 
					writer.write("Faculty: " + f_ten);
				
				}
				else if(f_name.equals("none")) {
					Faculty Faculty3 = new Faculty(f_course_name, f_ten);
					faculty[f] = Faculty3;
					f++;
					writer.write(String.format("\n"));
					writer.write("Faculty: " + f_course_name + "," + f_ten);
					
				}
				
				else if(f_num != 0) {
					Faculty Faculty4 = new Faculty(f_name, f_num, f_course_name, f_ten);
					faculty[f] = Faculty4;
					f++;
					writer.write(String.format("\n")); 
					writer.write("Faculty: " + f_name + "," + f_num + "," + f_course_name + "," + f_ten);
					
				}
				
				System.out.println("Want to make a new faculty Y/N");
				f_exit = input.next();
				
			}while(f_exit.equals("Y"));
			writer.write(String.format("\n"));
			f_exit = "";
			}
			
			else if(menu.equals("Student")) {
				do {
					System.out.println("Is student graduate or undergraduate. Type 'G' for graduate or 'U' for undergraduate / If unkown type 'none'");
					String s_Tenured = input.next();
					if(!s_Tenured.equals("none")) {
						
					if(s_Tenured.equals("Y")) {
						s_ten = true;
					}
					
					else {
						s_ten = false;
					}
					
					}
					System.out.println("What's the student major / If unkown type 'none'");
					String s_course_name = input.next();
					
					
					System.out.println("Name of the student / if unkown type 'none'");
					String s_name = input.next();
					
					System.out.println("Birth year of the student / if unkown type '0'");
					int s_num = input.nextInt();
					
					if(s_Tenured.equals("none")) {
						Student Student1 = new Student();
						student[s1] = Student1;
						s1++;
						writer.write(String.format("\n")); 
						writer.write("Student:");
						
						
					}
					else if(s_course_name.equals("none")) {
						Student Student2 = new Student(s_ten);
						student[s1] = Student2;
						s1++;
						writer.write(String.format("\n")); 
						writer.write("Student: " + s_ten);
					
					}
					else if(s_name.equals("none")) {
						Student Student3 = new Student(s_course_name, s_ten);
						student[s1] = Student3;
						s1++;
						writer.write(String.format("\n"));
						writer.write("Student: " + s_course_name + "," + s_ten);
						
					}
					
					else if(s_num != 0) {
						Student Student4 = new Student(s_name, s_num, s_course_name, s_ten);
						student[s1] = Student4;
						s1++;
						writer.write(String.format("\n")); 
						writer.write("Student: " + s_name + "," + s_num + "," + s_course_name + "," + s_ten);
						
					}
					
					System.out.println("Want to make a new Student Y/N");
					f_exit = input.next();
					
				}while(f_exit.equals("Y"));
				writer.write(String.format("\n"));
				f_exit = "";
			}
			else if(menu.equals("GenralStaff")) {
				do {
					System.out.println("What is the general staff duty / if unkown type 'none'");
					String gs_duty = input.next();
					
					System.out.println("What is general staff department / if unkown type 'none'");
					String gs_dep = input.next();
					
					
					System.out.println("Name of the general staff / if unkown type 'none'");
					String gs_name = input.next();
					
					System.out.println("Birth year of the general staff / if unkown type '0'");
					int gs_num = input.nextInt();
					
					if(gs_duty.equals("none")) {
						GeneralStaff GeneralStaff1 = new GeneralStaff();
						generalstaff[gs] = GeneralStaff1;
						gs++;
						writer.write(String.format("\n")); 
						writer.write("GeneralStaff:");

					}
					else if(gs_dep.equals("none")) {
						GeneralStaff GeneralStaff2 = new GeneralStaff(gs_duty);
						generalstaff[gs] = GeneralStaff2;
						gs++;
						writer.write(String.format("\n")); 
						writer.write("GeneralStaff: " + gs_duty);
					
					}
					else if(gs_name.equals("none")) {
						GeneralStaff GeneralStaff3 = new GeneralStaff(gs_dep, gs_duty);
						generalstaff[gs] = GeneralStaff3;
						gs++;
						writer.write(String.format("\n"));
						writer.write("GeneralStaff: " + gs_dep + "," + gs_duty);
						
					}
					
					else if(gs_num != 0) {
						GeneralStaff GeneralStaff3 = new GeneralStaff(gs_name, gs_num, gs_dep, gs_duty);
						generalstaff[gs] = GeneralStaff3;
						gs++;
						writer.write(String.format("\n")); 
						writer.write("GeneralStaff: " + gs_name + "," + gs_num + "," + gs_dep + "," + gs_duty);
						
					}
					
					System.out.println("Want to make a new general staff Y/N");
					f_exit = input.next();
					
				}while(f_exit.equals("Y"));
				writer.write(String.format("\n"));
				f_exit = "";
				
			}
			else if(menu.equals("Course")) {
				do {
				System.out.println("Please enter a couser for graduate or undergraduate. Type 'G' for graduate or 'U' for undergraduate");
				c_under = input.next();
				
				if(c_under.equals("G")) {
					c_gradu = true;
					c_writer = "true";
				}
				else {
					c_gradu = false;
					c_writer = "false";
				}
				System.out.println("Please enter a course for number of the course");
				
				c_number = input.nextInt();
				
				System.out.println("Please enter a course for name of the course");
				
				c_name = input.next();
				
				System.out.println("Please enter a course for credits of the course");
				
				c_creadits = input.nextInt();
				
				writer.write("Course: " + c_writer + ", " + c_number + ", " + c_name + ", " + c_creadits);
				Course course2 = new Course(c_gradu, c_number, c_name, c_creadits);
				
				course[c] = course2;
				c++;
				System.out.println("Want to make a new course Y/N");
				f_exit = input.next();
				
			}while(f_exit.equals("Y"));
				
			}
			f_exit = "";
			
			}while(!menu.equals("Exit"));
			
			writer.close();
			System.out.println();
			System.out.println(Start_End_tags());
			System.out.println("SCHOOL DATABASE INFO:");
			System.out.println();
			System.out.println(Mid_tag());
			for(i = 0; i < course.length; ++i) {
				if(course[i] == null) {
					
					break;
				}
				else {
					System.out.println(course[i]);
				}
		}
			System.out.println(Mid_tag());
			System.out.println(Mid_tag());
			System.out.println("PERSONS:");
			System.out.println(Mid_tag());
			System.out.println(Mid_tag());
			System.out.println("EMPLOYEES:");
			System.out.println(Mid_tag());
			System.out.println(Mid_tag());
			for(i = 0; i < generalstaff.length; ++i) {
				if(generalstaff[i] == null) {
					break;
				}
				else {
					System.out.println(generalstaff[i]);
				}
				
	
		}
			System.out.println(Mid_tag());
			System.out.println(Mid_tag());
			for(i = 0; i < faculty.length; ++i) {
				if(faculty[i] == null) {
					break;
				}
				else {
					System.out.println(faculty[i]);
				}
				
		
		}
			System.out.println(Mid_tag());
			System.out.println(Mid_tag());
			for(i = 0; i < student.length; ++i) {
				if(student[i] == null) {
					break;
				}
				else {
					System.out.println(student[i]);
				}
				
		
		}
			System.out.println(Mid_tag());
			System.out.println(Start_End_tags());
			System.out.println();
		}
	}
}

