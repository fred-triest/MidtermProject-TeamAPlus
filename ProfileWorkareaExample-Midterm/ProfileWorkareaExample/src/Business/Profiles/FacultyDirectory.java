/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *Stores all FacultyProfile objects
 * Provides functionality to create, find, and list faculty members.
 * @author fredtriest
 */
public class FacultyDirectory {
    
    ArrayList<FacultyProfile> facultylist;
    
    public FacultyDirectory() {
        facultylist = new ArrayList();
    }
    
    /**
     * Creates a new FacultyProfile linked to a Person and adds to directory.
     */
    public FacultyProfile newFacultyProfile(Person p) {
        FacultyProfile fp = new FacultyProfile(p);
        facultylist.add(fp);
        return fp;
    }
    
    /**
     * Find a FacultyProfile by person id.
     */
    public FacultyProfile findFaculty(String id) {
        for (FacultyProfile fp : facultylist) {
            if (fp.isMatch(id)) {
                return fp;
            }
        }
        return null;
    }
    
    /**
     * Returns list of faculty profiles.
     */
    public ArrayList<FacultyProfile> getFacultyList() {
        return facultylist;
    }
    
}
