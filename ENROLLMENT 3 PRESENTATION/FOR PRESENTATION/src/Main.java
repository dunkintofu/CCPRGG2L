
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException {
//object scanner 
Scanner scanner = new Scanner(System.in);
//ArrayList object "users" to store users
ArrayList<User> users = new ArrayList<>();
    try {
        // read user data from a file
        //object of file named file
        File file = new File("users.txt");
        //scanner object for file
        Scanner fileScanner = new Scanner(file);
 // process each line of the file
while (fileScanner.hasNextLine()) {
    String line = fileScanner.nextLine();
    String[] parts = line.split(","); //regex to split line in parts array with comma as delimiter
    if (parts.length >= 3) { // to make sure the array has at least 3 elements which is the username, user type (role), password
        String username = parts[0]; //username variable as index 0 in parts array
        String role = parts[1];     //role variable as index 1 in parts array
        String password = parts[2]; //password variable as index 2 in parts array
        //using equalsIgnorecase method to determine whether to add the user 
        if (role.equalsIgnoreCase("admin")) {
            users.add(new Admin(username, password)); //creates a new instance of the Admin class with the specified username and password parameters, and adds it to the users collection using the add() method
        } else {
            users.add(new Student(username, password));
        }
    } else {
        System.out.println("Invalid user data: " + line);
    }
}


        fileScanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred while reading the file.");
        e.printStackTrace();
    }

    while (true) {
        System.out.println("\nMenu:");
        System.out.println("1. Student Login");
        System.out.println("2. Admin Login");
        System.out.println("3. Register");
        System.out.println("4. Quit");
        System.out.print("Choice: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            studentLogin(users);
        } else if (choice == 2) {
            adminLogin(users);
        } else if (choice == 3) {
            register(users);
        } else if (choice == 4) {
            break;
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
}

static void studentLogin(ArrayList<User> users) {
    Scanner scanner = new Scanner(System.in);
System.out.print("\nEnter username: ");
String username = scanner.nextLine();
System.out.print("Enter password: ");
String password = scanner.nextLine();
for (User user : users) {
    if (user.username.equals(username) && user.password.equals(password) && user.role.equalsIgnoreCase("student")) {
        ((Student) user).menu();
        return;
    }
}

System.out.println("Invalid username or password.");
}

static void adminLogin(ArrayList<User> users) {
Scanner scanner = new Scanner(System.in);
System.out.print("\nEnter username: ");
String username = scanner.nextLine();
System.out.print("Enter password: ");
String password = scanner.nextLine();
for (User user : users) {
    if (user.username.equals(username) && user.password.equals(password) && user.role.equals("admin")) {
        ((Admin) user).menu();
        return;
    }
}

System.out.println("Invalid username or password.");
}

static void register(ArrayList<User> users) throws IOException {
Scanner scanner = new Scanner(System.in);
System.out.print("\nEnter username: ");
String username = scanner.nextLine();
System.out.print("Enter password: ");
String password = scanner.nextLine();
System.out.print("Are you a student or an admin? ");
String role = scanner.nextLine();
if (role.equals("student")) {
    users.add(new Student(username, password));
} else if (role.equals("admin")) {
    users.add(new Admin(username, password));
} else {
    System.out.println("Invalid role.");
    return;
}

FileWriter writer = new FileWriter("users.txt", true);
writer.write(username + "," + role + "," + password + "\n");
writer.close();

System.out.println("Registration successful.");
}
}
