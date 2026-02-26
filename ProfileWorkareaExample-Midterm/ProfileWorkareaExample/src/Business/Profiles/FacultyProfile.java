/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;

/**
 * Reps a Faculty member's profile in the access control layer
 * Extends the profile class and returns Faculty as the role
 * @author fredtriest
 */
public class FacultyProfile extends Profile {
    
    public FacultyProfile(Person p) {
        super(p);
    }
    
    @Override
    public String getRole() {
        return "Faculty";
    }
    
    @Override
    public String toString() {
        return getPerson().getPersonId();
    }
    
}
