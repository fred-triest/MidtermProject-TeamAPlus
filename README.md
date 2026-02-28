# MidtermProject-TeamAPlus
Digital University System with an Access Control Layer

# Team Information
- Fred Triest (003166891): Administrator use case
- Cohen Powell (003101282): Faculty use case
- Larry Tsao (003163389): Student use case

# Project Overview
The purpose and objectives of this project is to showcase our newly acquired skills to complete the provided Digital University System application. We also will learn to collaborate with other coders on GitHub and ensure we collaborate in a way that makes the application a success.

# Outline the key features implement
- An administrator can perform the following to successfully manage the application for all users:
  - Create, update, and delete user accounts
  - Register new students, faculty, and administrators
  - Update, view, and delete faculty
  - Update, view, and delete students
  - Update the admin's own profile

- A user with the faculty access can:
  - View courses offered this semester and manage student grades
  - Update department, email, and phone in their profile
  - View student enrollment and performance across courses
  - Generate performance reports with grade statistics and GPA calculations

- A user with the student access can:
  - View enrolled courses and current grades
  - Enroll in and drop courses, with duplicate enrollment validation
  - Track credits toward a graduation requirement
  - View full course history with GPA calculated
  - View personal profile information
  
# Installation & Setup Instructions
- Java JDK 8 or higher
- Apache NetBeans IDE 12 or higher
- Download Git

## How to Run
1. Open the `ProfileWorkareaExample-Midterm/ProfileWorkareaExample` project in NetBeans
2. Right-click the project and select "Run"
3. The login screen will appear — enter a username and password to access the system

## Login Credentials

| Username | Password | Role |
|----------|----------|---------|
| admin | **** | Admin |
| jones | **** | Faculty |
| dumbledore | **** | Faculty |
| potter | **** | Student |
| granger | **** | Student |
| weasley | **** | Student |

# Features Implemented
- Detail the functionalities implemented for each role

## Administrator
- Create, update, and delete user accounts
- Register new students, faculty, and administrators
- Update, view, and delete faculty
- Update, view, and delete students
- Update the admin's own profile

## Faculty
The faculty role has four responsibilities accessible from the faculty dashboard after logging in:

**Manage Courses** — View courses offered this semester. Select a course to see enrolled students and their grades. Faculty can assign or update grades for individual students. Click "View/Edit Details" to update course name, credits, and description.

**My Profile** — View personal info (name, role) and update department, email, and phone fields. Profile changes persist when returning to the panel.

**Performance Reports** — Select a course to see a breakdown of student grades with pass/fail status and the calculated class GPA average.

**Manage Student Profiles** — View students enrolled in each course and click "View Details" to see a full summary of a student's hobbies, interests, enrollment across all courses, grades, and overall GPA.

## Student
- View enrolled courses and current grades
- Enroll in available courses and drop existing enrollments
- View total credits enrolled versus the 120-credit graduation requirement
- View full course history with GPA calculated from letter grades
- View personal name and role information

# Usage Instructions
## Provide a step-by-step guide on how to interact with the system.

### Administrator
- Login as admin, password = ****
- Click Administer User Accounts
- View user accounts and select a user and click next to update the username, name, and password.
- Click Delete to delete the user account or update to update the newly entered information.
- Click back twice to go back to main screen
- Click Register Persons (HR)
- View users and select a user and click next to create a new user by entering in name, username, password, and role and click Register.
- A success message will appear and click back. You should now see your newly registered person.
- Click Back button to go to the main screen.
- Click Manage Faculty to view faculty persons.
- Select a faculty and click next to update faculty name and click Update button or Delete button if you want to delete the selected user.
- Click Back. If you deleted a user, they won't be in the table anymore. If you click back again, you will be on the main screen.
- Click Manage Students and select a user and click next.
- You can update the name and click the Update button or click Delete to remove the student.
- Click Back. If you deleted a user, they won't display anymore. If you click Back again, you will be on the main screen.
- Click My Profile where you can view the admin's profile. You can update the name, username, and password and then click Update 

### Faculty
- Log in with username jones or dumbledore, password ****, and click Login.
- Click Manage Courses to select a course from the dropdown and view enrolled students with their grades. Select a student and enter a new grade to update it. Click "View/Edit Details" to modify the course name, credits, or description.
- Click My Profile to view your name and role. Update your department, email, or phone and click "Save Profile" — changes will persist when you return.
- Click Performance Reports to select a course and see a detailed breakdown of student grades, pass/fail status, and the calculated class average GPA.
- Click Manage Student Profiles to select a course and see all enrolled students. Click "View Details" on a student to see their hobbies, interests, courses, grades, and overall GPA.

### Student
- Log in with username potter, granger, or weasley, password ****, and click Login.
- Click Course Work to view your enrolled courses, credits, and current grades. Enter an assignment name and click Submit to confirm submission.
- Click Registration to manage your enrollment. Select a course from the dropdown and click Enroll. If you are already in that course, you will see an error. To drop a course, select it in the table and click Drop.
- Click Graduation Audit to see how many credits you are enrolled in compared to the 120-credit requirement. The status message updates automatically.
- Click Transcript to see your full course history and your calculated GPA.
- Click Manage Profile to view your name and role.

# Include example scenarios for different user roles.

### Administrator example:
- Admin username and password will be prefilled and click Login.
- Click Administer User Account
- Select potter and click Next.
- Update the username to harry and click Update and click Ok.
- You will now see the username harry for Harry Potter.

### Faculty example:
- Log in as jones with password ****.
- Click Manage Courses and select INFO5100 from the dropdown.
- View the enrolled students and their grades. Select Harry Potter and enter an A+ grade, then click Save Grade.
- Click "View/Edit Details" to update the course description to "Advanced Object-Oriented Programming" and click OK.
- Click My Profile and enter Computer Science in the Department field, jones@university.edu in Email, and 555-1234 in Phone. Click "Save Profile" and the changes will be saved.
- Go back and click My Profile again — your department, email, and phone will still be there.

### Student example:
- Log in as potter with password ****.
- Click Registration.
- Select INFO5100 from the dropdown and click Enroll. You will see an error because Potter is already in that course.
- Select INFO5300 and click Enroll. You will see a success message and INFO5300 will appear in the enrollment table.

# Testing Guide

### Administrator test
- Admin username and password will be prefilled and click Login.
- Click Register Persons (HR) and click Next.
- Click Register and you will get an error that says, "Name is required." click Ok.
- Enter in a Name and click Register. You will get an error like before. Continue doing this and you will receive an error anytime a field is empty.

### Faculty test
- Log in as jones with password ****.
- Click Manage Courses. The INFO5100 course will load with students Harry Potter (A) and Hermione Granger (A+).
- Select Harry Potter and update the grade to A+, then click Save Grade. The table refreshes to show the new grade.
- Click "View/Edit Details" and update the course credits from 4 to 3, then click OK.
- Click My Profile and verify the Name and Role fields are read-only. Enter Computer Science in Department and click "Save Profile".
- Go back to the faculty dashboard and click My Profile again — your department will be saved.
- Click Performance Reports and select INFO5100. You will see both students, a Pass status for both, and the class average GPA calculation.

### Verify authentication and authorization
- You can verify that authentication and authorization works correctly by logging in certain roles and looking at the main home page to see what buttons are visible.
- Admin sees: Administer User Accounts, Register Persons (HR), Manage Faculty, Manage Students, My Profile
- Faculty sees: Manage Courses, My Profile, Performance Reports, Manage Student Profiles
- Student sees: Course Work, Registration, Graduation Audit, Transcript, Manage Profile

# Challenges & Solutions

## Administrator use case difficulties:
- Getting the hang of the GitHub process to ensure branching and not conflicting with other teammates was confusing at first, but it became much clearer the more commits and pull requests were performed.
- Determining the Java package structures was confusing at first because not knowing which ones to create or add classes to existing packages.
- The structure of the user/profile was very confusing at first.
- Configuring navigation is always a struggle for me.

## Faculty use case difficulties:
- Understanding the relationship between Course, CourseOffer, and SeatAssignment was critical but took time to conceptualize — a course exists as an abstract offering, but a CourseOffer is that course in a specific semester, and SeatAssignment links a student to that offering with a grade.
- Integrating with existing StudentProfile and CourseSchedule models built by teammates required careful study of their interfaces and data structures before writing dependent code.
- Getting Java Swing forms to persist data correctly — profile fields needed to be stored on the FacultyProfile object rather than just UI fields.
- CardLayout navigation initially broke when panels called removeAll(), which removed the entire faculty dashboard from the card stack instead of just the current panel.

## Student use case difficulties:
- The Transcript and Graduation Audit panels were the hardest to build. For example, for the transcript I had to figure out how to convert letter grades into numbers, account for each course's credit hours, and skip courses that didn't have a grade yet
- Both panels relied on a data model written by my teammates, so I had to understand how their code was structured before I could write any of my own logic.

## Solutions implemented to overcome these challenges

### Administrator use case solutions:
- Looking up guides on GitHub was very helpful on determining branch structure, when to commit/how often, etc.
- Looking at existing skeleton code was extremely helpful to copy off of.

### Faculty use case solutions:
- Created detailed business model classes (Course, CourseOffer, SeatAssignment, CourseSchedule) that mirrored the existing StudentProfile pattern, ensuring consistency across the codebase.
- Studied the Admin role panel structure (ManagePersonsJPanel, AdminUserAccount) to understand the UI pattern for table-based selection and detail dialogs.
- Fixed navigation by removing CardLayout.removeAll() calls — panels now properly use remove(this) to exit without clearing the entire card stack.
- Used JOptionPane dialogs for course detail editing instead of creating complex form panels, keeping the implementation simple and maintainable.

### Student use case solutions:
- Studying how the Admin and Faculty panels were structured was the most helpful starting point. 
- Googling difficult issues to implement, like GPA calculation and transcript loading
- Looking at how my teammates structured their panels gave me a starting point for the loop logic I needed to adapt for the student use case.

# Future Enhancements

## Administrator use case improvements:
- The ability to update roles for all users would be helpful in examples of users changing roles.
- Help pop ups over fields or button to inform the user what a button or field does.

## Faculty use case improvements:
- Allow faculty to bulk import grades from a CSV or spreadsheet file.
- Add the ability to export performance reports to PDF for external review.
- Implement course prerequisites validation to prevent students from enrolling in courses without required background.
- Add messaging system so faculty can send notifications to students about assignments or grade changes.

## Student use case improvements:
- Allow students to view a course description before enrolling.
- Have an assignment list section for students to see what assignment they are submitting for.
- Add email notifications when grades are posted or course requirements change.

# Contribution Breakdown

## Fred Triest contributions:
- Created the team's GitHub repo with established branches
- Started Google Doc to organize plan and started Google Slide for our slide deck to submit
- Handled all Administrator use case related classes, panels, etc.

## Cohen Powell contributions:
- Implemented the complete Faculty use case with 9 business model classes (Course, CourseOffer, CourseSchedule, etc.) and 4 UI panels
- Created course and grade management functionality with profile persistence
- Fixed CardLayout navigation issues and added student hobbies/interests tracking

## Larry Tsao contributions:
- Implemented all 5 student use case panels: CourseWorkJPanel, RegistrationJPanel, GraduationAuditJPanel, TranscriptJPanel, and StudentMyProfileJPanel
- Added README documentation and added additional slide presentation content.
