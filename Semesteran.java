import java.util.Scanner;

public class Semesteran {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] matkul = {
            "Pemrograman Dasar",
            "Matematika Diskrit",
            "Sistem Operasi",
            "Algoritma dan Struktur Data"
        };

        int[] sks = new int[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] nilaiSetara = new double[matkul.length];

        double totalBobotNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < matkul.length; i++) {
            System.out.println("\nMata Kuliah: " + matkul[i]);

            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            input.nextLine();

            System.out.print("Nilai Huruf: ");
            nilaiHuruf[i] = input.nextLine().trim().toUpperCase();

            if (nilaiHuruf[i].equals("A")) {
                nilaiSetara[i] = 4;
            } else if (nilaiHuruf[i].equals("B+")) {
                nilaiSetara[i] = 3.5;
            } else if (nilaiHuruf[i].equals("B")) {
                nilaiSetara[i] = 3;
            } else if (nilaiHuruf[i].equals("C+")) {
                nilaiSetara[i] = 2.5;
            } else if (nilaiHuruf[i].equals("C")) {
                nilaiSetara[i] = 2;
            } else if (nilaiHuruf[i].equals("D")) {
                nilaiSetara[i] = 1;
            } else {
                nilaiSetara[i] = 0;
            }

            totalBobotNilai += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobotNilai / totalSKS;

        System.out.printf("\nIP Semester: %.2f%n", ip);

        input.close();
    }
}
