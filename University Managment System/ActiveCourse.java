import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Active University Course
 
public class ActiveCourse extends Course
{
	private ArrayList<Student> students; 
	private String             semester;
	private int lectureStart;
	private int lectureDuration;
	private String lectureDay;
	
	   
   // Add a constructor method with appropriate parameters
   // should call super class constructor to initialize inherited variables
   // make sure to *copy* students array list being passed in into new arraylist of students
   // see class Registry to see how an ActiveCourse object is created and used
   public ActiveCourse(String name, String code, String descr, String fmt,String semester,ArrayList<Student> students)
   {
	super(name , code , descr , fmt);
	this.semester = semester;
	this.students = (ArrayList<Student>) students.clone();
	lectureStart = 0;
	lectureDuration = 0;
	lectureDay = "";

   }
   public int getStartTime() {
	   return  lectureStart;   
   }
   public int getDurationTime() {
	   return lectureDuration;
   }
   public String getLectureDay() {
	return lectureDay;   
   }
   
   public void setLectureStart(int time) {
	   lectureStart = time;
   }
   public void setDuration(int time) {
	   lectureDuration = time;
   }
   public void setLectureDay(String day) {
	   lectureDay = day;
	   
   }
   public void ResetLectureStart() {
	   lectureStart = 0;
   }
   public void ResetDuration() {
	   lectureDuration = 0;
   }
   public void ResetLectureDay() {
	   lectureDay = "" ;
   }
	   
   
   
   
   public String getSemester()
   {
	   return semester;
   }
   public ArrayList<Student> getStudents(){
	   return students;
   }
   public void addstudent(Student studentobject) {
	   students.add(studentobject);
   }
   public void removestudent(Student STUDENT) {
	   students.remove(STUDENT);
   }
   
   // Prints the students in this course  (name and student id)
   public void printClassList()
   { 
	   for(Student student1:students) {
		   System.out.println("StudentId: " + student1.getId() + "  Name :" + student1.getName());
	   }
	   
   }
   
   
   // Prints the grade of each student in this course (along with name and student id)
   // 
   public void printGrades()
   {
	for(Student students1 : students) {
		System.out.println(students1.getId() + " " + students1.getName() + " " + getGrade(students1.getId()));
	}
   }
   
   // Returns the numeric grade in this course for this student
   // If student not found in course, return 0 
   public double getGrade(String studentId)
   {
	  // Search the student's list of credit courses to find the course code that matches this active course
	  // see class Student /active courses method getGrade() 
	  // see class Student method getGrade() 
	  // return the grade stored in the credit course object
	  Student studentfound = null;
	  CreditCourse creditcourse1 = null;
	  for(Student studentref : students) {
		  if(studentref.getId().equalsIgnoreCase(studentId)) {
			  studentfound = studentref;
		  }
	  }
	  for(CreditCourse creditcourse : studentfound.courses) {
		  if(creditcourse.getCode().equalsIgnoreCase(this.getCode())){
			   creditcourse1 = creditcourse;
			  //coursename = super.getCode();
		  }
	  }
	  return creditcourse1.getGrade();
	  
	  //return 0; 
   }
   
   // Returns a String containing the course information as well as the semester and the number of students 
   // enrolled in the course
   // must override method in the superclass Course and use super class method getDescription()
   public String getDescription()
   {
	   return super.getDescription() +  semester + "" + students.size();
   }
    
   
   
   
   // Sort the students in the course by name using the Collections.sort() method with appropriate arguments
   // Make use of a private Comparator class below
   public void sortByName()
   {
 	  Collections.sort(students , new NameComparator());
   }
   
   // Fill in the class so that this class implement the Comparator interface
   // This class is used to compare two Student objects based on student name
   private class NameComparator implements Comparator<Student>
   {

	public int compare(Student o1, Student o2) {
	return	o1.getName().compareTo(o2.getName());
		
	}
   }
   
   // Sort the students in the course by student id using the Collections.sort() method with appropriate arguments
   // Make use of a private Comparator class below
   public void sortById()
   {
 	  Collections.sort(students , new IdComparator());
   }
   
   // Fill in the class so that this class implement the Comparator interface
   // This class is used to compare two Student objects based on student id
   private class IdComparator implements Comparator<Student>
   {

	
	public int compare(Student o1, Student o2) {
		return o1.getId().compareTo(o2.getId());
		
	}
   	
   }
}
