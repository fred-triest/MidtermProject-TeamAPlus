/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Person.Person;

/**
 *
 * @author cohenpowell
 */
public class SeatAssignment {

    private Person student;
    private CourseOffer courseoffer;
    private String grade;

    // creates a seat assignment linking a student to a course offering
    public SeatAssignment(Person student, CourseOffer courseoffer) {
        this.student = student;
        this.courseoffer = courseoffer;
        this.grade = "N/A"; // no grade assigned yet
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public CourseOffer getCourseoffer() {
        return courseoffer;
    }

    public void setCourseoffer(CourseOffer courseoffer) {
        this.courseoffer = courseoffer;
    }

    public String getGrade() {
        return grade;
    }

    // sets the grade for this student in the course
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return student.getPersonId() + " - " + courseoffer.toString();
    }

}
