/**
 * The {@code Book} class represents a book item in a library.
 * It extends the {@code Item} class and includes additional information
 * such as the author and the number of pages.
 *
 * <p>
 * This class provides details about a specific book, including its title,
 * publication year, author, and the total number of pages. The availability
 * status for borrowing is determined by the superclass {@code Item}.
 *
 * <p>
 * The class includes a method to display information about the book.
 * The information displayed includes the book's title, author, publication
 * year,
 * the number of pages, and its availability status.
 *
 * <p>
 * Example Usage:
 * 
 * <pre>
 * {@code
 * Book myBook = new Book("The Catcher in the Rye", 1951, "J.D. Salinger", 224);
 * myBook.displayInfo();
 * }
 * </pre>
 *
 * @author Kelompok 7
 *         - Ganang Setyo Hadi(2208107010052)
 *         - M.Khalid Al-Ghifari(2208107010044)
 * @version 14 November 2023
 * @see Item
 */
public class Book extends Item {

    /** The author of the book. */
    private String author;

    /** The number of pages in the book. */
    private int pages;

    /**
     * Constructs a new {@code Book} with the specified title, publication year,
     * author, and number of pages.
     *
     * @param title  the title of the book
     * @param year   the publication year of the book
     * @param author the author of the book
     * @param pages  the number of pages in the book
     */
    public Book(String title, int year, String author, int pages) {
        super(title, year);
        this.author = author;
        this.pages = pages;
    }

    /**
     * Displays information about the book, including its title, author,
     * publication year, the number of pages, and its availability status for
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
        System.out.println("Book         : " + getTitle());
        System.out.println("Author       : " + author);
        System.out.println("Year         : " + getYear());
        System.out.println("Pages        : " + pages);
        System.out.println("Status       : " + status);
        System.out.println("===========================================================");
    }
}
