import java.awt.print.Book;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
        Room room;
        static String user;
        String date;
        String time;
        int numberOfPeople;



        public Booking(Room room, String date, String time, String user,int people){
            this.room = room;
            this.numberOfPeople = people;
            this.date = date;
            this.time=time;
            this.user = user;
        }

        public String toString(){
            return "Room: "+ room.getRoomName() + "BookedBy: "+ user +", On: " + date + ",at: " + time ;
        }
        public void addBooking(){
        ArrayList<Book> bookings = new ArrayList<Book>();

        try{
            bookings.add(new Book());
            System.out.println("Room Booked");
            System.out.println(bookings);

        } catch (Exception e) {
                System.err.println("Error!" +
                        e.getMessage());
            }
        }

        /*public static void  makeBooking() {
            System.out.println("Enter your name: ");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            User.inputSize();
            User.inputDate();
            User.inputTime();

            if()
    }*/



    public static void viewUserBookings(){
        ArrayList<String> bookings = new ArrayList<String>();
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean userBooking = false;
        try {
            while (bookings != null)
                if(bookings.contains(user)){
                userBooking = true;
                System.out.print("User bookings are: " + bookings);
            }


        }catch (Exception e){
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }
        if (!userBooking) {
            System.out.println("You don't have any bookings!");
        }
    }
}

