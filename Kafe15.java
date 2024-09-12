import java.util.Scanner;

public class Kafe15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti, nominalInt;
        double hargaKopi=12000.0, hargaTeh=7000.0, hargaRoti=20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100f;
        byte totalByte;

        System.out.println("Masukkan keanggotaan (true / false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Memasukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Memasukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Memasukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        totalHarga = (jmlKopi*hargaKopi)+(jmlTeh*hargaTeh)+(jmlRoti*hargaRoti);
        nominalBayar = totalHarga - (diskon*totalHarga);
        nominalInt = (int) nominalBayar;
        totalByte = (byte) totalHarga;
        
        System.out.println("Keanggotaan pelanggan "+ keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + "kopi" + jmlTeh + "Teh" + jmlRoti + "Roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        System.out.println("Nominal bayar Rp " + nominalInt);
        System.out.println(totalByte);


    }
    
}
