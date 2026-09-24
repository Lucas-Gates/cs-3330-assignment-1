public final class TicketType {
    // immutable TicketType variables
    private final String name;
    private final double price;

    public TicketType(String name, double price) {
        // checks for invariants
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name should not be empty.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price shouldn't be less 0.");
        }

        // sets values now that weve checked invariants
        this.name = name;
        this.price = price;
    }

    // takes over the print and puts this
    @Override
    public String toString() {
        return name + "\nTicket Price: " + price;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}