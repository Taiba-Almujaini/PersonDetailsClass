import ogject.PersonDetails;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        PersonDetails person = new PersonDetails(firstName, lastName);

        // Displaying the full name
        System.out.println("Full Name: " + person.getFullName());
    }
}