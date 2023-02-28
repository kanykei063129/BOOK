public class Main {
    public static void main(String[] args) {
        Author author = new Author("Адам", "adamsilvera@gmail.com", 'M');
        Author author1 = new Author("Анна", "annadjein@gmail.com", 'F');
        Author author2 = new Author("Тологон", "tologonkasymbekov@gmail.com", 'M');
        Author[] authors = {author, author1, author2};
        for (Author a : authors) {
            System.out.println(a);

            Book book = new Book("В конце они оба умрут", author, 600, 100000);
            Book book1 = new Book("Поклонник", author1, 750, 50000);
            Book book2 = new Book("Сынган кылыч", author2, 1100, 90000);
            Book[] books = {book, book1, book2};
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
}