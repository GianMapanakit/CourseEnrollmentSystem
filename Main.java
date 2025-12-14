// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnrollmentSystem system = new EnrollmentSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== COURSE ENROLLMENT SYSTEM ===");
            System.out.println("1 - Enroll Course");
            System.out.println("2 - View Enrolled Courses");
            System.out.println("3 - Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    system.addCourse();
                    break;
                case "2":
                    system.viewCourses();
                    break;
                case "3":
                    System.out.println("Exiting system... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }
}