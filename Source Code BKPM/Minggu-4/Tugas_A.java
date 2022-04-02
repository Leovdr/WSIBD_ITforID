package bkpm4;
import java.util.Scanner;
public class Tugas_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kecil;
        int besar;
        System.out.println("Menampilkan Bilangan Genap Dari Kecil ke Besar");
        System.out.print("Masukkan Bilangan Awal = ");
        kecil=in.nextInt();
        System.out.print("Masukkan Bilangan Akhir = ");
        besar=in.nextInt();
        System.out.println("=========================");

        for (int i = kecil; i<=besar; i++){
            if(i%2==0)
                System.out.print(" "+ i);
        } 
        System.out.println(" ");
    }
}
