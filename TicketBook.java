public class TicketBook {
    private Ticket[] tickets;
    private int count;

    public TicketBook(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }
        tickets = new Ticket[capacity];
        count = 0; //the book starts empty
    }

    public Ticket createTicket(int id, Event event, TicketType type, String studentName) {
        //creates and stores a new Ticket
        if (count >= tickets.length) {
            throw new IllegalStateException("Ticket book is full.");
        }
        if (findById(id) != null) {
            throw new IllegalArgumentException("Ticket ID already exists.");
        }
        Ticket ticket = new Ticket(id, type, event, studentName);
        tickets[count] = ticket;
        count++;
        return ticket;
    }

    public Ticket findById(int id) {
        //searches the array for a matching ticket id
        for (int i = 0; i < count; i++) {
            if (tickets[i].getId() == id) {
                return tickets[i];
            }
        }
        return null;
    }

    public void printAll() {
        //prints every ticket currently stored
        for (int i = 0; i < count; i++) {
            System.out.println(tickets[i]);
            System.out.println();
        }
    }

    public void printForEvent(Event event) {
        //uses reference comparison because equals() is not being used
        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null.");
        }
        for (int i = 0; i < count; i++) {
            if (tickets[i].getEvent() == event) {
                System.out.println(tickets[i]);
                System.out.println();
            }
        }
    }
}