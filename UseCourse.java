/** Project Name: School Course ArrayList
 *  Author@: Dustin Martin
 *  Date: 11.21.2024
 *  Description: This is the Use class that 
 *  will run the project which includes the
 *  main method.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UseCourse {
	
    // ArrayList Creation and Scanner initialization
    static ArrayList<Course> courses = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
	
    // Main Method
	public static void main(String[] args) {
	    
	    boolean finished = false;
	    while (finished == false) {
            
	        //Menu Display
            System.out.println("");
            System.out.println("College Menu");
            System.out.println("===================");
            System.out.println(" 1.  Enter a new course");
            System.out.println(" 2.  Remove a course from the list");
            System.out.println(" 3.  Diplay all current courses in the list");
            System.out.println(" 4.  Exit");
            System.out.println("");
            System.out.print("Please enter your choice (1-4): ");
            int userChoice = scan.nextInt();
            
            //Switch
            switch (userChoice) {
            case 1:
                createCourse();
                break;
            case 2:
                removeCourse();
                break;
            case 3:
                displayAllCourses();
                break;
            case 4:
                finished = true;
                break;
            default:
                System.out.println("Invalid Input!");
            }//end switch
        }//end while
	    		
		scan.close();
	}
	
	// Add course to the ArrayList
	public static void createCourse() {
	  
	    
	    System.out.print("\nPlease enter the Course ID: ");
        int courseID = scan.nextInt();
        
        scan.nextLine();
        System.out.print("\nPlease enter the name of the Course: ");
        String courseTitle = scan.nextLine();
        
        
        System.out.print("\nPlease enter the Enrollment Limit for the course: ");
        int enrollmentLimit = scan.nextInt();
        
        scan.nextLine();
        System.out.print("\nPlease enter the Price for the Course: ");
        double price = scan.nextDouble();
        
        scan.nextLine();
        System.out.print("\nPlease enter the Programming Language used for the course: ");
        String programmingLang = scan.nextLine();
      
        
        ProgrammingCourse pc = new ProgrammingCourse (courseID, courseTitle, enrollmentLimit, price, programmingLang);
        courses.add(pc);
      
        System.out.println("\nNew Course Added!");
	}
	
	// Removes courses from the ArrayList
	public static boolean removeCourse() {
	    
	    System.out.print("\nPlease enter the Course ID you wish to remove: ");
	    int courseNum = scan.nextInt();
	    
	    scan.nextLine();
	    for (Course pc: courses) {
	        if (pc.getCourseID() == (courseNum)) {
	            courses.remove(pc);
	            System.out.println("\nCourse has been removed successfully!");
	            return true;
	        }
	        else {
	            System.out.println("\nCourse not found!");
	            return false;
	        }
	    }
	    return false;
	}
	
	// Displays all courses in the ArrayList via toSting
	public static void displayAllCourses() {
	       
	    System.out.println("\nDisplaying all Courses: ");
	    for (Course pc: courses) {
	        System.out.println(pc);
	        
	    }
	}
}