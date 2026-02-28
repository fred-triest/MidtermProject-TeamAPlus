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

    private String hobbies;
    private String interests;

    public StudentProfile(Person p) {
        super(p);
        this.hobbies = "";
        this.interests = "";
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    // Returns Student as the role
    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String toString() {
        return getPerson().getPersonId();
    }

}
