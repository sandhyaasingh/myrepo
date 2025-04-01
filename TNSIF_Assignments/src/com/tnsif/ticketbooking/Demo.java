package com.tnsif.ticketbooking;

public class Demo {

    public static void main(String[] args) {
        TicketBooking ob = new TicketBooking();
        TicketBooking.displayTickets();
        ob.bookTicket();
        TicketBooking ob2 = new TicketBooking();
        ob2.bookTicket();
        TicketBooking.displayTickets();
        System.out.println(ob);
    }
}
