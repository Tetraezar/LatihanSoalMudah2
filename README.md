import java.util.Scanner;

public class SoalMudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      <------ Buat Scanner untuk input
        int TebakBilangan;                           <------ Variabel yang akan diperlukan

        //Buat sout untuk memasukkan angka yang mau ditebak              <-------- Buat sout diikuti dengan scanner untuk memsukkan angka yang akan ditebak
        System.out.println("Masukkan Tebak Angka : ");
        TebakBilangan = input.nextInt();

            //Rumus untuk membedakan angka genap dan ganjil                <--------- Cara untuk membedakan Ganjil Genap adalah dengan modulus. Yakni jika angka habis dibagi 2 maka angka = Genap
            if (TebakBilangan % 2 == 0) {                                                                                                       Tapi jika angka dibagi dengan 2 dan masih ada sisa maka angka tersebut ganjil
                System.out.println(TebakBilangan + " Adalah Bilangan Genap");

            } else {
            System.out.println(TebakBilangan + " Adalah Bilangan Ganjil");       <-------- Di dalam if else langsung letakkan sout biar langsung tertampil outputnya

        }

    input.close();            <------- Jika anda memasukkan angka 5 pada tebak angka maka hasil akhirnya adalah : 5 Adalah Bilangan Ganjil
    }                                  Jika anda memasukkan angka 4 pada tebak angka maka hasil akhirnya adalah : 4 Adalah Bilangan Genap
}
<img width="1920" height="1200" alt="Screenshot 2025-11-03 113811" src="https://github.com/user-attachments/assets/f538c727-8547-4f2e-bc3f-3b5563dc057c" /> SS Output
