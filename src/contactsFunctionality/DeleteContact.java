package contactsFunctionality;

import util.Input;
import java.util.List;
import java.util.Scanner;

public class DeleteContact {

    public static List<String> deleteContact(List<String> contactsListString){
        Input in = new Input(new Scanner(System.in));

        System.out.print("Please enter a contact name to delete: ");
        String contactName = in.getString();
        int testNum = 0;

        for (int i = 0; i < contactsListString.size(); i++){

            int separatorNum = contactsListString.get(i).indexOf("|");
            String nameOnly = contactsListString.get(i).substring(0, separatorNum - 1);

            if (contactName.equalsIgnoreCase(nameOnly)){
                contactsListString.remove(i);
                testNum += 1;
                break;
            }
        }

        if (testNum == 0){
            System.out.println("Invalid Input.");
        }

        return contactsListString;
    }
}
