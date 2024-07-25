import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contacts> list=new ArrayList<>();

    public void create(){
        Contacts newContact = new Contacts();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name");
        newContact.firstName=sc.nextLine();
        System.out.println("Enter your Last Name");
        newContact.lastName= sc.nextLine();
        System.out.println("Enter your Address");
        newContact.address= sc.nextLine();
        System.out.println("Enter your City");
        newContact.city= sc.nextLine();
        System.out.println("Enter your State");
        newContact.state= sc.nextLine();
        System.out.println("Enter your Zip Code");
        Scanner sc1=new Scanner(System.in);
        newContact.zip= sc1.nextInt();;
        System.out.println("Enter your Number");
        newContact.number= sc1.nextLong();
        System.out.println("Enter your Email");
        newContact.email= sc.nextLine();

        list.add(newContact);
    }

    public void read(String name){
        boolean fl=false;
        for(Contacts gg:list) {
            if (Objects.equals(gg.firstName, name) || Objects.equals(gg.lastName, name)) {
                System.out.println(gg);
                fl=true;
            }
        }
        if(!fl)
            System.out.println("Given name is not there in Database");
    }
    }


