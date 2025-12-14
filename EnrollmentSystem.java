// EnrollmentSystem.java
import java.util.Scanner;

public class EnrollmentSystem {
    private Course[] courses = new Course[10];
    private int count = 0;

    Scanner sc = new Scanner(System.in);

    public void addCourse() {
        try {
            if (count >= courses.length) {
                System.out.println("Course list is full.");
                return;
            }

            System.out.print("Enter Course Code: ");
            String code = sc.nextLine();

            System.out.print("Enter Course Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Units: ");
            int units = Integer.parseInt(sc.nextLine());

            System.out.println("Choose Course Type:");
            System.out.println("1 - Lecture\n2 - Laboratory\n3 - Seminar");
            System.out.print("Choice: ");
            int type = Integer.parseInt(sc.nextLine());

            Course newCourse;

            switch (type) {
                case 1:
                    newCourse = new LectureCourse(code, name, units);
                    break;
                case 2:
                    newCourse = new LaboratoryCourse(code, name, units);
                    break;
                case 3:
                    newCourse = new SeminarCourse(code, name, units);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid course type selected.");
            }

            courses[count++] = newCourse;
            System.out.println("Course enrolled successfully!\n");

        } catch (NumberFormatException e) {
            System.out.println("Invalid number input! Please try again.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void viewCourses() {
        if (count == 0) {
            System.out.println("No courses enrolled yet.\n");
            return;
        }

        System.out.println("\n--- Enrolled Courses ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + courses[i]);
        }
        System.out.println();
    }
}
