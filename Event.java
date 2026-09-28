/* instructions for the Event.java file given by the assignment:
    Represents one campus event.
    Required data:
        • String name (example: "Cybersecurity Guest Lecture")
        • String location (example: "Engineering Building")
            Required invariants:
        • name is not null or blank
        • location is not null or blank
            Required behavior:
        • Constructor enforces invariants (fail fast)
        • Getters as needed (use intentionally)
        • A toString() that prints a meaningful description, for example: Cybersecurity Guest
            Lecture @ Engineering Building
            Design note: Consider making Event immutable.

*/

// making class final so it is immutable
public final class Event {
    //initializing variables, adding final to make it immutable, private
    private final String name;
    private final String location;

    // adding constructor
    public Event(String name, String location){
        //ensuring name and location is not left blank/null, using llegalArgumentException
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (location == null || location.isBlank()){
            throw new IllegalArgumentException("Location cannot be null or empty");
        }
        this.name = name;
        this.location = location;
    }

    // getters
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }

    //  A toString() that prints a meaningful description, for example: Cybersecurity Guest
    //            Lecture @ Engineering Building
    public String toString(){
        return this.name + " @ " + this.location;
    }

}