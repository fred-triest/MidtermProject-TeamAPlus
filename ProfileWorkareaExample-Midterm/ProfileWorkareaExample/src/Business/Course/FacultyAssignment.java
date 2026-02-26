package Business.Course;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cohenpowell
 */
public class FacultyAssignment {

    private Business.Person.Person faculty;
    private CourseOffer courseoffer;

    // links a faculty member to a course offering they teach
    public FacultyAssignment(Business.Person.Person faculty, CourseOffer courseoffer) {
        this.faculty = faculty;
        this.courseoffer = courseoffer;
    }

    public Business.Person.Person getFaculty() {
        return faculty;
    }

    public void setFaculty(Business.Person.Person faculty) {
        this.faculty = faculty;
    }

    public CourseOffer getCourseoffer() {
        return courseoffer;
    }

    public void setCourseoffer(CourseOffer courseoffer) {
        this.courseoffer = courseoffer;
    }

    @Override
    public String toString() {
        return faculty.getPersonId() + " teaches " + courseoffer.toString();
    }

}
