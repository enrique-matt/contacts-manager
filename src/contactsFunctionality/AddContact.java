package contactsFunctionality;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddContact {

    public static List<String> addContact(List<String> contactsListString){
        Input in = new Input(new Scanner(System.in));

        System.out.print("Please enter a contact name: ");
        String contactName = in.getString();

        System.out.print("Please enter a contact phone number: ");
        String contactPhoneNum = in.getString();

        String newContact = contactName + " | " + contactPhoneNum;

        contactsListString.add(newContact);
        return contactsListString;

    }
}
