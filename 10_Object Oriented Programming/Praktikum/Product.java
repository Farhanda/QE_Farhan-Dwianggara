public class Product {
    private String name;
    private String description;
    private double price;
    private int stock;

    // Constructor untuk membuat objek produk dengan data awal
    public Product(String name, String description, double price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    // Getter dan setter (gunakan nama yang deskriptif)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Method getInfo() untuk menampilkan informasi produk
    public void displayProductInfo() {
        System.out.println("Nama Produk: " + name);
        System.out.println("Deskripsi: " + description);
        System.out.println("Harga: $" + price);
        System.out.println("Jumlah Stok: " + stock + " buah");
    }

    public static void main(String[] args) {
        // Membuat objek produk dengan data awal
        Product product1 = new Product("Laptop", "Laptop dengan prosesor Intel Core i7", 999.99, 10);

        // Menampilkan informasi produk menggunakan method displayProductInfo()
        product1.displayProductInfo();
    }
}
