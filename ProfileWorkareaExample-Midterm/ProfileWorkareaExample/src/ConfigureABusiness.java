/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package Business;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;


/**
 * Initialize Business object with test data for all roles.
 * Create persons, profile, and user accounts for Student, Faculty, and Admin.
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Information Systems");

// Create Persons
      PersonDirectory persondirectory = business.getPersonDirectory();
// Admin Persons       
        Person person001 = persondirectory.newPerson("Edward Snowden");
// Faculty Persons
        Person person002 = persondirectory.newPerson("Professor Indian Jones");
        Person person003 = persondirectory.newPerson("Professor Albus Dumbledore");
// Student Persons
        Person person004 = persondirectory.newPerson("Harry Potter");
        Person person005 = persondirectory.newPerson("Hermione Granger");
        Person person006 = persondirectory.newPerson("Ron Weasley");


// Admin Profile
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile adminprofile = employeedirectory.newEmployeeProfile(person001);
// Faculty Profiles
        FacultyDirectory facultydirectory = business.getFacultyDirectory();
        FacultyProfile facultyprofile1 = facultydirectory.newFacultyProfile(person002);
        FacultyProfile facultyprofile2 = facultydirectory.newFacultyProfile(person003);
// Student Profiles
        StudentDirectory studentdirectory = business.getStudentDirectory();
        StudentProfile studentprofile1 = studentdirectory.newStudentProfile(person004);
        StudentProfile studentprofile2 = studentdirectory.newStudentProfile(person005);
        StudentProfile studentprofile3 = studentdirectory.newStudentProfile(person006);

   
// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
// Admin account
        UserAccount adminaccount = uadirectory.newUserAccount(adminprofile, "admin", "****");
// Faculty accounts
        UserAccount facultyaccount1 = uadirectory.newUserAccount(facultyprofile1, "jones", "****");
        UserAccount facultyaccount2 = uadirectory.newUserAccount(facultyprofile2, "dumbledore", "****");
// Student accounts
        UserAccount studentaccount1 = uadirectory.newUserAccount(studentprofile1, "potter", "****");
        UserAccount studentaccount2 = uadirectory.newUserAccount(studentprofile2, "granger", "****");
        UserAccount studentaccount3 = uadirectory.newUserAccount(studentprofile3, "weasley", "****");

        return business;

    }

}
