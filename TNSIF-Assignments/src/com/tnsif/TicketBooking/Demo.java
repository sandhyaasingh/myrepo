package com.tnsif.TicketBooking;

import com.tnsif.TicketBooking.TicketBooking;

public class Demo {

    public static void main(String[] args) {
        TicketBooking person1 = new TicketBooking();
        TicketBooking person2 = new TicketBooking();
        TicketBooking person3 = new TicketBooking();
        TicketBooking person4 = new TicketBooking();
        TicketBooking person5 = new TicketBooking();

        TicketBooking.displayTickets();

        person1.bookTicket();
        person2.bookTicket();
        person3.bookTicket();
        person4.bookTicket();
        person5.bookTicket();

        TicketBooking.displayTickets();
    }
}
