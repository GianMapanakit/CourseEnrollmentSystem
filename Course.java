// Course.java
public abstract class Course {
    private String courseCode;
    private String courseName;
    private int units;

    // Encapsulation: getters/setters
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String code) { this.courseCode = code; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String name) { this.courseName = name; }

    public int getUnits() { return units; }
    public void setUnits(int units) { this.units = units; }

    // Constructor
    public Course(String courseCode, String courseName, int units) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.units = units;
    }

    // Polymorphism via abstract method
    public abstract String getCourseType();

    public String toString() {
        return "[" + courseCode + "] " + courseName + " (" + units + " units), Type: " + getCourseType();
    }
}
