// SeminarCourse.java
public class SeminarCourse extends Course {

    public SeminarCourse(String code, String name, int units) {
        super(code, name, units);
    }

    @Override
    public String getCourseType() {
        return "Seminar";
    }
}
