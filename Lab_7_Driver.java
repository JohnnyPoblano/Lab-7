/*
**  John G
**  CIS 131
**  Lab 7
*/

public class Lab_7_Driver {

    // Constants
    final static int CRN_ONE = 20008;
    final static String DEPT_ONE = "CIS";
    final static int COURSE_NUM_ONE = 131;
    final static String INST_MODE_ONE = "Online";
    final static String CAMPUS_ONE = "East";
    final static String MEETING_DAYS_ONE = "N/A";
    final static String MEETING_TIMES_ONE = "N/A";
    final static int CAPACITY_ONE = 30;
    final static int ENROLLMENT_ONE = 30;
    final static int INSTRUCTOR_ID_ONE = 654;

    final static int CRN_TWO = 63725;
    final static String DEPT_TWO = "SSE";
    final static int COURSE_NUM_TWO = 211;
    final static String INST_MODE_TWO = "Classroom";
    final static String CAMPUS_TWO = "West";
    final static String MEETING_DAYS_TWO = "35";
    final static String MEETING_TIMES_TWO = "5:45pm to 8:15pm";
    final static int CAPACITY_TWO = 31;
    final static int ENROLLMENT_TWO = 13;
    final static int INSTRUCTOR_ID_TWO = 414;

    // ArrayList constants
    final static String STUDENT_ID_1 = "A001";
    final static String STUDENT_ID_2 = "A002";
    final static String STUDENT_ID_3 = "A003";
    final static String STUDENT_ID_4 = "A004";

    final static int STUDENT_GRADE_1 = 1;
    final static int STUDENT_GRADE_2 = 2;
    final static int STUDENT_GRADE_3 = 3;
    final static int STUDENT_GRADE_4 = 4;


    public static void main(String args[]) {

        // Create class object with no-arg constructor
        ClassSection classOne = new ClassSection();

        // Assign values using mutator methods
        classOne.setCrn(CRN_ONE);
        classOne.setDepartmentCode(DEPT_ONE);
        classOne.setCourseNumber(COURSE_NUM_ONE);
        classOne.setInstructionalMode(INST_MODE_ONE);
        classOne.setCampus(CAMPUS_ONE);
        classOne.setMeetingDays(MEETING_DAYS_ONE);
        classOne.setMeetingTimes(MEETING_TIMES_ONE);
        classOne.setCapacity(CAPACITY_ONE);
        classOne.setEnrollment(ENROLLMENT_ONE);
        classOne.setInstructorID(INSTRUCTOR_ID_ONE);

        // Add 4 students to enrollee list field (grades 0, sequential id's)
        Student studentOne = new Student(STUDENT_ID_1, 0);
        Student studentTwo = new Student(STUDENT_ID_2, 0);
        Student studentThree = new Student(STUDENT_ID_3, 0);
        Student studentFour = new Student(STUDENT_ID_4, 0);
        
        classOne.addStudent(studentOne);
        classOne.addStudent(studentTwo);
        classOne.addStudent(studentThree);
        classOne.addStudent(studentFour);

        // Display class one with toString method
        System.out.println(classOne.toString());

        // Display enrollee list
        classOne.displayEnrolleeList(classOne.getEnrolleeList());

        // Set each grade for enrolled students
        studentOne.setGrade(STUDENT_GRADE_1);
        studentTwo.setGrade(STUDENT_GRADE_2);
        studentThree.setGrade(STUDENT_GRADE_3);
        studentFour.setGrade(STUDENT_GRADE_4);

        // Display enrollee list
        classOne.displayEnrolleeList(classOne.getEnrolleeList());

        // Remove a student
        classOne.removeStudent(0);

        // Display enrolle list
        classOne.displayEnrolleeList(classOne.getEnrolleeList());

    }


}