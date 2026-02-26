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
public class CourseSchedule {

    private String semester;
    private ArrayList<CourseOffer> courseoffers;

    // creates a schedule for a specific semester
    public CourseSchedule(String semester) {
        this.semester = semester;
        this.courseoffers = new ArrayList();
    }

    // adds a course to this semester's schedule
    public CourseOffer addCourseOffer(Course course) {
        CourseOffer co = new CourseOffer(course, semester);
        courseoffers.add(co);
        return co;
    }

    // find a course offer by course number
    public CourseOffer findCourseOffer(String coursenumber) {
        for (CourseOffer co : courseoffers) {
            if (co.getCourse().getCoursenumber().equals(coursenumber)) {
                return co;
            }
        }
        return null;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<CourseOffer> getCourseoffers() {
        return courseoffers;
    }

    @Override
    public String toString() {
        return semester;
    }

}
