import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;




public class Registry 
{
   //private ArrayList<Student> students = new ArrayList<Student>();
   private TreeMap<String , Student> Students = new TreeMap<String , Student>();
   //private ArrayList<ActiveCourse> courses  = new ArrayList<ActiveCourse>();
   private TreeMap<String ,ActiveCourse> Courses = new TreeMap<String , ActiveCourse>();
   
   
   public Registry() throws IOException,FileNotFoundException {
	/**
	// Add some students
	   // in A2 we will read from a file
	   ArrayList<String> newnames = new ArrayList<String>();
	   Student s1 = new Student("JohnOliver", "34562");
	   Student s2 = new Student("HarryWindsor", "38467");
	   Student s3 = new Student("SophieBrown", "98345");
	   Student s4 = new Student("FaisalQuereshi", "57643");
	   Student s5 = new Student("GenghisKhan", "25347");
	   Student s6 = new Student("SherryTu", "46532");
	   students.add(s1);
	   students.add(s2);
	   students.add(s3);
	   students.add(s4);
	   students.add(s5);
	   students.add(s6);
	   // sort the students alphabetically - see class Student
	   for(int i = 0 ; i<students.size() ; i++) {
		   newnames.add(students.get(i).getName());   
	   }
	   
	   Collections.sort(newnames);
	   **/
	   File FileReader = new File("students.txt");
	   if(!FileReader.exists()) {
		   throw new FileNotFoundException("students.txt file not found");
	   }
	   
	   Scanner Linescanner = new Scanner(FileReader);
	   while(Linescanner.hasNextLine()) {
		  String Line = Linescanner.nextLine();
		  Scanner Wordscanner = new Scanner(Line);
		  String name = Wordscanner.next();
		  String id = Wordscanner.next();
		  Student s = new Student(name , id);
		  //System.out.println(name);
		  //System.out.println(id);
		  Students.put(id, s);
	   }
	   Linescanner.close();
	   
	
	   
	   
   
       
 
	   
	   ArrayList<Student> list = new ArrayList<Student>();
	   
	   // Add some active courses with students
	   String courseName = "Computer Science II";
	   String courseCode = "CPS209";
	   String descr = "Learn how to write complex programs!";
	   String format = "3Lec 2Lab";
	   list.add(Students.get("34562")); list.add(Students.get("98345")); list.add(Students.get("57643"));
	   //courses.add(new ActiveCourse(courseName,courseCode,descr,format,"W2020",list));
	   Courses.put(courseCode,new ActiveCourse(courseName,courseCode,descr,format,"W2020",list));
	   // Add course to student list of courses
	   Students.get("34562").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
	   Students.get("98345").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
	   Students.get("57643").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
	  
	   // CPS511
	   list.clear();
	   courseName = "Computer Graphics";
	   courseCode = "CPS511";
	   descr = "Learn how to write cool graphics programs";
	   format = "3Lec";
	   list.add(Students.get("34562")); list.add(Students.get("25347")); list.add(Students.get("46532"));
	   //courses.add(new ActiveCourse(courseName,courseCode,descr,format,"F2020",list));
	   Courses.put(courseCode,new ActiveCourse(courseName,courseCode,descr,format,"F2020",list));
	   Students.get("34562").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
	   Students.get("25347").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
	   Students.get("46532").addCourse(courseName,courseCode,descr,format,"W2020", 0);
	   
	   // CPS643
	   list.clear();
	   courseName = "Virtual Reality";
	   courseCode = "CPS643";
	   descr = "Learn how to write extremely cool virtual reality programs";
	   format = "3Lec 2Lab";
	   list.add( Students.get("34562")); list.add(Students.get("38467")); list.add(Students.get("57643")); list.add(Students.get("46532"));
	   //courses.add(new ActiveCourse(courseName,courseCode,descr,format,"W2020",list));
	   Courses.put(courseCode,new ActiveCourse(courseName,courseCode,descr,format,"W2020",list));
	   Students.get("34562").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
	   Students.get("38467").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
	   Students.get("57643").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
	   Students.get("46532").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
	   
	   
	   list.clear();
	   //CPS706
	     courseName = "Computer Networks";
	     courseCode = "CPS706";
	     descr = "Learn about Computer Networking";
	     format = "3Lec 1Lab";
	     list.add( Students.get("34562")); list.add(Students.get("38467")); list.add(Students.get("57643")); list.add(Students.get("46532"));
	     //courses.add(new ActiveCourse(courseName,courseCode,descr,format,"W2020",list));
	     Courses.put(courseCode,new ActiveCourse(courseName,courseCode,descr,format,"W2020",list));
	     Students.get("34562").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
		 Students.get("38467").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
		 Students.get("57643").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
		 Students.get("46532").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
	     
	     // CPS616
		list.clear(); 
	     courseName = "Algorithms";
	     courseCode = "CPS616";
	     descr = "Learn about Algorithms";
	     format = "3Lec 1Lab";
	     list.add( Students.get("34562")); list.add(Students.get("38467")); list.add(Students.get("57643")); list.add(Students.get("46532"));
	     //courses.add(new ActiveCourse(courseName,courseCode,descr,format,"W2020",list));
	     Courses.put(courseCode,new ActiveCourse(courseName,courseCode,descr,format,"W2020",list));
	     Students.get("34562").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
		 Students.get("38467").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
		 Students.get("57643").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
		 Students.get("46532").addCourse(courseName,courseCode,descr,format,"W2020", 0); 
	  
   }
   
   // Add new student to the registry (students array list above) 
   public boolean addNewStudent(String name, String id)
   {
	   // Create a new student object
	   // check to ensure student is not already in registry
	   // if not, add them and return true, otherwise return false
	   // make use of equals method in class Student
	   Student NewStudent = new Student(name , id);
	   if(id == "" ) return false;
	   Set<String> Studentid = Students.keySet();
	   for (String ID : Studentid) {
		   if(Students.get(ID).equals(NewStudent)) {
			   System.out.println("student " + name + " already registered");
		   }
		   //else if(!students.get(i).equals(NewStudent)) {
			   //students.add(NewStudent);
			   //return true;
			   }
	   for (String ID : Studentid) {
		   if(!Students.get(ID).equals(NewStudent)) {
			 Students.put(id , NewStudent);
			   return true;
			   }
		   }
	   //}
		  
			   return false;
	   
   }
   
   
   public TreeMap<String, ActiveCourse> getCourses(){
	   return Courses;
   }
   
   
   
   
	  
   // Remove student from registry 
   public boolean removeStudent(String studentId)
   {   
	   
	   // Find student in students arraylist/ students map
	   // If found, remove this student and return true
	   Set<String> ids = Students.keySet();
	   for(String ID : ids) {
		   if(Students.get(ID).getId().equalsIgnoreCase(studentId)) {
			  Students.remove(studentId);
			   return true;
			   
		   }
	   }
	   return false;
	   }
   
   // Print all registered students
   public void printAllStudents()
   {
	   for (String studentid : Students.keySet())
	   {
		   System.out.println("ID: " + studentid + " Name: " + Students.get(studentid).getName());   
	   }
	   
   }
   
   // Given a studentId and a course code, add student to the active course
   public void addCourse(String studentId, String courseCode)
   {    
	   Student student = null;
	   
	   // Find student object in registry (i.e. students arraylist students treemap now)
	   // Check if student has already taken this course in the past Hint: look at their credit course list
	   // If not, then find the active course in courses array list using course code
	   // If active course found then check to see if student already enrolled in this course
	   // If not already enrolled
	   //   add student to the active course
	   //   add course to student list of credit courses with initial grade of 0
	   for(String ids : Students.keySet()) {
		   if(Students.get(ids).getId().equalsIgnoreCase(studentId)) {
			  student = Students.get(studentId);		   
	    }
	   }
	   for(CreditCourse cc : student.courses) {
		 if(cc.getCode().equalsIgnoreCase(courseCode)) {
			 return;
		 }
	   }
	   if(student == null) return;
		   
	   for(String coursecode1 : Courses.keySet()) {
		   if(Courses.get(coursecode1).getCode().equalsIgnoreCase(courseCode)) {
			   ActiveCourse ac = Courses.get(coursecode1);
			   for(Student s1 : ac.getStudents()) {
				  if(s1.getId().equalsIgnoreCase(studentId)) {
					  return;
				  }
				   
			   }
			   ac.getStudents().add(student);
			   student.addCourse(ac.getName(), ac.getCode(), ac.getDescription(), ac.getFormat(), ac.getSemester(), 0);
		   }
	   }
	   
		   
   }  
   // Given a studentId and a course code, drop student from the active course
   public void dropCourse(String studentId, String courseCode)
   {   
	   Student STUDENT = null;
	   ArrayList<Student> STUDENTS;
	   ActiveCourse activecourse1 = null;
	   // Find the active course
	   // Find the student in the list of students for this course
	   // If student found:
	   //   remove the student from the active course
	   //   remove the credit course from the student's list of credit courses
	   
	   for(String coursecode1 : Courses.keySet()) {
		   if(Courses.get(coursecode1).getCode().equalsIgnoreCase(courseCode)) {
			   activecourse1 = Courses.get(coursecode1);
		   }
	   }
	   for(Student student1: activecourse1.getStudents()) {
		   if(student1.getId().equalsIgnoreCase(studentId)){
			  STUDENT = student1; 
		   }
	   }
	   if(STUDENT == null)  return;
	   activecourse1.removestudent(STUDENT);
	   //STUDENT.removeActiveCourse(courseCode);
	   STUDENT.courses.remove(activecourse1);
   }
   
   // Print all active courses
   public void printActiveCourses()
   {
	   for (String courseID : Courses.keySet())
	   {
		   ActiveCourse ac = Courses.get(courseID);
		   System.out.println(ac.getDescription());
	   }
   }
   
   // Print the list of students in an active course
   public void printClassList(String courseCode)
   {
	  ActiveCourse ac1 = null;  
	  for(String coursecode1 : Courses.keySet()) {
		  if(Courses.get(coursecode1).getCode().equalsIgnoreCase(courseCode)) {
			 ac1 = Courses.get(coursecode1) ; 
	    }
	  }
	   ac1.printClassList();
   }
   
   // Given a course code, find course and sort class list by student name
   public void sortCourseByName(String courseCode)
   {	
	   ActiveCourse ac3 = null;
	   for(String coursecode1 : Courses.keySet()) {
		   if(Courses.get(coursecode1).getCode().equalsIgnoreCase(courseCode)) {
			   ac3 = Courses.get(coursecode1) ;
		   }
	   }
	 ac3.sortByName();
	   
   }
   
   // Given a course code, find course and sort class list by student id
   public void sortCourseById(String courseCode)
   {
	   ActiveCourse ac4 = null;
	   for(String coursecode1 : Courses.keySet()) {
		   if(Courses.get(coursecode1).getCode().equalsIgnoreCase(courseCode)) {
			   ac4 = Courses.get(coursecode1) ;
		   }
	   }
	 ac4.sortById();
	   
   }
   
   // Given a course code, find course and print student names and grades
   public void printGrades(String courseCode)
   {
	   ActiveCourse ac5 = null;
	   for(String coursecode1 : Courses.keySet()) {
		   if(Courses.get(coursecode1).getCode().equalsIgnoreCase(courseCode)) {
			   ac5 = Courses.get(coursecode1);
			  //ac5.printGrades();
		   }
	   }
	   ac5.printGrades();
   }
   
   // Given a studentId, print all active courses of student
   public void printStudentCourses(String studentId)
   {
	Student object = null;
	for(String ids : Students.keySet()) {
	  if(Students.get(ids).getId().equalsIgnoreCase(studentId)) {
		  object = Students.get(ids) ; 
	  }
	}
	object.printActiveCourses();
   }
   
   // Given a studentId, print all completed courses and grades of student
   public void printStudentTranscript(String studentId)
   {
	   Student object1 = null;
		for(String ids : Students.keySet()) {
		  if(Students.get(ids).getId().equalsIgnoreCase(studentId)) {
			  object1 = Students.get(ids) ; 
		  }
		}
	   object1.printTranscript();
   }
   
   // Given a course code, student id and numeric grade
   // set the final grade of the student
   public void setFinalGrade(String courseCode, String studentId, double grade)
   {   // find the active course
	   // If found, find the student in class list
	   // then search student credit course list in student object and find course
	   // set the grade in credit course and set credit course inactive
	   
	   ActiveCourse activecourse = null ;
	   Student student = null;
	   for(String coursecode1 : Courses.keySet()) {
		   if(Courses.get(coursecode1).getCode().equalsIgnoreCase(courseCode)) {
			activecourse = Courses.get(coursecode1);  
		   }
		   }
	   
	   if(activecourse == null) return;
	   for(Student s1 : activecourse.getStudents()) {
		   if(s1.getId().equalsIgnoreCase(studentId)) {
			   student = s1;
		   }
	   }
	   for(CreditCourse cc : student.courses) {
		   if(cc.getCode().equalsIgnoreCase(courseCode)) {
			   cc.setGrade(grade);
			   cc.setInactive();
		   }
	   }
   
   }  
}




