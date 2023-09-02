import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int numRows = scanner.nextInt();
        
        drawXYZ(numRows);
        scanner.close();
    }

    public static void drawXYZ(int height) {
        int counter = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (counter % 3 == 0) {
                    System.out.print("X ");
                } else if (counter % 2 == 1) {
                    System.out.print("Y ");
                } else {
                    System.out.print("Z ");
                }
                counter++;
            }
            System.out.println();
        }
    }
}