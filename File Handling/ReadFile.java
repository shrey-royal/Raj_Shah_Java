import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter fileName: ");
        fileName = sc.nextLine();

        try {
            FileReader reader = new FileReader(fileName + ".txt");
            int character;
            
            System.out.print("File Contents:");
            System.out.println("\n--------------------------------------------------");
            while( (character = reader.read()) != -1 ) {
                System.out.print((char)character);
            }
            System.out.println("\n--------------------------------------------------");

            System.out.println("File Read Successfully!");
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
