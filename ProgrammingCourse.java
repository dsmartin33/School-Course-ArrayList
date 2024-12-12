/** Project Name: School Course ArrayList
 *  Author@: Dustin Martin
 *  Date: 11.21.2024
 *  Description: A final class called 
 *  ProgrammingCourse that extends Course
 *  and includes an instance variable, setters
 *  and getters, constructors, and implements 
 *  the calculateRevenue method from Course.
 *  Also includes an Override toString method.
 */


public final class ProgrammingCourse extends Course {
	
    // Instance Variables
	private String programmingLang;
	
	// Constructors
	public ProgrammingCourse(int courseID, String courseTitle, int enrollmentLimit, double price, String programmingLang) {
		super(courseID, courseTitle, enrollmentLimit, price);
		this.programmingLang = programmingLang;
	}
	
	public ProgrammingCourse() {
		
	}
	
	// Getter
	public String getProgrammingLang() {
	    return this.programmingLang;
	}
	
	// Setter
	public void setProgrammingLang(String programmingLang) {
		this.programmingLang = programmingLang;
	}
	
	// Implements abstract method calculateRevenue from Course
	public double calculateRevenue() {
		double revenue;
		revenue = getEnrollmentLimit() * getPrice();
		return revenue;
	}
	
	@Override
	public String toString() {
	    String output = super.toString();
        output += "\nProgramming Language: " + this.programmingLang + 
                  "\nRevenue from Course: " + this.calculateRevenue();
        
        return output;
        
	}
}