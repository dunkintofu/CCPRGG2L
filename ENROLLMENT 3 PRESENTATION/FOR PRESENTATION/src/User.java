
//import necessary imports for this class
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


//abstraction class user inherited by Student class
abstract class User {
    String username;
    String password;
    String role;
    
// Constructor to initialize the common attributes
    User(String username, String role, String password) {
        this.username = username;
        this.role = role;
        this.password = password;
    }
    
    // Abstract method that needs to be implemented by the subclasses
    abstract void menu();
}

// Admin is a subclass of User that contains additional functionality related to managing courses.
class Admin extends User {
    ArrayList<String> courses;

// Constructor to initialize the Admin-specific attributes and call the superclass constructor
    Admin(String username, String password) {
        super(username, "admin", password);
        this.courses = new ArrayList<>();
    }
    
    
// Implementation of the abstract method in the superclass
    void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
             // Display the menu options
            System.out.println("\nMenu:");
            System.out.println("1. View Courses");
            System.out.println("2. Add Course");
            System.out.println("3. Remove Course");
            System.out.println("4. Logout");
            System.out.print("Choice: ");
               // Read the user's choice
            int choice = scanner.nextInt();
            
            // Based on the user's choice, call the appropriate method
            if (choice == 1) {
                viewCourses();
            } else if (choice == 2) {
                addCourse();
            } else if (choice == 3) {
                removeCourse();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    //method to view all the courses
    void viewCourses() {
        System.out.println("\nCourses:");
        for (String course : courses) {
            System.out.println(course);
        }
    }
//method to add courses
    void addCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter course name: ");
        String name = scanner.nextLine();
        System.out.print("Enter course unit: ");
        String unit = scanner.nextLine();

        String course = name + " | [" + unit + "] Units";
        courses.add(course);

        try {
            FileWriter writer = new FileWriter("courses.txt", true);
            writer.write(course + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        System.out.println("Course added successfully.");
    }
//method to remove
    void removeCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter course name: ");
        String name = scanner.nextLine();

        String courseToRemove = null;
        for (String course : courses) {
            if (course.contains(name)) {
                courseToRemove = course;
                break;
            }
        }

        if (courseToRemove == null) {
            System.out.println("Course not found.");
        } else {
            courses.remove(courseToRemove);

            try {
                FileWriter writer = new FileWriter("courses.txt");
                for (String course : courses) {
                    writer.write(course + "\n");
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }

            System.out.println("Course removed successfully.");
        }
    }
}