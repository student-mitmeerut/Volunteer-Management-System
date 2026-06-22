import java.util.ArrayList;
import java.util.Scanner;


public class VolunteerManagementSystem {

    static ArrayList<Volunteer> volunteers = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
       while(true){

    System.out.println("\n===== Volunteer Management System =====");
    System.out.println("1. Add Volunteer");
    System.out.println("2. View Volunteers");
    System.out.println("3. Search Volunteer");
    System.out.println("4. Delete Volunteer");
    System.out.println("5. Generate Report");
    System.out.println("6. Exit");

    int choice = sc.nextInt();

    switch(choice){

        case 1:
            addVolunteer();
            break;

        case 2:
            viewVolunteers();
            break;

        case 3:
            searchVolunteer();
            break;

        case 4:
            deleteVolunteer();
            break;

        case 5:
            generateReport();
            break;

        case 6:
            System.exit(0);

        default:
            System.out.println("Invalid Choice");
    }
} 

    }
    public static void addVolunteer(){

    System.out.print("Enter ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Email: ");
    String email = sc.nextLine();

    System.out.print("Enter City: ");
    String city = sc.nextLine();

    volunteers.add(new Volunteer(id,name,email,city));

    System.out.println("Volunteer Added Successfully!");
}
public static void viewVolunteers(){

    if(volunteers.isEmpty()){
        System.out.println("No Volunteers Found");
        return;
    }

    for(Volunteer v : volunteers){
        v.display();
    }
}
public static void searchVolunteer(){

    System.out.print("Enter Volunteer ID: ");
    int id = sc.nextInt();

    for(Volunteer v : volunteers){

        if(v.id == id){
            v.display();
            return;
        }
    }

    System.out.println("Volunteer Not Found");
}
public static void deleteVolunteer(){

    System.out.print("Enter Volunteer ID: ");
    int id = sc.nextInt();

    for(Volunteer v : volunteers){

        if(v.id == id){
            volunteers.remove(v);
            System.out.println("Volunteer Deleted");
            return;
        }
    }

    System.out.println("Volunteer Not Found");
}
public static void generateReport()
 {

    System.out.println("\n===== REPORT =====");
    System.out.println("Total Volunteers: " + volunteers.size());

}

}