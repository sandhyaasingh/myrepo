package com.tnsif.ticketbooking;

public class TicketBooking {

    private static int tickets = 5;

    public static void displayTickets() {
        System.out.println("Total tickets available: " + tickets);
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
}
