import java.util.Scanner;

public class SoalMudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TebakBilangan;

        //Buat sout untuk memasukkan angka yang mau ditebak
        System.out.println("Masukkan Tebak Angka : ");
        TebakBilangan = input.nextInt();

            //Rumus untuk membedakan angka genap dan ganjil
            if (TebakBilangan % 2 == 0) {
                System.out.println(TebakBilangan + " Adalah Bilangan Genap");

            } else {
            System.out.println(TebakBilangan + " Adalah Bilangan Ganjil");

        }

    input.close();
    }
}
