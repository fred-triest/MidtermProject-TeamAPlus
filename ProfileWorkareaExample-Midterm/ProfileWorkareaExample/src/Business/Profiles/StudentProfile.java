/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

/**
 * Represents a student's profile
 * @author fredtriest
 */
public class StudentProfile extends Profile {

    // Creates student profile linked to a person
    public StudentProfile(Person p) {
        super(p);

    }

    // Returns Student as the role
    @Override
    public String getRole() {
        return "Student";
    }
    
    // Returns student's name as string
    @Override
    public String toString() {
        return getPerson().getPersonId();
    }

}
