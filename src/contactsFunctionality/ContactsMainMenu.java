package contactsFunctionality;

import contactsFileManipulation.FileReadWrite;

import java.util.List;

public class ContactsMainMenu extends FileReadWrite {

    private static List<String> contactsListString = FileReadWrite.getContactsListString();

    public static void contactsMain() {

        AddContact.addContact(contactsListString);

    }

    public static void main(String[] args) {

        FileReadWrite.setContactsList(AddContact.addContact(contactsListString));
    }
}
