import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int numRows = scanner.nextInt();
        
        for (int i = 1; i <= numRows; i++) {
            for (int j = numRows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
