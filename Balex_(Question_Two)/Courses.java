import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        // Arrays to store course details
        String[] courseIDs = {"BSE", "BIT", "BCS", "BCE"};
        String[] courseNames = {"Software Engineering", "Information Technology", "Computer Science", "Computer Engineering"};
        int[] tuitions = {900000, 750000, 800000, 950000};

        // Creating a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the CourseID
        System.out.print("Enter the CourseID: ");
        String courseID = scanner.nextLine();

        // Initialize a flag to indicate if the CourseID was found
        boolean found = false;

        // Iterate over the array to find the course details
        for (int i = 0; i < courseIDs.length; i++) {
            if (courseIDs[i].equalsIgnoreCase(courseID)) {
                // If the CourseID is found, print the course details
                System.out.println("Course: " + courseNames[i] + ", Tuition: " + tuitions[i]);
                found = true;
                break;
            }
        }

        // If the CourseID was not found, print an error message
        if (!found) {
            System.out.println("Wrong CourseID details");
        }

        // Close the scanner
        scanner.close();
    }
}
