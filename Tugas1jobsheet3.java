import java.util.Scanner;

public class Tugas1jobsheet3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargalistrik = 1500;
        double jmlPenggunaan, tagihanlistrik;
        boolean batasPenggunaan;
        System.out.println("Memasukkan jumlah penggunaan: ");
        jmlPenggunaan= input.nextDouble();
        
        batasPenggunaan = jmlPenggunaan > 500;
        tagihanlistrik = (hargalistrik*jmlPenggunaan);
        System.out.println("Jumlah tagihan listrik anda: " + tagihanlistrik); 
        System.out.println("Apakah melebihi 500 kWh: "+ batasPenggunaan);

    }

    
}