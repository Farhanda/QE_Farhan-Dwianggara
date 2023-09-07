import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

class Book {
    private UUID id;
    private String title;
    private String author;
    private String category;

    public Book(String title, String author, String category) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nAuthor: " + author + "\nCategory: " + category;
    }
}

public class BookManagementSystem {
    private static List<Book> bookList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = getUserChoice();
            handleUserChoice(choice);
        }
    }

    private static void printMenu() {
        System.out.println("Menu Program:");
        System.out.println("1. Membuat data baru.");
        System.out.println("2. Mendapatkan semua data buku.");
        System.out.println("3. Mendapatkan data buku berdasarkan ID.");
        System.out.println("4. Mengubah data buku berdasarkan ID.");
        System.out.println("5. Menghapus data buku berdasarkan ID.");
        System.out.println("6. Keluar dari program.");
        System.out.print("Pilih menu (1-6): ");
    }

    private static int getUserChoice() {
        return scanner.nextInt();
    }

    private static void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                createBook();
                break;
            case 2:
                getAllBooks();
                break;
            case 3:
                getBookById();
                break;
            case 4:
                updateBook();
                break;
            case 5:
                deleteBook();
                break;
            case 6:
                exitProgram();
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
        }
    }

    private static void createBook() {
        scanner.nextLine();
        System.out.print("Masukkan judul buku: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan penulis buku: ");
        String author = scanner.nextLine();
        System.out.print("Masukkan kategori buku: ");
        String category = scanner.nextLine();

        Book newBook = new Book(title, author, category);
        bookList.add(newBook);
        System.out.println("Buku baru berhasil ditambahkan dengan ID: " + newBook.getId());
    }

    private static void getAllBooks() {
        System.out.println("Daftar semua buku:");
        for (Book book : bookList) {
            System.out.println(book);
            System.out.println("------------");
        }
    }

    private static void getBookById() {
        scanner.nextLine();
        System.out.print("Masukkan ID buku yang ingin ditemukan: ");
        String idString = scanner.nextLine();
        try {
            UUID id = UUID.fromString(idString);
            for (Book book : bookList) {
                if (book.getId().equals(id)) {
                    System.out.println("Buku ditemukan:");
                    System.out.println(book);
                    return;
                }
            }
            System.out.println("Buku dengan ID " + id + " tidak ditemukan.");
        } catch (IllegalArgumentException e) {
            System.out.println("ID buku tidak valid. Masukkan ID buku yang benar.");
        }
    }

    private static void updateBook() {
        scanner.nextLine();
        System.out.print("Masukkan ID buku yang ingin diubah: ");
        String idString = scanner.nextLine();
        try {
            UUID id = UUID.fromString(idString);
            for (Book book : bookList) {
                if (book.getId().equals(id)) {
                    System.out.print("Masukkan judul baru: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Masukkan penulis baru: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Masukkan kategori baru: ");
                    String newCategory = scanner.nextLine();

                    book.setTitle(newTitle);
                    book.setAuthor(newAuthor);
                    book.setCategory(newCategory);
                    System.out.println("Data buku berhasil diubah.");
                    return;
                }
            }
            System.out.println("Buku dengan ID " + id + " tidak ditemukan.");
        } catch (IllegalArgumentException e) {
            System.out.println("ID buku tidak valid. Masukkan ID buku yang benar.");
        }
    }

    private static void deleteBook() {
        scanner.nextLine();
        System.out.print("Masukkan ID buku yang ingin dihapus: ");
        String idString = scanner.nextLine();
        try {
            UUID id = UUID.fromString(idString);
            for (Book book : bookList) {
                if (book.getId().equals(id)) {
                    bookList.remove(book);
                    System.out.println("Buku dengan ID " + id + " berhasil dihapus.");
                    return;
                }
            }
            System.out.println("Buku dengan ID " + id + " tidak ditemukan.");
        } catch (IllegalArgumentException e) {
            System.out.println("ID buku tidak valid. Masukkan ID buku yang benar.");
        }
    }

    private static void exitProgram() {
        System.out.println("Keluar dari program.");
        scanner.close();
        System.exit(0);
    }
}
