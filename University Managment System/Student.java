 import java.util.ArrayList;

// Make class Student implement the Comparable interface
// Two student objects should be compared by their name
public class Student
{
  private String name;
  private String id;
  public  ArrayList<CreditCourse> courses; // all the courses the student has taken and is currently taken
  
  
  public Student(String name, String id)
  {
	 this.name = name;
	 this.id   = id;
	 courses   = new ArrayList<CreditCourse>();
  }
  
  public String getId()
  {
	  return id;
  }
  
  public String getName()
  {
	  return name;
  }
  
  
  
  // add a credit course to list of courses for this student
  public void addCourse(String courseName, String courseCode, String descr, String format,String sem, double grade)
  {
	  // create a CreditCourse object
	  // set course active
	  // add to courses array list
	  CreditCourse Courses = new CreditCourse(courseName , courseCode , descr , format , sem , grade);
	  Courses.setActive();
	  courses.add(Courses);
	  
  }
  public ArrayList<CreditCourse> getcourses(){
	  return courses;
  }
   
  
  
  // Prints a student transcript
  // Prints all completed (i.e. non active) courses for this student (course code, course name, 
  // semester, letter grade
  // see class CreditCourse for useful methods
  public void printTranscript()
  {
	for(CreditCourse Courses1 : courses) {
		Courses1.displayGrade();
	}
	  
  }
  
  // Prints all active courses this student is enrolled in
  // see variable active in class CreditCourse
  public void printActiveCourses()
  { 
	  for(CreditCourse course : courses) {
		  if(course.getActive() == true) {
			  course.displayGrade();
		  }
	  }
	 
	 
  }
  public void removecourse(CreditCourse activecourse1) {
	  courses.remove(activecourse1);
  }
  
  // Drop a course (given by courseCode)
  // Find the credit course in courses arraylist above and remove it
  // only remove it if it is an active course
  public void removeActiveCourse(String courseCode)
  {
	  for(CreditCourse course1 : courses) {
		  if(course1.getCode().equalsIgnoreCase(courseCode)) {
			 System.out.print(course1.getCode()); 
			  if(course1.getActive() == true) {
				  courses.remove(course1);
			  }
		  }
	  }
	 
  }
  
  public String toString()
  {
	  return "Student ID: " + id + " Name: " + name;
  }
  
  // override equals method inherited from superclass Object
  // if student names are equal *and* student ids are equal (of "this" student
  // and "other" student) then return true
  // otherwise return false
  // Hint: you will need to cast other parameter to a local Student reference variable
  public boolean equals(Object other)
  {
	  Student ref = (Student) other;
	  if(this.name.equalsIgnoreCase(ref.getName()) && this.id.equalsIgnoreCase(ref.getId())) {
		  return true;
	  }
	  
	  return false;
  }
  
}

