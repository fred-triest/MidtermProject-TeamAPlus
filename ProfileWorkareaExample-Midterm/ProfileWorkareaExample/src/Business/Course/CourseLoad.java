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
public class CourseLoad {

    private ArrayList<SeatAssignment> seatassignments;

    public CourseLoad() {
        seatassignments = new ArrayList();
    }

    // adds a seat assignment to this student's course load
    public void addSeatAssignment(SeatAssignment sa) {
        seatassignments.add(sa);
    }

    // get all courses this student is enrolled in
    public ArrayList<SeatAssignment> getSeatassignments() {
        return seatassignments;
    }

    @Override
    public String toString() {
        return seatassignments.size() + " courses";
    }

}
