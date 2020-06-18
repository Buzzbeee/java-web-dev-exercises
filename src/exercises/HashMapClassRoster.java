package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapClassRoster {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentID;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            studentID = input.nextLine();

            if (!studentID.equals("")) {
                System.out.print("Name: ");
                String newName = input.nextLine();
                students.put(Integer.parseInt(studentID), newName);

                // Read in the newline before looping back
            }

        } while(!studentID.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " ( NAME: " + student.getValue() + " )");
        }
    }
}
