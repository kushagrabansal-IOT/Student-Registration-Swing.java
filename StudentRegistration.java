import java.util.Scanner;

public class StudentRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Student Registration Form");
        System.out.println("-------------------------");

        System.out.print("Student Name: ");
        String name = sc.nextLine();

        if (name.trim().isEmpty()) {
            System.out.println("Please enter Student Name");
            return;
        }

        System.out.print("Roll Number: ");
        String roll = sc.nextLine();

        if (roll.trim().isEmpty()) {
            System.out.println("Please enter Roll Number");
            return;
        }

        System.out.print("Gender (Male/Female): ");
        String gender = sc.nextLine();

        if (!gender.equalsIgnoreCase("Male")
                && !gender.equalsIgnoreCase("Female")) {
            System.out.println("Please select Gender");
            return;
        }

        System.out.print("Branch: ");
        String branch = sc.nextLine();

        if (branch.trim().isEmpty()) {
            System.out.println("Please enter Branch");
            return;
        }

        System.out.print("Accept Terms & Conditions (yes/no): ");
        String terms = sc.nextLine();

        if (!terms.equalsIgnoreCase("yes")) {
            System.out.println("Please accept Terms & Conditions");
            return;
        }

        System.out.println("\nRegistration Successful");
        System.out.println("-------------------------");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + roll);
        System.out.println("Gender : " + gender);
        System.out.println("Branch : " + branch);

        sc.close();
