import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class Scheduler 
{
    // In main() after you create a Registry object, create a Scheduler object and pass in the courses ArrayList/TreeMap
	// If you do not want to try using a Map then uncomment
	// the line below and comment out the TreeMap line
	
	//ArrayList<Student> students;
	
	TreeMap<String,ActiveCourse> schedule;
		
	public Scheduler(TreeMap<String,ActiveCourse> courses)
	{
	  schedule = courses;
	}
	
	public void setDayAndTime(String courseCode, String day, int startTime, int duration)
	{	
		int end_time = startTime + (duration * 100);
		ActiveCourse ac = null;
		for(String coursecode1 : schedule.keySet()) {
			if(schedule.get(coursecode1).getCode().equalsIgnoreCase(courseCode)) {
				ac = schedule.get(coursecode1);
			}
		}
		if(ac == null) {
			throw new unknownCourseException("UnknownCourse exception: " + courseCode );
		}
		if(!day.equalsIgnoreCase("Mon") && !day.equalsIgnoreCase("Tue") && !day.equalsIgnoreCase("Wed") && !day.equalsIgnoreCase("Thur") && !day.equalsIgnoreCase("Fri")) {
		  throw new InvalidDayException("Invalid Lecture day ");
		}
		if(startTime < 800  && end_time > 1700) {
			throw new InvalidTimeException("invalid Lecture time");
		}
		if(duration < 1 || duration > 3) {
			throw new InvalidDurationException("Invalid Lecture Duration" );
		}
		for(String coursecode1 : schedule.keySet()) {
			if(schedule.get(coursecode1).getStartTime() + (schedule.get(coursecode1).getDurationTime() * 100) > startTime   &&  schedule.get(coursecode1).getLectureDay().equalsIgnoreCase(day) && startTime + (schedule.get(coursecode1).getDurationTime() * 100) > schedule.get(coursecode1).getStartTime()) {
				throw new LectureTimeCollisionException("Lecture timings overlaps with another course with similar timings");
			}
		}
		
		ac.setLectureStart(startTime);
		ac.setDuration(duration);
		ac.setLectureDay(day);
		}
	
	

	
	
	public void clearSchedule(String courseCode)
	{
		ActiveCourse ac1 = null;
		for(String coursecode1 : schedule.keySet()) {
			if(schedule.get(coursecode1).getCode().equalsIgnoreCase(courseCode)) {
				ac1 = schedule.get(coursecode1);
			}
		}
		if(ac1 == null)return;
		
		ac1.ResetLectureStart();
		ac1.ResetDuration();
		ac1.ResetLectureDay();
		
	}	
		
		
	
		
	public void printSchedule()
	{
		String day1 = "";
		String day2 ="";
		String day3 ="";
		TreeMap<String,String> spacing = new TreeMap<String,String>();
		spacing.put("mon", "\t");
		spacing.put("tue", "\t\t");
		spacing.put("wed", "\t\t\t");
		spacing.put("thur","\t\t\t\t");
		spacing.put("fri", "\t\t\t\t\t");


		
		TreeMap<Integer , String> Monmap = new TreeMap<Integer , String>();
		TreeMap<Integer , String> Tuemap = new TreeMap<Integer , String>();
		TreeMap<Integer , String> Wedmap = new TreeMap<Integer , String>();
		TreeMap<Integer , String> Thurmap = new TreeMap<Integer , String>();
		TreeMap<Integer , String> Frimap =  new TreeMap<Integer , String>();
		
	
		
	ArrayList<String> list = new ArrayList<String>();
	for(String coursecode : schedule.keySet()) {
		list.add(coursecode);
	}
	System.out.println(list.toString());
	ActiveCourse ac1 = schedule.get(list.get(0));
	ActiveCourse ac2 = schedule.get(list.get(1));
	ActiveCourse ac3 = schedule.get(list.get(2));
	ActiveCourse ac4 = schedule.get(list.get(3));
	ActiveCourse ac5 = schedule.get(list.get(4));
	System.out.println("\tMon\tTue\tWed\tThur\tFri");
	for(String days : spacing.keySet()) {
		if(ac1.getLectureDay().equalsIgnoreCase(days)) {
			day1 = ac1.getLectureDay().toLowerCase();
		}
		if(ac2.getLectureDay().equalsIgnoreCase(days)) {
			day2 = ac2.getLectureDay().toLowerCase();
		}
		if(ac3.getLectureDay().equalsIgnoreCase(days)) {
			day3 = ac3.getLectureDay().toLowerCase();
		}
	}
	for(int y=800;y<1600;y=y+100) {
		Monmap.put(y, "___");
		Tuemap.put(y, "___");
		Wedmap.put(y, "___");
		Thurmap.put(y, "___");
		Frimap.put(y, "___");
	}
	
	
	
	
	
	
	
	
	

		
		for(int i = 800 ; i < 1600 ; i= i + 100) {
		if(ac1.getStartTime() == i) {
			int mem=i;
			if(ac1.getLectureDay().equalsIgnoreCase("mon")) {
				for(int a=0;a<ac1.getDurationTime();a++) {
					Monmap.put(i, ac1.getCode());
					i=i+100;
				}
			}
			i=mem;	
					
			}
		
		if(ac2.getStartTime() == i) {
			int mem = i;
			if(ac2.getLectureDay().equalsIgnoreCase("mon")) {
				for(int a=0;a<ac2.getDurationTime();a++) {
					Monmap.put(i, ac2.getCode());
					i=i+100;
				}
			}
			i=mem;	
		}
		if(ac3.getStartTime() == i) {
			int mem = i;
			if(ac3.getLectureDay().equalsIgnoreCase("mon")) {
				for(int a=0;a<ac3.getDurationTime();a++) {
					Monmap.put(i, ac3.getCode());
					i=i+100;
				}
			}
			i=mem;		
			}
		if(ac4.getStartTime() == i) {
			int mem = i;
			if(ac4.getLectureDay().equalsIgnoreCase("mon")) {
				for(int a=0;a<ac4.getDurationTime();a++) {
					Monmap.put(i, ac4.getCode());
					i=i+100;
				}
			}
			i=mem;		
			}

		if(ac5.getStartTime() == i) {
			int mem = i;
			if(ac5.getLectureDay().equalsIgnoreCase("mon")) {
				for(int a=0;a<ac5.getDurationTime();a++) {
					Monmap.put(i, ac5.getCode());
					i=i+100;
				}
			}
			i=mem;		
			}
		}
			
			
			
		for(int j = 800 ; j < 1600 ; j= j + 100) {
			if(ac1.getStartTime() == j) {
				int mem=j;
				if(ac1.getLectureDay().equalsIgnoreCase("tue")) {
					for(int a=0;a<ac1.getDurationTime();a++) {
						Tuemap.put(j, ac1.getCode());
						j=j+100;
					}
				}
				j=mem;
			}
			if(ac2.getStartTime() == j) {
				int mem=j;
				if(ac2.getLectureDay().equalsIgnoreCase("tue")) {
					for(int a=0;a<ac2.getDurationTime();a++) {
						Tuemap.put(j, ac2.getCode());
						j=j+100;
					}
				}
				j=mem;
			
				 
				}
			
				 if(ac3.getStartTime() == j) {
					 int mem=j;
					 if(ac3.getLectureDay().equalsIgnoreCase("tue")) {
						 for(int a=0;a<ac3.getDurationTime();a++) {
								Tuemap.put(j, ac3.getCode());
								j=j+100;
							} 
						 j=mem;

							
				}
				 }
				 if(ac4.getStartTime() == j) {
					 int mem=j;
					 if(ac4.getLectureDay().equalsIgnoreCase("tue")) {
						 for(int a=0;a<ac4.getDurationTime();a++) {
								Tuemap.put(j, ac4.getCode());
								j=j+100;
							} 
						 j=mem;

							
				}
				 }
				 if(ac5.getStartTime() == j) {
					 int mem=j;
					 if(ac5.getLectureDay().equalsIgnoreCase("tue")) {
						 for(int a=0;a<ac5.getDurationTime();a++) {
								Tuemap.put(j, ac5.getCode());
								j=j+100;
							} 
						 j=mem;

							
				}
				 }	 
				 
				
			}
				
				for(int k = 800 ; k < 1600 ; k= k + 100) {
					if(ac1.getStartTime() == k) {
						int mem=k;
					
					if(ac1.getLectureDay().equalsIgnoreCase("wed")) {
						for(int a=0;a<ac1.getDurationTime();a++) {
							Wedmap.put(k, ac1.getCode());
							k=k+100;
						}
						k = mem;
						}
					
					}
				 if(ac2.getStartTime() == k) {
					 int mem=k;
					if(ac2.getLectureDay().equalsIgnoreCase("wed")) {
						for(int a=0;a<ac2.getDurationTime();a++) {
							Wedmap.put(k, ac2.getCode());
							k=k+100;
						}
						k = mem;
						
							
				}
					}
				if(ac3.getStartTime() == k) {
					int mem=k;
					if(ac3.getLectureDay().equalsIgnoreCase("wed")) {
						for(int a=0;a<ac3.getDurationTime();a++) {
							Thurmap.put(k, ac3.getCode());
							k=k+100;
						}
						k = mem;	
						
					}
					
				}
				if(ac4.getStartTime() == k) {
					int mem=k;
					if(ac4.getLectureDay().equalsIgnoreCase("wed")) {
						for(int a=0;a<ac4.getDurationTime();a++) {
							Thurmap.put(k, ac4.getCode());
							k=k+100;
						}
						k = mem;	
						
					}
					
				}
				if(ac5.getStartTime() == k) {
					int mem=k;
					if(ac5.getLectureDay().equalsIgnoreCase("wed")) {
						for(int a=0;a<ac5.getDurationTime();a++) {
							Thurmap.put(k, ac5.getCode());
							k=k+100;
						}
						k = mem;	
						
					}
					
				}
				}
		
					
					for(int l = 800 ; l < 1600 ; l= l + 100) {
						if(ac1.getStartTime() == l) {
							int mem=l;
						if(ac1.getLectureDay().equalsIgnoreCase("thur")) {
							for(int a=0;a<ac1.getDurationTime();a++) {
								Thurmap.put(l, ac1.getCode());
								l=l+100;
							}
							l = mem;		
								
						
							}
						}
						if(ac2.getStartTime() == l) {
						int mem=l;
						if(ac2.getLectureDay().equalsIgnoreCase("thur")) {
							for(int a=0;a<ac2.getDurationTime();a++) {
								Thurmap.put(l, ac2.getCode());
								l=l+100;
							}
							l = mem;			
						}
						}
						
						if(ac3.getStartTime() == l) {
						int mem=l;
						if(ac3.getLectureDay().equalsIgnoreCase("thur")) {
							for(int a=0;a<ac3.getDurationTime();a++) {
								Thurmap.put(l, ac3.getCode());
								l=l+100;
							}
							l = mem;	
						}
					}
						if(ac4.getStartTime() == l) {
							int mem=l;
							if(ac4.getLectureDay().equalsIgnoreCase("thur")) {
								for(int a=0;a<ac4.getDurationTime();a++) {
									Thurmap.put(l, ac4.getCode());
									l=l+100;
								}
								l = mem;	
							}
						}
						if(ac5.getStartTime() == l) {
							int mem=l;
							if(ac5.getLectureDay().equalsIgnoreCase("thur")) {
								for(int a=0;a<ac5.getDurationTime();a++) {
									Thurmap.put(l, ac5.getCode());
									l=l+100;
								}
								l = mem;	
							}
						}
				
						
					}
						
						
						for(int m = 800 ; m < 1600 ; m = m + 100) {
							if(ac1.getStartTime() == m) {
								int mem=m;
							if(ac1.getLectureDay().equalsIgnoreCase("fri")) {
								for(int a=0;a<ac1.getDurationTime();a++) {
									Frimap.put(m, ac1.getCode());
									m=m+100;
								}
								m = mem;	
							
								}
							}
						 if(ac2.getStartTime() == m) {
							 int mem=m;
							if(ac2.getLectureDay().equalsIgnoreCase("fri")) {
								for(int a=0;a<ac2.getDurationTime();a++) {
									Frimap.put(m, ac2.getCode());
									m=m+100;
								}
								m = mem;			
							}
						 }
						 if(ac3.getStartTime() == m) {
						 int mem=m;
							if(ac3.getLectureDay().equalsIgnoreCase("fri")) {
								for(int a=0;a<ac3.getDurationTime();a++) {
									Frimap.put(m, ac3.getCode());
									m=m+100;
								}
								m = mem;		
								
								}
							}
						
						 if(ac4.getStartTime() == m) {
							 int mem=m;
								if(ac4.getLectureDay().equalsIgnoreCase("fri")) {
									for(int a=0;a<ac4.getDurationTime();a++) {
										Frimap.put(m, ac4.getCode());
										m=m+100;
									}
									m = mem;		
									
									}
								} 
						 if(ac5.getStartTime() == m) {
							 int mem=m;
								if(ac5.getLectureDay().equalsIgnoreCase("fri")) {
									for(int a=0;a<ac5.getDurationTime();a++) {
										Frimap.put(m, ac5.getCode());
										m=m+100;
									}
									m = mem;		
									
									}
								}  
						}

						
						
						
						
		
		
							
	for(int timeslots : Monmap.keySet()) {
		System.out.println( String.format("%04d", timeslots) + "\t" + Monmap.get(timeslots) + "\t" +Tuemap.get(timeslots) + "\t" + Wedmap.get(timeslots) + "\t" + Thurmap.get(timeslots) + "\t" + Frimap.get(timeslots) );
	}
							
		
							
		
	
					
	/**
	for(int i = 800 ; i < 1600 ; i= i + 100) {
		if(ac1.getStartTime()==i ) {
			int time=ac1.getStartTime();
		for (int j = 0; j < ac1.getDurationTime(); j++) {
			
		System.out.println( time + spacing.get(day1) + ac1.getCode());
		 }
		}
		else if(ac2.getStartTime()==i) {
			int time= ac2.getStartTime();
			for (int j = 0; j < ac2.getDurationTime(); j++) {
				
				System.out.println( time + spacing.get(day2) + ac2.getCode());
				 }
		}
		else if(ac3.getStartTime()==i) {
			int time= ac3.getStartTime();
		for (int j = 0; j < ac3.getDurationTime(); j++) {
				
				System.out.println( time + spacing.get(day3) + ac3.getCode());
				 }
		}
		else {
			System.out.println(i);
		}
	}
	System.out.printf("");	
	**/
		
	}
					}
	
	
		
			


