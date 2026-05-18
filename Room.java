import java.io.Serializable;

public class Room implements Serializable {

    private int roomNumber;
    private String category;
    private double pricePerNight;
    private boolean isAvailable;
    private int maxCapacity;
    private boolean wifi;
    private boolean ac;

    // Constructor
    public Room(int roomNumber, String category, double pricePerNight,
                int maxCapacity, boolean wifi, boolean ac) {

        this.roomNumber = roomNumber;
        this.category = category;
        this.pricePerNight = pricePerNight;
        this.maxCapacity = maxCapacity;
        this.wifi = wifi;
        this.ac = ac;
        this.isAvailable = true;
    }

    // Getter Methods
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCategory() {
        return category;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public boolean hasWifi() {
        return wifi;
    }

    public boolean hasAC() {
        return ac;
    }

    // Setter Method
    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }

    // Display Room Information
    public void displayRoomDetails() {

        System.out.println("\n======================================");
        System.out.println("           ROOM DETAILS");
        System.out.println("======================================");

        System.out.println("Room Number      : " + roomNumber);
        System.out.println("Room Category    : " + category);
        System.out.println("Price Per Night  : ₹" + pricePerNight);
        System.out.println("Maximum Capacity : " + maxCapacity + " Persons");

        System.out.println("WiFi Facility    : " + (wifi ? "Available" : "Not Available"));
        System.out.println("AC Facility      : " + (ac ? "Available" : "Not Available"));

        System.out.println("Room Status      : "
                + (isAvailable ? "Available" : "Booked"));

        System.out.println("======================================");
    }

    // Book Room
    public void bookRoom() {

        if (isAvailable) {
            isAvailable = false;
            System.out.println("Room " + roomNumber + " booked successfully.");
        } else {
            System.out.println("Room already booked.");
        }
    }

    // Cancel Booking
    public void cancelBooking() {

        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Booking cancelled successfully.");
        } else {
            System.out.println("Room is already available.");
        }
    }

    // Generate Room Summary
    public String getRoomSummary() {

        return roomNumber + " | "
                + category + " | ₹"
                + pricePerNight + " | "
                + (isAvailable ? "Available" : "Booked");
    }
}