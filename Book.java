public class Book {
    private String title;
    private String author;
    private double price;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage / 100);
        }
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Object-Oriented Programming");
        b.setAuthor("Tamanna Islam");
        b.setPrice(500);
        b.applyDiscount(10);

        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price after discount: " + b.getPrice());
    }
}