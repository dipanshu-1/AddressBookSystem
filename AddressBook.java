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

    public void delete(String name){
        boolean fl=false;
        for(Contacts gg:list) {
            if (Objects.equals(gg.firstName, name) || Objects.equals(gg.lastName, name)) {
                list.remove(gg);
                System.out.println("Deleted!");
            }
        }
        if(!fl)
            System.out.println("There is no file having name : "+name);
    }

    public void edit(String name){
        boolean fl=false;
        for(Contacts gg:list) {
            if(Objects.equals(gg.firstName, name) || Objects.equals(gg.lastName, name)) {
                fl = true;
                System.out.println("Which field you Want to change");
                System.out.println("1. Address");
                System.out.println("2. City");
                System.out.println("3. State");
                System.out.println("4. Zip");
                System.out.println("5. Number");
                System.out.println("6. Email");
                Scanner sc=new Scanner(System.in);
                int option = sc.nextInt();

                Scanner sc1 = new Scanner(System.in);
                switch (option) {
                    case 1:
                        System.out.println("Enter the New Address: ");
                        gg.address= sc1.nextLine();
                        break;
                    case 2:
                        System.out.println("Enter the New City: ");
                        gg.city= sc1.nextLine();
                        break;
                    case 3:
                        System.out.println("Enter the New State: ");
                        gg.state= sc1.nextLine();
                        break;
                    case 4:
                        System.out.println("Enter the New Zip");
                        gg.zip=sc.nextInt();
                        break;
                    case 5:
                        System.out.println("Enter the New Number");
                        gg.number= sc.nextLong();
                        break;
                    case 6:
                        System.out.println("Enter the New Email");
                        gg.email= sc1.nextLine();
                        break;
                    default:
                        System.out.println("Enter Valid option");
                        break;
                }

            }
        }
        if (!fl)
            System.out.println("There is no file having name : " + name);
    }
    }


