/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import java.util.ArrayList;

/**
 *
 * @author cohenpowell
 */
public class CourseOffer {

    private Course course;
    private String semester;
    private ArrayList<SeatAssignment> seatassignments;

    // creates a course offering for a specific semester
    public CourseOffer(Course course, String semester) {
        this.course = course;
        this.semester = semester;
        this.seatassignments = new ArrayList();
    }

    // assigns a seat to a person in this course offering
    public SeatAssignment assignSeat(Business.Person.Person student) {
        SeatAssignment sa = new SeatAssignment(student, this);
        seatassignments.add(sa);
        return sa;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<SeatAssignment> getSeatassignments() {
        return seatassignments;
    }

    @Override
    public String toString() {
        return course.toString() + " (" + semester + ")";
    }

}
