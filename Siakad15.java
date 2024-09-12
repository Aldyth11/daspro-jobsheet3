import java.util.Scanner;

public class Siakad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        Byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        System.out.print("Masukkan nama: ");
        nama=sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim=sc.nextLine();
        System.out.print("Masukkkan kelas: ");
        kelas=sc.nextLine().charAt(0);
        System.out.print("Masukkan nomer absen: ");
        absen=sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis=sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas=sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUjian=sc.nextDouble();
        System.out.print("Masukkan nilai akhir: ");
        nilaiAkhir=sc.nextDouble();

        nilaiAkhir=(nilaiKuis+ nilaiTugas + nilaiUjian) / 3; 
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absem: "+ absen);
        System.out.println("Nilai AKhir:" + nilaiAkhir);

    }
    
}