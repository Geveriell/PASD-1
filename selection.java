import java.util.Scanner;

public class selection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[] KODE = {'A','B','D','E','F','H','L','N','T','Z'};

        String[] KOTA = {
            "Banten",
            "Jakarta",
            "Bandung",
            "Cirebon",
            "Bogor",
            "Semarang",
            "Surabaya",
            "Malang",
            "Tegal",
            "Tasikmalaya"
        };

        System.out.print("Masukkan kode plat: ");
        char cari = input.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == cari) {
                System.out.println("Kota: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan");
        }

        input.close();
    }
}
