/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

/**
 *
 * @author cohenpowell
 */
public class Course {

    private String coursenumber;
    private String coursename;
    private int credits;
    private String description;

    // creates a new course with its details
    public Course(String coursenumber, String coursename, int credits, String description) {
        this.coursenumber = coursenumber;
        this.coursename = coursename;
        this.credits = credits;
        this.description = description;
    }

    public String getCoursenumber() {
        return coursenumber;
    }

    public void setCoursenumber(String coursenumber) {
        this.coursenumber = coursenumber;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return coursenumber + ": " + coursename;
    }

}
