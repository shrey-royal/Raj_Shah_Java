import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String name, email, phone_number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter email: ");
        email = sc.next();

        System.out.print("Enter phone_number: ");
        phone_number = sc.next();

        sc.close();

        System.out.println("Details: ");
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("phone_number: " + phone_number);
    }
}
