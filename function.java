import java.util.Scanner;

public class function {

    static int[][] stok = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int[] harga = {75000, 50000, 60000, 10000};
    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    static int hitungPendapatan(int[] terjual) {
        int total = 0;
        for (int i = 0; i < terjual.length; i++) {
            total += terjual[i] * harga[i];
        }
        return total;
    }

    static void tampilkanStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            System.out.println("Status: Sangat Baik");
        } else {
            System.out.println("Status: Perlu Evaluasi");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < stok.length; i++) {
            System.out.println("RoyalGarden " + (i + 1));

            int[] terjual = new int[stok[i].length];

            for (int j = 0; j < stok[i].length; j++) {
                System.out.print("Jumlah " + namaBunga[j] + " terjual: ");
                terjual[j] = input.nextInt();
            }

            int pendapatan = hitungPendapatan(terjual);
            System.out.println("Pendapatan: Rp" + pendapatan);
            tampilkanStatus(pendapatan);
            System.out.println();
        }

        input.close();
    }
}
