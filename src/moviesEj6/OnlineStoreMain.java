package moviesEj6;

public class OnlineStoreMain {
    public static void main(String[] args) {
        OnlineStoreDAO Store = new OnlineStoreDAO();

        Book book = new Book("The perks of being a Wallflower", "Stephen Chbosky", 19.99f);
        Book book1 = new Book("Dune", "Frank Herbert", 24.99f);
        Book book2 = new Book("The Martian Chronicles", "Ray Bradbury", 14.99f);

        Movie movie = new Movie("La La Land", "Emma Stone","Damien Chazelle", 9.99f);
        Movie movie2 = new Movie("Prisoners", "Hugh Jackman","Deni Villeneuve", 9.99f);
        Movie movie3 = new Movie("Interstellar", "Matthew McConaughey","Christopher Nolan", 9.99f);

        Store.addItem(book);
        Store.addItem(book1);
        Store.addItem(book2);
        Store.addItem(movie);
        Store.addItem(movie2);
        Store.addItem(movie3);

        System.out.println("Initial Inventory: ");
        Store.displayInventory();

        Store.recordSale(book1);
        Store.recordSale(movie);

        System.out.println("Inventory after sales: ");
        Store.displayInventory();
        Store.displayTotalSales();
    }
}
