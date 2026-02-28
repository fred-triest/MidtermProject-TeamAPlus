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

import Business.Course.Course;
import Business.Course.CourseCatalog;
import Business.Course.CourseOffer;
import Business.Course.CourseSchedule;
import Business.Course.FacultyAssignment;
import Business.Course.SeatAssignment;
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
        studentprofile1.setHobbies("Quidditch, Flying");
        studentprofile1.setInterests("Defense Against the Dark Arts, Potions");

        StudentProfile studentprofile2 = studentdirectory.newStudentProfile(person005);
        studentprofile2.setHobbies("Reading, Research");
        studentprofile2.setInterests("Charms, Arithmancy, History of Magic");

        StudentProfile studentprofile3 = studentdirectory.newStudentProfile(person006);
        studentprofile3.setHobbies("Chess, Eating");
        studentprofile3.setInterests("Care of Magical Creatures, Herbology");

   
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

// Create courses in the catalog
        CourseCatalog coursecatalog = business.getCourseCatalog();
        Course course1 = coursecatalog.addCourse("INFO5100", "Application Engineering", 4, "Object-oriented design and development");
        Course course2 = coursecatalog.addCourse("INFO5200", "Database Management", 4, "Database design and SQL fundamentals");
        Course course3 = coursecatalog.addCourse("INFO5300", "Web Development", 3, "Full-stack web application development");

// Create course offerings for this semester
        CourseSchedule schedule = business.getCourseSchedule();
        CourseOffer offer1 = schedule.addCourseOffer(course1);
        CourseOffer offer2 = schedule.addCourseOffer(course2);
        CourseOffer offer3 = schedule.addCourseOffer(course3);

// Assign faculty to courses - Jones teaches INFO5100 and INFO5300, Dumbledore teaches INFO5200
        FacultyAssignment fa1 = new FacultyAssignment(person002, offer1);
        FacultyAssignment fa2 = new FacultyAssignment(person003, offer2);
        FacultyAssignment fa3 = new FacultyAssignment(person002, offer3);

// Enroll students in courses
        SeatAssignment sa1 = offer1.assignSeat(person004); // Potter in INFO5100
        SeatAssignment sa2 = offer1.assignSeat(person005); // Granger in INFO5100
        SeatAssignment sa3 = offer2.assignSeat(person004); // Potter in INFO5200
        SeatAssignment sa4 = offer2.assignSeat(person006); // Weasley in INFO5200
        SeatAssignment sa5 = offer3.assignSeat(person005); // Granger in INFO5300
        SeatAssignment sa6 = offer3.assignSeat(person006); // Weasley in INFO5300

// Set some sample grades
        sa1.setGrade("A");
        sa2.setGrade("A+");
        sa3.setGrade("B+");

        return business;

    }

}
