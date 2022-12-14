import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ErrorHandling {

    private static final String FILENAME = "INSERT_FILE_HERE";

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try {
            File file = new File(FILENAME);
            FileInputStream reader = new FileInputStream(file);

            int ch;
            while ((ch = reader.read()) != -1)
                System.out.print((char) ch);

            reader.close();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text to append to the file: ");
            String textToAppend = scanner.nextLine();
            FileOutputStream writer = new FileOutputStream(file, true);
            for (int i = 0; i < textToAppend.length(); i++)
                writer.write(textToAppend.charAt(i));
            writer.write('\n');
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("File operations completed.");
        }
    }
}
