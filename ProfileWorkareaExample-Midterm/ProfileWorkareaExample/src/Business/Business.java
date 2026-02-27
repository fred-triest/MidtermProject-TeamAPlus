/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.StudentDirectory;
import Business.Profiles.FacultyDirectory;

import Business.UserAccounts.UserAccountDirectory;

/**
 * Holds directories for university business model
 * @author fredtriest
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role

    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    

    // Initialize business with all directories
    public Business(String n) {
        name = n;

        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        studentdirectory = new StudentDirectory();
        facultydirectory = new FacultyDirectory();


    }
    
    // Returns the person directory
    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }
    
    // Returns the user account directory
    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }

    // Returns the employee directory
    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    // Returns the student directory
    public StudentDirectory getStudentDirectory(){
        return studentdirectory;
    }
    
    // Returns the faculty directory
    public FacultyDirectory getFacultyDirectory() {
        return facultydirectory;
    }

}
