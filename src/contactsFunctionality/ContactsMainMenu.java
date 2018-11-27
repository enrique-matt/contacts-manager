package contactsFunctionality;

import contactsFileManipulation.FileReadWrite;
import util.Input;

import java.util.List;
import java.util.Scanner;

public class ContactsMainMenu extends FileReadWrite {

    private static List<String> contactsListString = FileReadWrite.getContactsListString();

    private static String userInterface =
            "\n\n\n" +
                    "____ ____ _  _ ___ ____ ____ ___ ____    _  _ ____ _  _ ____ ____ ____ ____    _  _ ____ _ _  _    _  _ ____ _  _ _  _ \n" +
                    "|    |  | |\\ |  |  |__| |     |  [__     |\\/| |__| |\\ | |__| | __ |___ |__/    |\\/| |__| | |\\ |    |\\/| |___ |\\ | |  | \n" +
                    "|___ |__| | \\|  |  |  | |___  |  ___]    |  | |  | | \\| |  | |__] |___ |  \\    |  | |  | | | \\|    |  | |___ | \\| |__| \n" +
                    "                                                                                                                       \n" +
            "1. View contacts.\n" +
            "2. Add a new contact.\n" +
            "3. Search a contact by name.\n" +
            "4. Delete an existing contact.\n" +
            "5. Exit.\n" +
            "Enter an option (1, 2, 3, 4 or 5):";

    public static void mainMenu(){
        Input in = new Input(new Scanner(System.in));

        System.out.println(userInterface);
        int menuNum = in.getInt(1, 5);

        switch (menuNum) {
            case 1:
                ShowContacts.showContact(contactsListString);
                mainMenu();
                break;
            case 2:
                contactsListString = AddContact.addContact(contactsListString);
                mainMenu();
                break;
            case 3:
                SearchContact.searchContact(contactsListString);
                mainMenu();
                break;
            case 4:
                contactsListString = DeleteContact.deleteContact(contactsListString);
                mainMenu();
                break;
            case 5:
                System.out.println("Are you sure?");
                in.yesNo();
                FileReadWrite.setContactsList(contactsListString);
                break;
        }
    }
}
