package BKPM3;
import java.util.Scanner;
//ell
public class Praktik_B {
    public static void main(String[] args) {
        // variabel scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        //input
        System.out.println("Input Nilai:");
        nilai = scan.nextInt();
        //menentukan grade
        if (nilai >= 90){
            grade = "A";
        }else if (nilai >= 80){
            grade = "B+";
        }else if (nilai >= 70){
            grade = "B";
        }else if (nilai >= 60){
            grade = "C+";
        }else if (nilai >= 50){
            grade = "C";
        }else if (nilai >= 40){
           grade = "D";
        }else{
            grade = "E";
        }
        System.out.println("Grade:" +" "+grade);
    }
    
}
