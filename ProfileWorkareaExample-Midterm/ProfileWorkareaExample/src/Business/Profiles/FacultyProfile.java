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

    private String department;
    private String email;
    private String phone;

    // creates a new faculty profile linked to a person
    public FacultyProfile(Person p) {
        super(p);
        this.department = "";
        this.email = "";
        this.phone = "";
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

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
