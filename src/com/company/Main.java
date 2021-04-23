package com.company;

public class Main {
    public static void main(String[] args) {

        Ticket regularTicket = new RegularTicket("12345", "Himachal Pradesh",
                "Madhya Pradesh", "DepartureDateTime", "ArrivalDateTime",
                "12C", 8000, false, null, null, "lunch");

        Ticket touristTicket = new TouristTicket("67890", "India", "Japan",
                "DepartureDateTime", "ArrivalDateTIme",
                "14F", 200000, true, null, null,
                "Hayaku", new String[]{"Fujikima", "Ichiraaku"});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}
