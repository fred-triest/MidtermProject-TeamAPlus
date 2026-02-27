/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author Cohen Powell
 */
public class FacultyProfile extends Profile {

    // creates a new faculty profile linked to a person
    public FacultyProfile(Person p) {

        super(p);

    }

    // returns "Faculty" for role-based access control
    @Override
    public String getRole(){
        return  "Faculty";
    }

    @Override
    public String toString() {
        return getPerson().getPersonId();
    }

}
