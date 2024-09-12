import java.util.Scanner;

public class Tugas2jobsheet3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlJam, upah;
        double gaji, bonus = 0.10, pajak = 0.05, totalBonus;

        System.out.println("Masukkan jumlah jam kerja: ");
        jmlJam = input.nextInt();
        System.out.println("Masukkan jumlah upah: ");
        upah = input.nextInt();

        totalBonus= (jmlJam *upah *bonus) + jmlJam *upah;
        gaji = totalBonus - (totalBonus * pajak);


        System.out.println("Gaji yang diterima: " + gaji);
       
        
        


    }
    
}
