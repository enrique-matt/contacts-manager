package contactsFunctionality;


import java.util.List;


public class ShowContacts {

    protected static void showContact(List<String> contactsListString){

        System.out.format("%nName | Phone Number%n----------------------%n");


        for (String contact : contactsListString){

            System.out.println(contact);

        }

    }
//    Name | Phone number
//---------------
//    Jack Blank | 1231231234
//    Jane Doe | 2342342345
//    Sam Space | 3453453456
}
