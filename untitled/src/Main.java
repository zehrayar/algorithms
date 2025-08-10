public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        bookList.addBook(new Book(1, "The Picture Of Dorian Gray", "Oscar Wilde"));
        bookList.addBook(new Book(2, "Throne of Glass", "Sarah J. Mass"));
        bookList.addBook(new Book(3, "The Alchemist", "Paulo Coelho"));
        bookList.addBook(new Book(4, "Salem's Lot", "Stephen King"));
        bookList.addBook(new Book(5, "The Housemaid Is Watching", "Freida McFadden"));

        bookList.removeBook(5);

        int searchId = 3; // Example search ID
        boolean found = false;
        for (Book book : bookList) {
            if (book.id == searchId) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book could not found.");
        }

        System.out.println("\nFinal Book List:");
        for (Book book : bookList) System.out.println(book);
    }

}
