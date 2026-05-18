import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Reservation implements Serializable {

    private String reservationId;
    private String customerName;
    private String phoneNumber;

    private Room room;

    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    private long numberOfDays;
    private double totalAmount;

    private boolean paymentStatus;

    // Constructor
    public Reservation(String customerName,
                       String phoneNumber,
                       Room room,
                       LocalDate checkInDate,
                       LocalDate checkOutDate) {

        this.reservationId = generateReservationId();
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;

        this.numberOfDays = ChronoUnit.DAYS.between(checkInDate, checkOutDate);

        this.totalAmount = numberOfDays * room.getPricePerNight();

        this.paymentStatus = false;
    }

    // Generate Random Reservation ID
    private String generateReservationId() {

        Random random = new Random();

        int number = random.nextInt(9000) + 1000;

        return "RES" + number;
    }

    // Payment Processing
    public void makePayment() {

        paymentStatus = true;

        System.out.println("\nPayment Successful!");
        System.out.println("Amount Paid : ₹" + totalAmount);
    }

    // Cancel Reservation
    public void cancelReservation() {

        room.cancelBooking();

        System.out.println("\nReservation Cancelled Successfully.");
    }

    // Display Reservation Details
    public void displayReservationDetails() {

        System.out.println("\n=========================================");
        System.out.println("         RESERVATION DETAILS");
        System.out.println("=========================================");

        System.out.println("Reservation ID : " + reservationId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Phone Number   : " + phoneNumber);

        System.out.println("-----------------------------------------");

        room.displayRoomDetails();

        System.out.println("-----------------------------------------");

        System.out.println("Check-In Date  : " + checkInDate);
        System.out.println("Check-Out Date : " + checkOutDate);

        System.out.println("Total Days     : " + numberOfDays);

        System.out.println("Total Amount   : ₹" + totalAmount);

        System.out.println("Payment Status : "
                + (paymentStatus ? "Paid" : "Pending"));

        System.out.println("=========================================");
    }

    // Getters
    public String getReservationId() {
        return reservationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Room getRoom() {
        return room;
    }

    public boolean isPaymentDone() {
        return paymentStatus;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}