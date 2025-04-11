import java.util.ArrayList;
class Booking {
    String date, startTime, endTime, name;
    public Booking(String date, String startTime, String endTime, String name) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
    }
}

public class ConferenceRoomBooking {
    static ArrayList<Booking> bookings = new ArrayList<>();
    public static boolean isAvailable(String date, String startTime, String endTime) {
        for (Booking b : bookings) {
            if (b.date.equals(date) && b.startTime.equals(startTime) && b.endTime.equals(endTime)) {
                return false;
            }
        }
        return true;
    }
    public static void bookRoom(String date, String startTime, String endTime, String name) {
        if (isAvailable(date, startTime, endTime)) {
            bookings.add(new Booking(date, startTime, endTime, name));
            System.out.println("Room booked successfully for " + name);
        } else {
            System.out.println("Room is already booked for the given slot.");
        }
    }
    public static void main(String[] args) {
        bookRoom("2025-02-05", "10:00 AM", "11:00 AM", "Alice");
        bookRoom("2025-02-05", "10:00 AM", "11:00 AM", "Bob");
        bookRoom("2025-02-05", "11:00 AM", "12:00 PM", "Charlie");
    }
}
