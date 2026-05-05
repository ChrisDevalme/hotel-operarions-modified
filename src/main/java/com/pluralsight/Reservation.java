package com.pluralsight;

public class Reservation {
    private String roomType;
    private double roomPrice;
    private int numOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;
        if(roomType.equalsIgnoreCase("king")) {
            this.roomPrice = 139;
        }
        if(roomType.equalsIgnoreCase("double")) {
            this.roomPrice = 124;
        }
    }

    public String getRoomType() { return roomType; }

    public void setRoomType(String roomType) { this.roomType = roomType; }

    public double getRoomPrice() { return roomPrice; }

    public int getNumOfNights() { return numOfNights; }

    public void setNumOfNights(int numOfNights) { this.numOfNights = numOfNights; }

    public boolean isWeekend() { return isWeekend; }

    public void setWeekend(boolean weekend) { this.isWeekend = weekend; }

    public double getReservationTotal() {
        double totalPrice = roomPrice * numOfNights;
        if(isWeekend) {
            totalPrice *= 1.1;
            // totalPrice = totalPrice * 1.1

        }
        return totalPrice;
    }
}
