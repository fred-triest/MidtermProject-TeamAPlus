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
public class CourseCatalog {

    private final ArrayList<Course> courselist;

    public CourseCatalog() {
        courselist = new ArrayList();
    }

    // adds a new course to the catalog
    public Course addCourse(String coursenumber, String coursename, int credits, String description) {
        Course c = new Course(coursenumber, coursename, credits, description);
        courselist.add(c);
        return c;
    }

    // find a course by its course number
    public Course findCourse(String coursenumber) {
        for (Course c : courselist) {
            if (c.getCoursenumber().equals(coursenumber)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Course> getCourselist() {
        return courselist;
    }

}
