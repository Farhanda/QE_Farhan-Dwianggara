import java.util.Scanner;
public class Main
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Luas Bangun Datar");
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Luas Persegi Panjang");
        System.out.println("3. Luas Lingkaran");
        System.out.print("Pilih bangun datar (1/2/3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga: " + luasSegitiga);
                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();
                double luasPersegiPanjang = panjang * lebar;
                System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
                System.out.println("Luas Lingkaran: " + luasLingkaran);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}