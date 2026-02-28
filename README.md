# MidtermProject-TeamAPlus
Digital University System with an Access Control Layer

# Team Information
- Fred Triest (003166891): Administrator use case
- Cohen Powell (NUID): Faculty use case
- Larry Tsao (003163389): Student use case

# Project Overview
The purpose and objectives of this project is to showcase our newly acquired skills to complete the provided Digital University System application. We also will learn to collaborate with other coders on GitHub and ensure we collaborate in a way that makes the application a success.

# Outline the key features implement
- An administrator can perform the following to successfully manage the application for all users:
  - Create, update, and delete user accounts
  - Register new students, faculty, and administrators
  - Update, view, and delete faculty
  - Update, view, and delete students
  - Update the admin’s own profile

- A user with the student access can:
  - View enrolled courses and current grades
  - Enroll in and drop courses, with duplicate enrollment validation
  - Track credits toward a graduation requirement
  - View full course history with GPA calculated
  - View personal profile information
  
# Installation & Setup Instructions
- Java JDK 8 or  higher
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
- Administrator
  - Create, update, and delete user accounts
  - Register new students, faculty, and administrators
  - Update, view, and delete faculty
  - Update, view, and delete students
  - Update the admin’s own profile
- Student
  - View enrolled courses and current grades
  - Enroll in available courses and drop existing enrollments
  - View total credits enrolled versus the 120-credit graduation requirement
  - View full course history with GPA calculated from letter grades
  - View personal name and role information

# Usage Instructions
## Provide a step-by-step guide on how to interact with the system.
- Administrator
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
  - Click Back. If you deleted a user, they won’t be in the table anymore. If you click back again, you will be on the main screen.
  - Click Manage Students and select a user and click next.
  - You can update the name and click the Update button or click Delete to remove the student.
  - Click Back. If you deleted a user, they won’t display anymore. If you click Back again, you will be on the main screen.
  - Click My Profile where you can view the admin’s profile. You can update the name, username, and password and then click Update 
- Student
  - Log in with username potter, granger, or weasley, password ****, and click Login.
  - Click Course Work to view your enrolled courses, credits, and current grades. Enter an assignment name and click Submit to confirm submission.
  - Click Registration to manage your enrollment. Select a course from the dropdown and click Enroll. If you are already in that course, you will see an error. To drop a   course, select it in the table and click Drop.
  - Click Graduation Audit to see how many credits you are enrolled in compared to the 120-credit requirement. The status message updates automatically.
  - Click Transcript to see your full course history and your calculated GPA.
  - Click Manage Profile to view your name and role.

# Include example scenarios for different user roles.
- Administrator example:
  - Admin username and password will be prefilled and click Login.
  - Click Administer User Account
  - Select potter and click Next.
  - Update the username to harry and click Update and click Ok.
  - You will now see the username harry for Harry Potter.
- Student example:
  - Log in as potter and click Registration.
  - Select INFO5100 from the dropdown and click Enroll. You will see an error because Potter is already in that course.
  - Select INFO5300 and click Enroll. You will see a success message and INFO5300 will appear in the enrollment table.

# Testing Guide
- Administrator test
  - Admin username and password will be prefilled and click Login.
  - Click Register Persons (HR) and click Next.
  - Click Register and you will get an error that says, “Name is required.” click Ok.
  - Enter in a Name and click Register. You will get an error like before. Continue doing this and you will receive an error anytime a field is empty.
  - Explain how to verify that authentication and authorization work correctly.
  - You can verify that authentication and authorization works correctly by logging in certain roles and looking at the main home page to see what buttons are visible.
 
# Challenges & Solutions
- Administrator use case difficulties:
  - Getting the hang of the GitHub process to ensure branching and not conflicting with other teammates was confusing at first, but it became much clearer the more commits and pull requests were performed.
  - Determining the Java package structures was confusing at first because not knowing which ones to create or add classes to existing packages.
  - The structure of the user/profile was very confusing at first.
  - Configuring navigation is always a struggle for me.
- Student use case difficulties:
  - The Transcript and Graduation Audit panels were the hardest to build. For example, for the transcript I had to figure out how to convert letter grades into numbers, account for each course's credit hours, and skip courses that didn't have a grade yet
  - Both panels relied on a data model written by my teammates, so I had to understand how their code was structured before I could write any of my own logic.
 
## Highlight the solutions implemented to overcome these challenges.
- Administrator use case solutions:
  - Looking up guides on GitHub was very helpful on determining branch structure, when to commit/how often, etc.
  - Looking at existing skeleton code was extremely helpful to copy off of.
- Student use case solutions:
  - Studying how the Admin and Faculty panels were structured was the most helpful starting point. 
  - Googling difficult issues to implement, like GPA calculation and transcript loading
  - Looking at how my teammates structured their panels gave me a starting point for the loop logic I needed to adapt for the student use case.

# Future Enhancements
- Administrator use case improvements:
  - The ability to update roles for all users would be helpful in examples of users changing roles.
  - Help pop ups over fields or button to inform the user what a button or field does.
- Student use case improvements:
  - Allow students to view a course description before enrolling.
  - Have an assignment list section  for students to see what assignment they are submitting for.

# Contribution Breakdown
- Fred Triest contributions:
  - Created the team’s GitHub repo with established branches
  - Started Google Doc to organize plan and started Google Slide for our slide deck to submit
  - Handled all Administrator use case related classes, panels, etc.
- Larry Tsao contributions:
  - Implemented all 5 student use case panels: CourseWorkJPanel, RegistrationJPanel, GraduationAuditJPanel, TranscriptJPanel, and StudentMyProfileJPanel
  - Added README documentation and added additional slide presentation content.


## Faculty Use Case (Cohen Powell)

The faculty role has four responsibilities accessible from the faculty dashboard after logging in:

**Manage Courses** — View courses offered this semester. Select a course to see enrolled students and their grades. Faculty can assign or update grades for individual students.

**My Profile** — View personal info (name, role) and update department, email, and phone fields.

**Performance Reports** — Select a course to see a breakdown of student grades with pass/fail status and the calculated class GPA average.

**Manage Student Profiles** — View students enrolled in each course, see how many courses they're taking, and click "View Details" to see a full summary of a student's enrollment and grades across all courses.

### Files Added (Faculty Use Case)

Business layer:
- `Business/Profiles/FacultyProfile.java` — extends Profile for faculty role
- `Business/Profiles/FacultyDirectory.java` — manages faculty profile list
- `Business/Course/Course.java` — course model with number, name, credits, description
- `Business/Course/CourseCatalog.java` — stores all available courses
- `Business/Course/CourseOffer.java` — a course offered in a specific semester
- `Business/Course/CourseSchedule.java` — manages course offerings per semester
- `Business/Course/CourseLoad.java` — tracks a student's enrolled courses
- `Business/Course/SeatAssignment.java` — links a student to a course with a grade
- `Business/Course/FacultyAssignment.java` — links a faculty member to a course they teach

UI panels:
- `FacultyRole/ManageCourseWorkResp/ManageCoursesJPanel` — course and grade management
- `FacultyRole/MyProfileWorkResp/FacultyMyProfileJPanel` — profile view/edit
- `FacultyRole/PerformanceReportsWorkResp/PerformanceReportsJPanel` — grade reports with GPA
- `FacultyRole/ManageStudentsWorkResp/ManageStudentProfilesJPanel` — student enrollment viewer

Modified files:
- `Business/Business.java` — added FacultyDirectory, CourseCatalog, CourseSchedule
- `ConfigureABusiness.java` — added courses, faculty assignments, student enrollments, sample grades
- `FacultyWorkAreaJPanel.java` — wired buttons to faculty panels
- `ProfileWorkAreaMainFrame.java` — enabled faculty login with FacultyProfile
