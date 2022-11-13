import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {

    private static final String FILENAME = "INSERT_FILE_HERE";

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File(FILENAME);
        FileReader reader = new FileReader(file);

        int ch;
        while ((ch = reader.read()) != -1)
            System.out.print((char) ch);

        reader.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to append to the file: ");
        String textToAppend = scanner.next();
        FileWriter writer = new FileWriter(file, true);
        for (int i = 0; i < textToAppend.length(); i++)
            writer.write(textToAppend.charAt(i));
        writer.close();
    }
}
