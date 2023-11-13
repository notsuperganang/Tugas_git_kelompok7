import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Library} class represents a library that manages a collection of
 * items.
 * It provides functionalities to add items, borrow items, and display
 * information
 * about the items in the library.
 *
 * <p>
 * Items in the library are stored in a {@code List<Item>} collection.
 *
 * <p>
 * Example Usage:
 * 
 * <pre>
 * {@code
 * Library myLibrary = new Library();
 * Book book = new Book("Sample Book", 2023, "Sample Author", 200);
 * myLibrary.addItem(book);
 * myLibrary.borrowItem("Sample Book");
 * myLibrary.displayAllItems();
 * }
 * </pre>
 *
 * @author Kelompok 7
 *         - Ganang Setyo Hadi(2208107010052)
 *         - M.Khalid Al-Ghifari(2208107010044)
 * @version 14 November 2023
 */
class Library {
    /** The list of items in the library. */
    private List<Item> items;

    /**
     * Constructs a new {@code Library} with an empty list of items.
     */
    public Library() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds a pre-existing item to the library.
     *
     * @param item the item to be added
     */
    public void additempreset(Item item) {
        items.add(item);
    }

    /**
     * Adds an item to the library, checking for duplicate titles.
     *
     * @param item the item to be added
     */
    public void addItem(Item item) {
        String title = item.getTitle();

        // Check if an item with the same title already exists in the library
        if (isTitleExists(title)) {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("    Sorry, a book with the title " + title + " already exists in the library.");
            System.out.println("-----------------------------------------------------------");
        } else {
            items.add(item);
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("\t    " + title + " added to the library.");
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * Checks if an item with a given title already exists in the library.
     *
     * @param title the title to be checked
     * @return {@code true} if an item with the title exists, {@code false}
     *         otherwise
     */
    public boolean isTitleExists(String title) {
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Borrows an item with the given title, if available.
     *
     * @param title the title of the item to be borrowed
     */
    public void borrowItem(String title) {
        // Check if the title exists in the library's catalog
        boolean titleExists = false;
        for (Item item : items) {
            if (item.getTitle().equals(title)) {
                titleExists = true;
                break;
            }
        }

        if (!titleExists) {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("       Sorry, " + title + " is not in the library's catalog.");
            System.out.println("   To view the library catalog, please select option 7!.");
            System.out.println("-----------------------------------------------------------");
            return;
        }

        // Iterate to borrow the item
        for (Item item : items) {
            if (item.getTitle().equals(title) && item.isAvailable()) {
                item.setAvailable(false);
                System.out.println("\n-----------------------------------------------------------");
                System.out.println("            You have borrowed " + title + ".");
                System.out.println("-----------------------------------------------------------");
                return;
            }
        }

        // If the title exists but the item is not available
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("    Sorry, " + title + " is not available for borrowing.");
        System.out.println("-----------------------------------------------------------");
    }

    /**
     * Displays information about all items in the library.
     * If no items are present, a message indicating that no items have been added
     * is displayed.
     */
    public void displayAllItems() {
        if (items != null && !items.isEmpty()) {
            for (Item item : items) {
                item.displayInfo();
            }
        } else {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("              No items have been added yet!");
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * Displays information about items of a specific type in the library.
     * If no items of the specified type are present, a message indicating that
     * no items of that type have been added is displayed.
     *
     * @param itemType the type of items to display
     */
    public void displayAllItemsOfType(Class<? extends Item> itemType) {
        boolean found = false;

        for (Item item : items) {
            // Check if the object is of type itemType
            if (itemType.isInstance(item)) {
                item.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("        No items of type " + itemType.getSimpleName() + " have been added yet!");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
