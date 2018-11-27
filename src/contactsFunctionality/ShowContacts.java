package contactsFunctionality;


import java.util.List;


public class ShowContacts {

    protected static void showContact(List<String> contactsListString){

        System.out.format("%nName            | Phone Number   |%n----------------------------------%n");

        for (String contact : contactsListString) {

            int separatorNum = contact.indexOf("|");
            String nameOnly = contact.substring(0, separatorNum - 1);
            String numberOnly = contact.substring(separatorNum);

            System.out.format("%-14s  %-12s |%n", nameOnly, numberOnly);
        }
    }
}
