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
public final class Event(){
    //initializing variables, adding final to make it immutable
    final String name;
    final String location;
    //ensuring name is not left blank/null, using llegalArgumentException
    if (name == null || name.isEmpty()){
        throw new IllegalArgumentException("Name cannot be null or empty");
    }

}