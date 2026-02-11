import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tugas, kuis, uts, uas;
        double nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextInt();

        System.out.print("Masukkan Nilai Kuis  : ");
        kuis = input.nextInt();

        System.out.print("Masukkan Nilai UTS   : ");
        uts = input.nextInt();

        System.out.print("Masukkan Nilai UAS   : ");
        uas = input.nextInt();

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("\nnilai tidak valid");

        } else {

            
            nilaiAkhir = (0.2 * tugas) +
                         (0.2 * kuis) +
                         (0.3 * uts) +
                         (0.3 * uas);

                         
            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir < 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("\nNilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);

            if (nilaiHuruf.equals("A") ||
                nilaiHuruf.equals("B+") ||
                nilaiHuruf.equals("B") ||
                nilaiHuruf.equals("C+") ||
                nilaiHuruf.equals("C")) {

                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        }

        input.close();
    }
}
