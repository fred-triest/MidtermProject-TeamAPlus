/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

import java.util.ArrayList;

/**
 * Stores all StudentProfile objects
 * @author fredtriest
 */
public class StudentDirectory {


    ArrayList<StudentProfile> studentlist;

    public StudentDirectory() {

     studentlist = new ArrayList();

    }

    // Creates a new student profile and adds to directory
    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    // Finds and returns a student by id
    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
    // returns list of student profiles.
    public ArrayList<StudentProfile> getStudentList() {
        return studentlist;
    }
    
    // removes student from directory
    public void removeStudent(StudentProfile sp) {
        if (sp == null)
            return;
        studentlist.remove(sp);
    }
}
