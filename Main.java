import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Hotel hotel = new Hotel();

        boolean running = true;

        System.out.println("======================================");
        System.out.println("     WELCOME TO HOTEL SYSTEM");
        System.out.println("======================================");

        while (running) {

            System.out.println("\n========= MAIN MENU =========");

            System.out.println("1. View All Rooms");
            System.out.println("2. View Available Rooms");
            System.out.println("3. Book Room");
            System.out.println("4. Cancel Reservation");
            System.out.println("5. View Reservations");
            System.out.println("6. Hotel Statistics");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    hotel.displayAllRooms();

                    break;

                case 2:

                    hotel.displayAvailableRooms();

                    break;

                case 3:

                    System.out.println("\n====== ROOM BOOKING ======");

                    System.out.print("Enter Customer Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter Room Number: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Check-In Date (YYYY-MM-DD): ");
                    String checkInInput = scanner.nextLine();

                    System.out.print("Enter Check-Out Date (YYYY-MM-DD): ");
                    String checkOutInput = scanner.nextLine();

                    LocalDate checkInDate =
                            LocalDate.parse(checkInInput);

                    LocalDate checkOutDate =
                            LocalDate.parse(checkOutInput);

                    hotel.bookRoom(
                            roomNumber,
                            name,
                            phone,
                            checkInDate,
                            checkOutDate
                    );

                    break;

                case 4:

                    System.out.println("\n====== CANCEL RESERVATION ======");

                    System.out.print("Enter Reservation ID: ");

                    String reservationId = scanner.nextLine();

                    hotel.cancelReservation(reservationId);

                    break;

                case 5:

                    hotel.displayReservations();

                    break;

                case 6:

                    hotel.showHotelStatistics();

                    break;

                case 7:

                    running = false;

                    System.out.println("\nThank You For Using Hotel System!");

                    break;

                default:

                    System.out.println("Invalid Choice.");
            }
        }

        scanner.close();
    }
}