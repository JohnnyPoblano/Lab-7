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

        // Display class one with toString method
        System.out.println(classOne.toString());

        // Create class object with constructor method
        ClassSection classTwo = new ClassSection(CRN_TWO, DEPT_TWO, COURSE_NUM_TWO, INST_MODE_TWO, CAMPUS_TWO, MEETING_DAYS_TWO, MEETING_TIMES_TWO, CAPACITY_TWO, ENROLLMENT_TWO, INSTRUCTOR_ID_TWO);

        // Display class two with toString method
        System.out.println(classTwo.toString());
    }


}