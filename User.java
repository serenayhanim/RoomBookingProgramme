
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class User {
    private String userName;
    private LocalDate bookingDate;
    private LocalTime bookingTime;
    private int numberOfPeople;


    public User(String name) {
        this.userName = userName;
    }


    public static void inputDate() {
          int day;
          int month;
          int year;
          LocalDate today = LocalDate.now();

          while (true) {
           Scanner sc = new Scanner(System.in);

              System.out.println("day: ");
              day =sc.nextInt();
              if(day<31 && day > 0 ) {
                  break;
              }
              System.out.println("month: ");
              month=sc.nextInt();
              if (month<13 && month >0) {
                  break;
              }
              System.out.println("year: ");
              year = sc.nextInt();
              if (year>=2019) {
                  break;
              }

           }

            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String strDate = formatter.format(date);
            System.out.println("Date Format with dd/MM/yyyy : " + strDate);

        }



    public static void inputTime() {
        Scanner t = new Scanner(System.in);
        System.out.println("Time: ");
        int hour = t.nextInt();
        while (true) {
            if (hour < 24 && hour > 0) {
                break;
            }
                System.out.println("Please enter valid time.");
            }
        }


    public static void inputSize() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of people: ");
        int size = s.nextInt();
        while(true) {
            if(size>0 && size <71) {
                break;
            }
                System.out.println("Please enter valid number");
            }
        }


    }
