import java.io.FileWriter;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter fileName: ");
        fileName = sc.nextLine();

        try {
            FileWriter writer = new FileWriter(fileName + ".txt");
            String data;
            System.out.print("Enter data to insert into file " + fileName + ".txt: ");
            data = sc.nextLine();
            writer.write(data);
            System.out.println("File Written Successfully!");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}