import java.util.Scanner;
public class Main
{
    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                char encryptedChar = (char) (((character - base + shift) % 26) + base);
                encryptedText.append(encryptedChar);
            } else {
                // Jika karakter bukan huruf, tambahkan langsung ke hasil enkripsi
                encryptedText.append(character);
            }
        }

        return encryptedText.toString();
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        int shift = 10; // Pergeseran 10 urutan alphabet

        // Panggil metode enkripsi dan cetak hasilnya
        String encryptedText = encrypt(inputText, shift);
        System.out.println("Hasil enkripsi: " + encryptedText);
        scanner.close();
    }
}