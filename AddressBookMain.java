import java.util.Scanner;

public class AddressBookMain
{
    public static void main(String[] args) {
        System.out.println("Welocme to addressbook");
        boolean fl=true;

        AddressBook func= new AddressBook();

        while (fl){

        System.out.println("Choose the option below");
        System.out.println("1. Add new Contact");
        System.out.println("2. Read Contact detail using first name or last name");
        System.out.println("3. Edit the Existing Contact");
        System.out.println("4. Delete the Existing Contact");
        System.out.println("5. Exit");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        Scanner sc1=new Scanner(System.in);


            switch (option) {
                case 1:
                    func.create();
                    break;
                case 2:
                    func.read(sc1.nextLine());
                    break;
                case 3:
                    func.edit(sc1.nextLine());
                    break;
                case 4:
                    func.delete(sc1.nextLine());
                    break;
                case 5:
                    fl=false;
                     break;
                default:
                    System.out.println("Enter valid input");
                    break;

            }
        }
    }
}
