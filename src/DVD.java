/**
 * The {@code DVD} class represents a DVD item in a library.
 * It extends the {@code Item} class and includes additional information
 * such as the director and duration.
 *
 * <p>
 * This class provides details about a specific DVD, including its title,
 * publication year, director, and the duration. The availability
 * status for borrowing is determined by the superclass {@code Item}.
 *
 * <p>
 * The class includes a method to display information about the DVD.
 * The information displayed includes the DVD's title, director, publication
 * year, the duration, and its availability status.
 *
 * <p>
 * Example Usage:
 * 
 * <pre>
 * {@code
 * DVD myDVD = new DVD("Inception", 2010, "Christopher Nolan", 148);
 * myDVD.displayInfo();
 * }
 * </pre>
 *
 * @author Kelompok 7
 *         - Ganang Setyo Hadi(2208107010052)
 *         - M.Khalid Al-Ghifari(2208107010044)
 * @version 14 November 2023
 * @see Item
 */
public class DVD extends Item {

    /** The director of the DVD. */
    private String director;

    /** The duration of the DVD in minutes. */
    private int duration;

    /**
     * Constructs a new {@code DVD} with the specified title, publication year,
     * director, and duration.
     *
     * @param title    the title of the DVD
     * @param year     the publication year of the DVD
     * @param director the director of the DVD
     * @param duration the duration of the DVD in minutes
     */
    public DVD(String title, int year, String director, int duration) {
        super(title, year);
        this.director = director;
        this.duration = duration;
    }

    /**
     * Displays information about the DVD, including its title, director,
     * publication year, the duration, and its availability status for
     * borrowing.
     *
     * <p>
     * The status is determined by the availability status provided by the
     * superclass {@code Item}.
     */
    @Override
    public void displayInfo() {
        String status = isAvailable() ? "Available for borrowing" : "Not available for borrowing";
        System.out.println("\n===========================================================");
        System.out.println("DVD          : " + getTitle());
        System.out.println("Directed by  : " + director);
        System.out.println("Year         : " + getYear());
        System.out.println("Duration     : " + duration + " minutes");
        System.out.println("Status       : " + status);
        System.out.println("===========================================================");
    }
}
