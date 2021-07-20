import java.util.Scanner;
public class PublicLibrarySystem {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numOfMembers;

        System.out.print("How many members the library will have? ");
        numOfMembers = scanner.nextInt();

        int[] memberID = new int[numOfMembers];
        String[] fullMemberName = new String[numOfMembers];
        short[] membersAge = new short[numOfMembers];
        char[] membersSex = new char[numOfMembers];
        boolean[] isFilled = new boolean[numOfMembers];

        menu(memberID, fullMemberName, membersAge, membersSex, isFilled);

    }

    static void menu(int[] memberID,String[] fullMemberName,short[] membersAge,char[] membersSex,boolean[] isFilled) {
        short menuItem;
        System.out.println("Enter :\n1\tto add a member\n2\tto see a member's information\n3\tto edit a member's information\n4\tto delete a member\n5\tto exit\n\n\t\tTHEN PRESS ENTER");
        menuItem = scanner.nextShort();
        switch (menuItem) {
            case 1:
                create(memberID, fullMemberName, membersAge, membersSex, isFilled);
                menu(memberID, fullMemberName, membersAge, membersSex, isFilled);
            case 2:
                read(memberID, fullMemberName, membersAge, membersSex);
                menu(memberID, fullMemberName, membersAge, membersSex, isFilled);
            case 3:
                update(memberID, fullMemberName, membersAge, membersSex);
                menu(memberID, fullMemberName, membersAge, membersSex, isFilled);
            case 4:
                delete(memberID, fullMemberName, membersAge, membersSex, isFilled);
                menu(memberID, fullMemberName, membersAge, membersSex, isFilled);
            case 5:
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Please enter a valid value!!");
                menu(memberID, fullMemberName, membersAge, membersSex, isFilled);
        }

    }
    static void create(int[] memberID,String[] fullMemberName,short[] membersAge,char[] membersSex,boolean[] isFilled) {
        int i = 0;
        while (memberID[i] != 0) {
            i++;
            if (i == memberID.length) {
                System.out.println("\t\t\t\t*** NO MORE PLACE IN LIBRARY !!! ***");
                return;
            }
        }
            memberID[i] = i + 1;

            System.out.print("Please enter the full name of the new member : ");
            fullMemberName[i] = scanner.next();

            System.out.print("Please enter his/her age : ");
            membersAge[i] = scanner.nextShort();

            System.out.print("Please enter his/her sex ('M' for male and 'F' for Female) : ");
            membersSex[i] = scanner.next().charAt(0);

            isFilled[i] = true;

            System.out.println("ID : " + memberID[i] + "\tName : " + fullMemberName[i] + "\tAge : " + membersAge[i] + "\tSex : " + membersSex[i]);


    }

    static void read(int[] memberID,String[] fullMemberName,short[] membersAge,char[] membersSex) {
        int scannedID;
        System.out.print("please insert Member ID : ");
        scannedID = scanner.nextInt();

        for(int i = 0; i < memberID.length; i++)
            if(scannedID == memberID[i]) {
                System.out.println("ID : " + memberID[i] + "\tName : " + fullMemberName[i] + "\tAge : " + membersAge[i] + "\tSex : " + membersSex[i]);
                return;
            }
        System.out.println("\t\t\t*** INVALID ID !! ***");

    }

    static void update(int[] memberID,String[] fullMemberName,short[] membersAge,char[] membersSex) {
        int scannedID;
        System.out.print("please insert Member ID : ");
        scannedID = scanner.nextInt();

        for(int i = 0; i < memberID.length; i++)
            if(scannedID == memberID[i]) {
                System.out.print("Please enter the  new name : ");
                fullMemberName[i] = scanner.next();

                System.out.print("Please enter the new age : ");
                membersAge[i] = scanner.nextShort();

                System.out.print("Please enter the new sex ('M' for male and 'F' for Female) : ");
                membersSex[i] = scanner.next().charAt(0);

                System.out.println("ID : " + memberID[i] + "\tUSER'S NEW INFO\tName : " + fullMemberName[i] + "\tAge : " + membersAge[i] + "\tSex : " + membersSex[i]);
                return;
            }
        System.out.println("\t\t\t*** INVALID ID !! ***");

    }

    static void delete(int[] memberID,String[] fullMemberName,short[] membersAge,char[] membersSex,boolean[] isFilled) {
        int scannedID;
        System.out.print("please insert Member ID : ");
        scannedID = scanner.nextInt();

        for(int i = 0; i < memberID.length; i++)
            if(scannedID == memberID[i]) {
                fullMemberName[i] = "";
                membersAge[i] = 0;
                membersSex[i] = '0';
                isFilled[i] = false;

                System.out.println("ID : " + memberID[i] + "\tDELETED\tName : " + fullMemberName[i] + "\tAge : " + membersAge[i] + "\tSex : " + membersSex[i] + "\tisFilled : " + isFilled[i]);
                return;
            }
        System.out.println("\t\t\t*** INVALID ID !! ***");

    }

}
