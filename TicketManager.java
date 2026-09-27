public class TicketManager {
    private TicketBook ticketBook;
    private int nextId;

    public TicketManager(TicketBook ticketBook) {
        //makes sure the manager has a valid TicketBook
        if (ticketBook == null) {
            throw new IllegalArgumentException("Ticket book cannot be null.");
        }
        this.ticketBook = ticketBook;
        nextId = 1;
    }

    public Ticket createTicket(Event event, TicketType type, String studentName) {
        //creates a ticket and gives it the next available id
        Ticket ticket = ticketBook.createTicket(nextId, event, type, studentName);
        nextId++;
        return ticket;
    }

    public boolean cancelTicket(int id) {
        //finds the ticket and lets Ticket handle cancellation
        Ticket ticket = ticketBook.findById(id);
        if (ticket == null) {
            return false;
        }
        return ticket.cancel();
    }

    public boolean admitTicket(int id) {
        //finds the ticket and lets Ticket handle admission
        Ticket ticket = ticketBook.findById(id);
        if (ticket == null) {
            return false;
        }
        return ticket.admit();
    }

    public void printAll() {
        //asks TicketBook to print all tickets
        ticketBook.printAll();
    }

    public void printForEvent(Event event) {
        //asks TicketBook to print tickets for an event
        ticketBook.printForEvent(event);
    }
}