public class Calculator {
    
    // Fungsi penjumlahan
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Fungsi pengurangan
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    // Fungsi perkalian
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    // Fungsi pembagian
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Tidak bisa melakukan pembagian oleh nol.");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        // Input angka dan panggil fungsi-fungsi kalkulator
        int num1 = 3;
        int num2 = 4;
        
        int additionResult = add(num1, num2);
        int subtractionResult = subtract(15, 4);
        int multiplicationResult = multiply(10, 10);
        int divisionResult = divide(12, 3);
        
        // Menampilkan hasil operasi
        System.out.println("Penjumlahan: " + additionResult);
        System.out.println("Pengurangan: " + subtractionResult);
        System.out.println("Perkalian: " + multiplicationResult);
        System.out.println("Pembagian: " + divisionResult);
    }
}
