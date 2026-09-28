/* Instructions on Main, as given my the assingment details:
    Your Main must demonstrate functionality with hardcoded data.
    Minimum demo requirements:
        • Create at least 2 events
        • Create at least 2 ticket types
        • Create at least 5 tickets across different events and ticket types
        • Cancel at least 1 ticket
        • Admit at least 1 ticket
        • Demonstrate at least 1 invalid operation and show how your design handles it (for example,
            trying to admit a canceled ticket)
        • Print all tickets
        • Print tickets for one specific event

*/


public class Main {
    public static void main(String[] args) {
        // creating events first, accesses the event.java file
        // event parameters = string name, string location
        Event event1 = new Event("Guest speaker Lecture", "Room 106");
        Event event2 = new Event("AI workshop", "Room 107");


        // creating 2 ticket types, accessing tickettype.java file
        // parameters = string name, double price
        TicketType Students = new TicketType("Students" , 10.00 );
        TicketType General = new TicketType("General" , 20.00 );

        // initiallizing ticket book, making 10 slots
        TicketBook book = new TicketBook(10);

        //creating 5 tickets across different events and ticket types, using the ticketbook file for the createticket function
        // parameters for reference: createTicket(int id, Event event, TicketType type, String studentName) {
        Ticket ticket1  = book.createTicket(100, event1, Students, "jena");
        Ticket ticket2 = book.createTicket(101, event2, General, "fabby");
        Ticket ticket3 = book.createTicket(102, event1, General, "laila");
        Ticket ticket4 = book.createTicket(103 , event2, Students, "dilia");
        Ticket ticket5 = book.createTicket(104, event1, General, "lauren");

        //cancelling 1 ticket
        System.out.println("cancelling ticket 5: " + ticket5.cancel());

        //admitting tickets
        System.out.println("Admitted tickets: " + "\nTicket1:" +
                ticket1.admit()+ "\nTicket2:" + ticket2.admit() +
                "\nTicket3:" + ticket3.admit() + "\nTicket4:" + ticket4.admit());

        // admitting the cancelled ticket to see how program handles it
        System.out.println("admitting ticket 5: " + ticket5.admit());

        //printing all tickets, using function from the ticketbook file
        System.out.println("Printing all tickets:");
        book.printAll();

        //printing ticket for event1
        System.out.println("Printing all tickets for event 1:");
        book.printForEvent(event1);



    }
}