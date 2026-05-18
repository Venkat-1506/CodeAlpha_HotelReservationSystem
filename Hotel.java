import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    // Constructor
    public Hotel() {

        rooms = new ArrayList<>();
        reservations = new ArrayList<>();

        addDefaultRooms();
    }

    // Add Initial Rooms
    private void addDefaultRooms() {

        rooms.add(new Room(101, "Standard", 1500, 2, true, false));
        rooms.add(new Room(102, "Standard", 1800, 2, true, true));

        rooms.add(new Room(201, "Deluxe", 2500, 3, true, true));
        rooms.add(new Room(202, "Deluxe", 3000, 4, true, true));

        rooms.add(new Room(301, "Suite", 5000, 5, true, true));
    }

    // Display All Rooms
    public void displayAllRooms() {

        System.out.println("\n========== HOTEL ROOMS ==========");

        for (Room room : rooms) {

            room.displayRoomDetails();
        }
    }

    // Display Available Rooms
    public void displayAvailableRooms() {

        System.out.println("\n====== AVAILABLE ROOMS ======");

        boolean found = false;

        for (Room room : rooms) {

            if (room.isAvailable()) {

                room.displayRoomDetails();

                found = true;
            }
        }

        if (!found) {

            System.out.println("No rooms available.");
        }
    }

    // Search Room By Number
    public Room searchRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                return room;
            }
        }

        return null;
    }

    // Book Room
    public void bookRoom(int roomNumber,
                         String customerName,
                         String phoneNumber,
                         LocalDate checkIn,
                         LocalDate checkOut) {

        Room room = searchRoom(roomNumber);

        if (room == null) {

            System.out.println("Invalid room number.");
            return;
        }

        if (!room.isAvailable()) {

            System.out.println("Room already booked.");
            return;
        }

        room.bookRoom();

        Reservation reservation = new Reservation(
                customerName,
                phoneNumber,
                room,
                checkIn,
                checkOut
        );

        reservation.makePayment();

        reservations.add(reservation);

        System.out.println("\nReservation Successful!");

        reservation.displayReservationDetails();
    }

    // Cancel Reservation
    public void cancelReservation(String reservationId) {

        for (Reservation reservation : reservations) {

            if (reservation.getReservationId()
                    .equalsIgnoreCase(reservationId)) {

                reservation.cancelReservation();

                reservations.remove(reservation);

                System.out.println("Reservation removed.");

                return;
            }
        }

        System.out.println("Reservation ID not found.");
    }

    // Display All Reservations
    public void displayReservations() {

        if (reservations.isEmpty()) {

            System.out.println("\nNo reservations found.");

            return;
        }

        System.out.println("\n======= ALL RESERVATIONS =======");

        for (Reservation reservation : reservations) {

            reservation.displayReservationDetails();
        }
    }

    // Hotel Statistics
    public void showHotelStatistics() {

        int availableRooms = 0;
        int bookedRooms = 0;

        for (Room room : rooms) {

            if (room.isAvailable()) {
                availableRooms++;
            } else {
                bookedRooms++;
            }
        }

        System.out.println("\n========== HOTEL STATISTICS ==========");

        System.out.println("Total Rooms     : " + rooms.size());
        System.out.println("Available Rooms : " + availableRooms);
        System.out.println("Booked Rooms    : " + bookedRooms);

        System.out.println("Total Reservations : "
                + reservations.size());
    }
}