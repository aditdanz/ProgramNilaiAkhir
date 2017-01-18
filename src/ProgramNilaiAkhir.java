import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class ProgramNilaiAkhir {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        double hasilUAS;
        double hasilUTS;
        double nilaiTugas;
        double nilaiAbsen;
        double ratarata;

        System.out.println("================================================== ");
        System.out.println("          *PROGRAM PERHITUNGAN NILAI AKHIR* ");
        System.out.println("                    DI SUSUN OLEH ");
        System.out.println("                     KELOMPOK 3 ");
        System.out.println("================================================== ");
        System.out.println("");
        System.out.println("================================================== ");

        try {
            System.out.println("        Jika Nilai Hasil masih di bawah 75");
            System.out.println("             Berarti anda BELUM TUNTAS");
            System.out.println();

            //Memasukan nilai dari Keyboard
            System.out.print("Masukan hasil UAS Anda                  : ");    //Masukan hasil UAS
            hasilUAS = Integer.parseInt(dataIn.readLine());

            System.out.print("Masukan hasilUTS Anda                   : ");    //Masukan hasilUTS
            hasilUTS = Integer.parseInt(dataIn.readLine());

            System.out.print("Masukan Nilai Tugas Anda                : ");    //Masukan Nilai Tugas
            nilaiTugas = Integer.parseInt(dataIn.readLine());

            System.out.print("Masukan Kehadiran Anda Dari 20 Pertemuan   : ");  //Masukan Nilai Absen
            nilaiAbsen = Integer.parseInt(dataIn.readLine());

            //proses penghitungannya sebagai berikut
            hasilUAS = (+hasilUAS*0.3);
            hasilUTS = (+hasilUTS*0.3);
            nilaiTugas = (+nilaiTugas*0.3);
            nilaiAbsen = ((+nilaiAbsen/0.2)*0.1);
            ratarata = ((hasilUAS + hasilUTS + nilaiTugas + nilaiAbsen));

            System.out.println("================================================");
            System.out.println();

            //menampilkan hasilnya sebagai berikut
            System.out.println("=================== Nilai ======================");
            System.out.println("  hasil UAS      : " + hasilUAS);
            System.out.println("  hasil UTS      : " + hasilUTS);
            System.out.println("  Nilai Tugas      : " + nilaiTugas);
            System.out.println("  Nilai Absen      : " + nilaiAbsen);
            System.out.println();
            System.out.println("================ Di rata-ratakan ===============");
            System.out.println("Nilai Akhir         : " + ratarata);
            System.out.println("================================================");
            System.out.println();
            String msg = "Nilai Akhir Anda : " + ratarata + ".";

            if (ratarata >= 75) {
                System.out.println("        Keterangan    : SELAMAT ANDA LULUS");
                System.out.println("================================================ ");
            } else {
                System.out.println("      Keterangan    : MAAF, ANDA BELUM LULUS");
                System.out.println("================================================ ");
            }
        } catch (IOException e) {
            System.out.println("Isi dengan BENAR");
        }
    }
}
