package com.tnsif.ticketbooking;

public class TicketBooking {

    private static int tickets = 10;

    static {
        System.out.println("Static block in TicketBooking");
        tickets = 10;
    }

    public TicketBooking() {
        System.out.println("Default constructor in TicketBooking");
    }

    public void bookTicket() {
        if (tickets > 0) {
            tickets--;
            System.out.println("Ticket booked successfully!");
            System.out.println("Tickets left: " + tickets);
        } else {
            System.out.println("No tickets available for booking.");
        }
    }

    public static void displayTickets() {
        System.out.println("Total tickets available: " + tickets);
    }

    @Override
    public String toString() {
        return "TicketBooking [tickets=" + tickets + "]";
    }
}
