package contactsFunctionality;

import util.Input;
import java.util.List;
import java.util.Scanner;

public class AddContact {

    protected static List<String> addContact(List<String> contactsListString){
        Input in = new Input(new Scanner(System.in));

        System.out.print("\nPlease enter a contact name: ");
        String contactName = in.getString();

        String newContact = contactName + " | " + newNumber(contactsListString, in);

        contactsListString.add(newContact);
        System.out.println("Contact Added!");
        return contactsListString;
    }


    private static String newNumber(List<String> contactsListString, Input in){

        System.out.print("Please enter a contact phone number: ");
        String contactPhoneNum = in.getString();

        if (contactPhoneNum.length() == 7){
            String firstThree = contactPhoneNum.substring(0, 3);
            String lastFour = contactPhoneNum.substring(3, 7);
            return firstThree + "-" + lastFour;

        } else if (contactPhoneNum.length() == 10){
            String firstThree = contactPhoneNum.substring(0, 3);
            String secondThree = contactPhoneNum.substring(3, 6);
            String lastFour = contactPhoneNum.substring(6, 10);
            return "("+ firstThree + ") " + secondThree + "-" + lastFour;

        } else {
            System.out.println("Invalid Input");
            return newNumber(contactsListString, in);
        }

    }
}
