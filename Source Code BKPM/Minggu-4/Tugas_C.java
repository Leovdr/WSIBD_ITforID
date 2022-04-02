package bkpm4;
import java.util.Scanner;
public class Tugas_C {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
              int input = 0,jml_bil = 0, min = 0, max = 0;
              double rata = 0, total_rata = 0;
              System.out.print("Masukkan banyaknya data nilai = ");
              jml_bil = s.nextInt();
              System.out.print("Masukkan data nilai ke-1 = ");
              input = s.nextInt();
              min = input;
              rata = input;

              for(int i = 2; i <= jml_bil; i++)
              {
                   System.out.print("Masukkan data nilai ke-"+i+" = ");
                   input = s.nextInt();
                   rata += input;

                           if(input < min)
                                  {
                                         min = input;
                                  }
                           else if (input > max)
                                  {
                                         max = input;
                                  }
              }
              total_rata = rata/jml_bil;
              System.out.println("Nilai minimum = "+min);
              System.out.println("Nilai maksismum = "+max);
              System.out.println("Nilai rata-ratanya adalah = "+total_rata);
       }
}