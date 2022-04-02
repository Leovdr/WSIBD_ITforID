package BKPM3;
import java.util.Scanner;
public class Praktik_B2 {
public static void main(String[] args) {
       
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inputkan warna");
        lampu = scan.nextLine();
        
        switch(lampu){
            case "merah":
                System.out.println("Lampu merah berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning bersiap");
                break;
            case "hijau":
                System.out.println("Lampu hijau jalan");
                break;
            default:
                System.out.println("warna lampu salah");
        }
    }
}