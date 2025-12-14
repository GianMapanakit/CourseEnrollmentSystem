// LectureCourse.java
public class LectureCourse extends Course {

    public LectureCourse(String code, String name, int units) {
        super(code, name, units);
    }

    @Override
    public String getCourseType() {
        return "Lecture";
    }
}