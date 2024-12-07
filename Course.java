/** Project Name: School Course ArrayList
 *  Author@: Dustin Martin
 *  Date: 11.21.2024
 *  Description: An abstract Course class 
 *  that includes instance variables, constructors,
 *  setters and getters, an Override toString method, 
 *  and an abstract calculateRevenue method.
 */

public abstract class Course {
	
    // Instance Variables
	private int courseID;
	private String courseTitle;
	private int enrollmentLimit;
	private double price;
	
	// Constructors
	public Course(int courseID, String courseTitle, int enrollmentLimit, double price) {
		this.courseID = courseID;
		this.courseTitle = courseTitle;
		this.enrollmentLimit = enrollmentLimit;
		this.price = price;
	}
	
	public Course() {
		
	}
	
	// Getters
	public int courseID() {
	    return this.courseID;
	}
	
	public String getCourseTitle() {
	    return this.courseTitle;
	}
		
	public int getEnrollmentLimit() {
		return this.enrollmentLimit;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	// Setters
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	public void setEnrollmentLimit(int enrollmentLimit) {
		this.enrollmentLimit = enrollmentLimit;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
        String output = "\nCourse Information:" +
                        "\nCourse ID: " + this.courseID +
                        "\nCourse Title: " + this.courseTitle +
                        "\nEnrollment Limit: " + this.enrollmentLimit +
                        "\nPrice: " + this.price;
        return output;
        
    }
	
	// Abstract method for calculating revenue
	public abstract double calculateRevenue();

}