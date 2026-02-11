import java.util.Scanner;

public class array2d {

     static void inputJadwal(String[][] jadwal, int n, Scanner input) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }

    static int[] hitungLebarKolom(String[][] jadwal, int n) {
        int[] lebar = {15, 10, 8, 12};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                if (jadwal[i][j].length() + 2 > lebar[j]) {
                    lebar[j] = jadwal[i][j].length() + 2;
                }
            }
        }
        return lebar;
    }

    static void garis(int panjang) {
        for (int i = 0; i < panjang; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void tampilSemua(String[][] jadwal, int n) {
        int[] lebar = hitungLebarKolom(jadwal, n);

        int totalLebar = lebar[0] + lebar[1] + lebar[2] + lebar[3] + 13;
        garis(totalLebar);

        System.out.printf("| %-" + lebar[0] + "s | %-" + lebar[1] + "s | %-" +
                          lebar[2] + "s | %-" + lebar[3] + "s |\n",
                          "Mata Kuliah", "Ruang", "Hari", "Jam");

        garis(totalLebar);

        for (int i = 0; i < n; i++) {
            System.out.printf("| %-" + lebar[0] + "s | %-" + lebar[1] + "s | %-" +
                              lebar[2] + "s | %-" + lebar[3] + "s |\n",
                              jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }

        garis(totalLebar);
    }

    static void tampilHari(String[][] jadwal, int n, String hari) {
        System.out.println("\nJadwal Hari " + hari + ":");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " + jadwal[i][1] + " | " + jadwal[i][3]);
            }
        }
    }

    static void tampilMatkul(String[][] jadwal, int n, String matkul) {
        System.out.println("\nJadwal Mata Kuliah " + matkul + ":");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println(jadwal[i][1] + " | " + jadwal[i][2] + " | " + jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah jadwal kuliah: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n, input);
        tampilSemua(jadwal, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = input.nextLine();
        tampilHari(jadwal, n, hari);

        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String matkul = input.nextLine();
        tampilMatkul(jadwal, n, matkul);

        input.close();
    }
}