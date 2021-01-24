import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentRegistrySimulator 
{
  public static void main(String[] args) throws IOException 
  {
	 
	try {
		Registry registry = new Registry();
		//Scheduler schedule1 = new Scheduler(registry.getCourses());
	} 
	catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		System.exit(0);
		}
	catch(NoSuchElementException e) {
		System.out.print("bad file format students.txt");
		System.exit(0);
	}
	catch(IOException e) {
		System.exit(0);
	}
	Registry registry = new Registry();
	Scheduler schedule1 = new Scheduler(registry.getCourses());
	
	
	
	  
	  Scanner scanner = new Scanner(System.in);
	  System.out.print(">");
	  
	  // everything works broski
	  
	  while (scanner.hasNextLine())
	  {
		  String inputLine = scanner.nextLine();
		  if (inputLine == null || inputLine.equals("")) continue;
		  
		  Scanner commandLine = new Scanner(inputLine);
		  String command = commandLine.next();
		  
		  if (command == null || command.equals("")) continue;
		  
		  else if (command.equalsIgnoreCase("L") || command.equalsIgnoreCase("LIST"))
		  {
			  registry.printAllStudents();
		  }
		  else if (command.equalsIgnoreCase("Q") || command.equalsIgnoreCase("QUIT"))
			  return;
		  
		  else if (command.equalsIgnoreCase("REG"))
		  {
			  // register a new student in registry
			  // get name and student id string 
			  // e.g. reg JohnBoy 74345
			  // Checks:
			  //  ensure name is all alphabetic characters
			  //  ensure id string is all numeric characters
			  String nameinput = commandLine.next();
			  if(commandLine.hasNext()) {
			  String idinput = commandLine.next();
			  if(!nameinput.matches("^[a-zA-Z]*$")){
				  System.out.println("Invalid Charactersin Name " + nameinput);
			  }
			  else if(!idinput.matches("^[0-9]*$")) {
				System.out.print("invalid charatcers in ID" + idinput); 
			  }
			  else {
				  registry.addNewStudent(nameinput, idinput);
			  }
				  
			  }  
			  
		  }
		  else if (command.equalsIgnoreCase("DEL"))
		  {
			  // delete a student from registry
			  // get student id
			  // ensure numeric
			  // remove student from registry
			  String studentid = commandLine.next();
			  if(!studentid.matches("^[0-9]*$")){
				  System.out.print("invalid charatcers in ID" + studentid);  
			  }
			  else {
				  registry.removeStudent(studentid);
			  }
		  }
		  
		  else if (command.equalsIgnoreCase("ADDC"))
		  {
			 // add a student to an active course
			 // get student id and course code strings
			 // add student to course (see class Registry)
			String studentid =   commandLine.next();
			String coursename = commandLine.next();
			registry.addCourse(studentid, coursename);
			 
		  }
		  else if (command.equalsIgnoreCase("DROPC"))
		  {
			  // get student id and course code strings
			  // drop student from course (see class Registry)
			String studentid = commandLine.next();
			String coursename = commandLine.next();
			registry.dropCourse(studentid, coursename);
		  }
		  else if (command.equalsIgnoreCase("PAC"))
		  {
			  // print all active courses
			  registry.printActiveCourses();
		  }		  
		  else if (command.equalsIgnoreCase("PCL"))
		  {
			  // get course code string
			  // print class list (i.e. students) for this course
			  String coursecode = commandLine.next();
			  registry.printClassList(coursecode);
		  }
		  else if (command.equalsIgnoreCase("PGR"))
		  {
			  // get course code string
			  // print name, id and grade of all students in active course
			  String coursecode = commandLine.next();
			  registry.printGrades(coursecode);
		  }
		  else if (command.equalsIgnoreCase("PSC"))
		  {
			  // get student id string
			  // print all credit courses of student
			  String idstring = commandLine.next();
			  registry.printStudentCourses(idstring);
		  }
		  else if (command.equalsIgnoreCase("PST"))
		  {
			  // get student id string
			  // print student transcript
			  String studentid = commandLine.next();
			  registry.printStudentTranscript(studentid);
			  
		  }
		  else if (command.equalsIgnoreCase("SFG"))
		  {
			  // set final grade of student
			  // get course code, student id, numeric grade
			  // use registry to set final grade of this student (see class Registry)
			  String coursecode = commandLine.next();
			  String studentid = commandLine.next();
			  double grade = commandLine.nextDouble();
			  registry.setFinalGrade(coursecode, studentid, grade);
		  }
		  else if (command.equalsIgnoreCase("SCN"))
		  {
			  // get course code
			  // sort list of students in course by name (i.e. alphabetically)
			  // see class Registry
			  String coursecode = commandLine.next();
			  registry.sortCourseByName(coursecode);
		  }
		  else if (command.equalsIgnoreCase("SCI"))
		  {
			// get course code
			// sort list of students in course by student id
			// see class Registry
			String coursename = commandLine.next();
			registry.sortCourseById(coursename);
		  }
		  else if (command.equalsIgnoreCase("PSCH"))
		  {
			  
			schedule1.printSchedule();
		  }
		  else if (command.equalsIgnoreCase("SCH"))
		  {
			  
			String coursename = commandLine.next();
			String day =  commandLine.next();
			int time = commandLine.nextInt();
			int duration = commandLine.nextInt();
			try {
				schedule1.setDayAndTime(coursename, day, time, duration);
				
				
			}
			catch(unknownCourseException e) {
				System.out.print(e.getMessage());
				
			}
			catch(InvalidDayException e) {
				System.out.println(e.getMessage());
			}
			catch(InvalidTimeException e) {
				System.out.println(e.getMessage());
			}
			catch(InvalidDurationException e) {
				System.out.println(e.getMessage());
			}
			catch(LectureTimeCollisionException e) {
				System.out.println(e.getMessage());
			}

			//schedule1.setDayAndTime(coursename, day, time, duration);
		  }
		  else if (command.equalsIgnoreCase("CSCH"))
		  {
			  String coursecode = commandLine.next();
			  schedule1.clearSchedule(coursecode);
		  }
		  
		  
		  System.out.print("\n>");
	  }
  
  }
  
  //private static boolean isStringOnlyAlphabet(String str) 
  //{ 
      // write method to check if string str contains only alphabetic characters 
	  //return false;
  //} 
  
  public static boolean isNumeric(String str)
  {
      // write method to check if string str contains only numeric characters
	  return false;
  }
  
  
}
