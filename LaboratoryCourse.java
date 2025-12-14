// LaboratoryCourse.java
public class LaboratoryCourse extends Course {

    public LaboratoryCourse(String code, String name, int units) {
        super(code, name, units);
    }

    @Override
    public String getCourseType() {
        return "Laboratory";
    }
}
