/**
 * The {@code Item} class represents a generic item in a library.
 * It serves as the base class for specific types of items, such as books or
 * DVDs.
 *
 * <p>
 * Instances of this class include information about the title, publication
 * year,
 * and availability status of the item. Specific details and display behavior
 * are
 * implemented by subclasses.
 *
 * <p>
 * Example Usage:
 * 
 * <pre>
 * {@code
 * Item myItem = new Book("Sample Book", 2023, "Sample Author", 200);
 * myItem.displayInfo();
 * }
 * </pre>
 *
 * <p>
 * The class provides methods to retrieve information such as title, publication
 * year,
 * availability status, and to set the availability status. Subclasses must
 * implement
 * the {@code displayInfo} method to provide specific details about the item.
 *
 * @author Kelompok 7
 *         - Ganang Setyo Hadi(2208107010052)
 *         - M.Khalid Al-Ghifari(2208107010044)
 * @version 14 November 2023
 */
public abstract class Item {

    /** The title of the item. */
    private String title;

    /** The publication year of the item. */
    private int year;

    /** The availability status of the item for borrowing. */
    private boolean available;

    /**
     * Constructs a new {@code Item} with the specified title and publication year.
     *
     * @param title the title of the item
     * @param year  the publication year of the item
     */
    public Item(String title, int year) {
        this.title = title;
        this.year = year;
        this.available = true;
    }

    /**
     * Gets the title of the item.
     *
     * @return the title of the item
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the publication year of the item.
     *
     * @return the publication year of the item
     */
    public int getYear() {
        return year;
    }

    /**
     * Checks if the item is available for borrowing.
     *
     * @return {@code true} if the item is available, {@code false} otherwise
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the availability status of the item.
     *
     * @param available the availability status of the item
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Displays information about the item.
     * Subclasses must implement this method to provide specific details.
     */
    public abstract void displayInfo();
}
