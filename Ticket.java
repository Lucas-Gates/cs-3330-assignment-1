public class Ticket {
    private int id;
    private Event event;
    private TicketType ticketType;
    private String studentName;
    private boolean canceled;
    private boolean admitted;

    public Ticket(int id, TicketType ticketType, Event event, String studentName) {
        // checks invariants
        if (id < 0) {
            throw new IllegalArgumentException("Ticket ID cannot be less than 0.");            
        }
        if (ticketType == null) {
            throw new IllegalArgumentException("Ticket Type cannot be null.");
        }
        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null.");
        }
        if (studentName == null || studentName.isBlank()) {
            throw new IllegalArgumentException("Student Name cannot be empty.");
        }

        this.id = id;
        this.event = event;
        this.ticketType = ticketType;
        this.studentName = studentName;

        // tickets start as active
        this.canceled = false;
        this.admitted = false;
    }

    public boolean admit() {
        if (!isActive()) {
            return false;
        } else if (admitted) {
            throw new IllegalArgumentException("Ticket cannot be admitted more than once.");
        }

        admitted = true;
        return true;
    }

    public boolean cancel() {
        if (!isActive()) {
            return false;
        } else if (canceled) {
            throw new IllegalArgumentException("Ticket cannot be canceled more than once.");
        }

        canceled = true;
        return true;
    }

    public boolean isActive() {
        return !canceled && !admitted;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public boolean isAdmitted() {
        return admitted;
    }

    // getters
    public int getId() {
        return id;
    }

    public Event getEvent() {
        return event;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public String getStudentName() {
        return studentName;
    }

    // string
    @Override
    public String toString() {
        String status;
        if (canceled) {
            status = "Canceled";
        } else if (admitted) {
            status = "Admitted";
        } else {
            status = "Active";
        }

        return "Ticket ID: " + this.id + "\nStudent: " + this.studentName
        + "\nEvent: " + this.event + "\nTicketType: " + this.ticketType
        + "\nStatus: " + status;
    }
}
