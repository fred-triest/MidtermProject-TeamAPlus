# MidtermProject-TeamAPlus
Digital University System with an Access Control Layer

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
