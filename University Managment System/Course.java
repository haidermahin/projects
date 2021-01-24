public class Course 
{
	private String code;
	private String name;
	private String description;
	private String format;
	   
	public Course()
	{
	  this.code        = "";
	  this.name        = "";
	  this.description = "";
	  this.format      = "";
	}
	   
	public Course(String name, String code, String descr, String fmt)
	{
	  this.code        = code;
	  this.name        = name;
	  this.description = descr;
	  this.format      = fmt;
	}
	   
	public String getCode()
	{
	   return code;
	}
	   
	public String getName()
	{
	  return name;
	}
	   
	public String getFormat()
	{
	  return format;
	}
	   
	public String getDescription()
	{
	  return code +" - " + name + "\n" + description + "\n" + format;
	}
	
	 public String getInfo()
	 {
	   return code +" - " + name;
	 }
	 
	 // static method to convert numeric score to letter grade string 
	 // e.g. 91 --> "A+"
	 public static String convertNumericGrade(double score)
	 {
		 // fill in code
		 if(score >= 90 ) {
				return ("A+");
			}
			
			if(score >= 85 && score < 90 ) {
				return "A";
			}
			if(score >= 80 && score < 85) {
				return "A-";
			}
			if (score > 75 && score <80) {
			 return "B+";	
			}
			if (score >= 70 && score <75 ) {
				return "B";
			}
			if (score >= 65 && score < 70) {
				return "B-";
			}
			if(score >= 60 && score < 65) {
				return "C+";
			}
			if(score >= 55 && score < 60) {
				return "C";
			}
			if(score >= 50 && score < 55) {
				return "C-";
			}
			if(score >= 45 && score < 50) {
				return "D+";
			}
			if(score >= 40 && score < 45 ) {
				return "D";
			
			}
			return "F";
	 } 
	 
}

