import java.util.Scanner;

public class AddressBookMain
{
    public static void main(String[] args) {
        System.out.println("Welocme to addressbook");

        AddressBook func= new AddressBook();
        func.create();
        String name="Dipanshu";
        System.out.println(func.read(name));

    }
}
