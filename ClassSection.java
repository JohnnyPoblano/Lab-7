/*
**  John G
**  CIS 131
**  Lab 7
*/

public class ClassSection {

    // Fields
    private int crn;
    private String departmentCode;
    private int courseNumber;
    private String instructionalMode;
    private String campus;
    private String meetingDays;
    private String meetingTimes;
    private int capacity;
    private int enrollment;
    private int instructorID;

    // String manipulation constants
    final static String SUNDAY = "1";
    final static String MONDAY = "2";
    final static String TUESDAY = "3";
    final static String WEDNESDAY = "4";
    final static String THURSDAY = "5";
    final static String FRIDAY = "6";
    final static String SATURDAY = "7";

    final static String SUNDAY_STRING = "Sun";
    final static String MONDAY_STRING = "M";
    final static String TUESDAY_STRING = "T";
    final static String WEDNESDAY_STRING = "W";
    final static String THURSDAY_STRING = "Th";
    final static String FRIDAY_STRING = "F";
    final static String SATURDAY_STRING = "Sat";

    // No-arg constructor
    ClassSection() {
        crn = 0;
        departmentCode = "";
        courseNumber = 0;
        instructionalMode = "";
        campus = "";
        meetingDays = "";
        meetingTimes = "";
        capacity = 0;
        enrollment = 0;
        instructorID = 0;
    }

    // Constructor with args
    ClassSection(int c, String dC, int cN, String iM,
                 String camp, String mDays, String mTimes,
                 int capac, int enroll, int insID) {

        // Assign fields with args
        crn = c;
        departmentCode = dC;
        courseNumber = cN;
        instructionalMode = iM;
        campus = camp;
        meetingDays = mDays;
        meetingTimes = mTimes;
        capacity = capac;
        enrollment = enroll;
        instructorID = insID;
    }

    // Mutator 'setter' methods
    public void setCrn(int c) {
        this.crn = c;
    }

    public void setDepartmentCode(String d) {
        this.departmentCode = d;
    }

    public void setCourseNumber(int c) {
        this.courseNumber = c;
    }

    public void setInstructionalMode(String i) {
        this.instructionalMode = i;
    }

    public void setCampus(String c) {
        this.campus = c;
    }
    
    public void setMeetingDays(String m) {
        this.meetingDays = m;
    }
    
    public void setMeetingTimes(String m) {
        this.meetingTimes = m;
    }
    
    public void setCapacity(int c) {
        this.capacity = c;
    }

    public void setEnrollment(int e) {
        this.enrollment = e;
    }

    public void setInstructorID(int i) {
        this.instructorID = i;
    }

    // Return 'getter' methods
    public int getCrn() {
        return crn;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getInstructionalMode() {
        return instructionalMode;
    }

    public String getCampus() {
        return campus;
    }
    
    public String getMeetingDays() {
        return meetingDays;
    }
    
    public String getMeetingTimes() {
        return meetingTimes;
    }
    
    public int getCapacity() {
        return capacity;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public int getInstructorID() {
        return instructorID;
    }

    private String createWeekdayString(String weekdayNumber) {
        String weekdayString = "";

        if(weekdayNumber.contains(SUNDAY)) {
            weekdayString += SUNDAY_STRING;
        }

        if(weekdayNumber.contains(MONDAY)) {
            weekdayString += MONDAY_STRING;
        }

        if(weekdayNumber.contains(TUESDAY)) {
            weekdayString += TUESDAY_STRING;
        }

        if(weekdayNumber.contains(WEDNESDAY)) {
            weekdayString += WEDNESDAY_STRING;
        }

        if(weekdayNumber.contains(THURSDAY)) {
            weekdayString += THURSDAY_STRING;
        }

        if(weekdayNumber.contains(FRIDAY)) {
            weekdayString += FRIDAY_STRING;
        }

        if(weekdayNumber.contains(SATURDAY)) {
            weekdayString += SATURDAY_STRING;
        }

        if(weekdayString.equals("")) {
            weekdayString = "N/A";
        }

        return weekdayString;
    }

    // To string displays all fields
    public String toString() {
        String str = "************************************\n" +
                     "CRN:                     " + crn + "\n" +
                     "Department:              " + departmentCode + "\n" +
                     "Course Number:           " + courseNumber + "\n" +
                     "Instructional Mode:      " + instructionalMode + "\n" +
                     "Campus:                  " + campus + "\n" +
                     "Meeting Days:            " + createWeekdayString(meetingDays) + "\n" +
                     "Meeting Times:           " + meetingTimes + "\n" +
                     "Capacity:                " + capacity  + "\n" +
                     "Enrollment:              " + enrollment + "\n" +
                     "Instructor's ID:         " + instructorID + "\n" +
                     "************************************\n";

        return str;
    }

}