package contactsFileManipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReadWrite {

    private static Path contactsListPath = Paths.get("src/contactsFileManipulation/contacts-manager.txt");
    private static List<String> contactsListString = new ArrayList<>();


    protected static List<String> getContactsListString() {
        try {
            contactsListString = Files.readAllLines(contactsListPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contactsListString;
    }
    public static void setContactsList(List<String> contactsListString) {
        try {
            Files.write(contactsListPath, contactsListString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
