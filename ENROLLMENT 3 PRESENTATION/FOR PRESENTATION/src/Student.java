
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User {
    ArrayList<String> coursesEnrolled;

    Student(String username, String password) {
        super(username, "student", password);
        this.coursesEnrolled = new ArrayList<>();
    }

    // Implementation of the abstract method in the superclass
    void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Display the menu options
            System.out.println("\nMenu:");
            System.out.println("1. View Courses");
            System.out.println("2. Enroll Course");
            System.out.println("3. Drop Course");
            System.out.println("4. Logout");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                viewCourses();
            } else if (choice == 2) {
                enrollCourse();
            } else if (choice == 3) {
                dropCourse();
            } else if (choice == 4) {
             break;
            } else {
            System.out.println("Invalid choice. Please try again.");
            }
            }
            }
    
    //method to view courses
    void viewCourses() {
    try {
        File file = new File("courses.txt");
        Scanner scanner = new Scanner(file);

        System.out.println("\nCourses:");
        while (scanner.hasNextLine()) {
            String course = scanner.nextLine();
            System.out.println(course);
        }

        scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred while reading the file.");
        e.printStackTrace();
    }
}
//method to enroll courses
void enrollCourse() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter course name: ");
    String name = scanner.nextLine();

    try {
        File file = new File("courses.txt");
        Scanner fileScanner = new Scanner(file);
        boolean courseFound = false;

        while (fileScanner.hasNextLine()) {
            String course = fileScanner.nextLine();
            if (course.contains(name)) {
                courseFound = true;
                break;
            }
        }

        fileScanner.close();

        if (!courseFound) {
            System.out.println("Course not available.");
        } else if (coursesEnrolled.contains(name)) {
            System.out.println("You have already enrolled in this course.");
        } else {
            coursesEnrolled.add(name);
            System.out.println("Course enrolled successfully.");
        }
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred while reading the file.");
        e.printStackTrace();
    }
}
//method to drop courses
void dropCourse() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter course name: ");
    String name = scanner.nextLine();

    if (!coursesEnrolled.contains(name)) {
        System.out.println("You haven't enrolled in this course yet.");
    } else {
        coursesEnrolled.remove(name);
        System.out.println("Course dropped successfully.");
    }
}
}