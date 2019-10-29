import java.util.ArrayList;

public class Room {

        private String roomName;
        private String type ;
        private int floor;
        private int capacity;


        public Room(String roomName,String type,int floor, int capacity){
            this.roomName = roomName;
            this.type = type;
            this.floor = floor;
            this.capacity = capacity;
        }


        public String viewRoom(){
            return "[Room: "+ roomName + ", Description: " + type +", Floor: "+ floor + ", Capacity: " + capacity+ ", People]";
        }

        public int getCapacity(){
            return capacity;
        }

        public String getRoomName (){
            return roomName;
        }

        public String getType() { return  type;}

        public static void roomList() {

            Room[] rooms = new Room[9];
            rooms[0] = new Room("Taff", "small meeting room", 2, 8);
            rooms[1] = new Room("Liangorse", "large meeting room", 2, 24);
            rooms[2] = new Room("Pen y Fan ", "teaching space", 2, 70);
            rooms[3] = new Room("Usk", "small meeting room", 3, 8);
            rooms[4] = new Room("Bala", "large meeting room", 3, 24);
            rooms[5] = new Room("Cadair Idris", "teaching space", 3, 70);
            rooms[6] = new Room("Wye", "small meeting room", 4, 8);
            rooms[7] = new Room("Gower", "open meeting/break-out space", 4, 24);
            rooms[8] = new Room("Snowdon", "teaching space", 4, 70);

            for (Room room : rooms) {
                System.out.println(room.viewRoom());
            }
            System.out.println("\n");
        }

    ArrayList<String> bookings = new ArrayList<String>();
    public boolean getRoomStatus(String date, String time){
        boolean available = true;
        try {


            while (bookings != null)

                if (bookings.equals(roomName) && bookings.equals(date) && bookings.equals(time)) {
                    available = false;
                }

        } catch (Exception e){
            System.err.println("Error" + e.getMessage());
        }
        return available;
    }

}

