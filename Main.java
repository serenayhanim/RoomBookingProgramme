import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome the Room Booking Service!To view all the rooms please type view");
        String room = sc.nextLine();
        Room.roomList();
        System.out.println("\nEnter: \"New\" to make a new booking.\"View\" to view your bookings. \"Exit\" to exit the program! ");
        String selection = sc.nextLine().toLowerCase();
        switch (selection) {
            case "new":
                ;
                break;
            case "view":
                Booking.viewUserBookings();
                break;
            case "exit":
                System.out.println("Thank you for using our booking system!");
                break;

        }

    }
}






