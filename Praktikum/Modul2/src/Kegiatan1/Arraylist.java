package Kegiatan1;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");
        System.out.println("\n==================================================");
        System.out.println("NO.1\n");
        System.out.println("Sebelum di tambah elemen : \n"+ hewan);
        // 1. object kosong
        ArrayList<String> kosong = new ArrayList<>();

        // 2. Menambahkan elemen baru, menghitung jumlah dan menampilkan index
        System.out.println("\n==================================================");
        System.out.println("NO.2\n");
        hewan.add("Badak");
        hewan.add("Bebek");
        System.out.println("Setelah ditambah elemen Badak dan Bebek: \n"+ hewan);
        int jumlahBebek = 0;
        for (int i = 0; i < hewan.size(); i++) {
            kosong.add("");
            if (hewan.get(i).equals("Bebek")) {
                jumlahBebek++;
                System.out.println("Index Bebek: " + i);
            }
            kosong.set(i, hewan.get(i));
        }
        
        System.out.println("Jumlah Bebek: " + jumlahBebek);

        // 3. Menghapus posisi pertama Bebek
        System.out.println("\n==================================================");
        System.out.println("NO.3\n");
        hewan.remove("Bebek");
        System.out.println("Setelah Bebek dihapus: \n" + hewan);

        // 4. Menampilkan dan menghapus elemen pada index 0 dan 2
        System.out.println("\n==================================================");
        System.out.println("NO.4\n");
        System.out.println("Elemen pada index 0: " + hewan.get(0));
        System.out.println("Elemen pada index 2: " + hewan.get(2));
        hewan.remove(0);
        System.out.println("Setelah index 0 dihapus: \n" + hewan);

        // 5. Mengubah index 0 menjadi "Ular" dan menambahkan "Itik" pada index 2
        System.out.println("\n==================================================");
        System.out.println("NO.5\n");
        hewan.set(0, "Ular");
        System.out.println("Cicak di ubah menjadi ular: \n"+hewan);
        hewan.add(2, "Itik");
        System.out.println("Itik ditambahkan pada index 2: \n" + hewan);

        // 6. Menghapus elemen di antara index 1 dan 5
        System.out.println("\n==================================================");
        System.out.println("NO.6\n");
        hewan.subList(2, 5).clear();
        System.out.println("Menghapus index 1 dan 5: \n" + hewan);

        // 7. Menampilkan elemen pertama dan terakhir
        System.out.println("\n==================================================");
        System.out.println("NO.7\n");
        System.out.println("Elemen pertama: " + hewan.get(0));
        System.out.println("Elemen terakhir: " + hewan.get(hewan.size() - 1));
        // System.out.println("ArrayList setelah menampilkan elemen pertama dan terakhir: \n" + hewan);

        // 8. Menampilkan jumlah elemen pada ArrayList
        System.out.println("\n==================================================");
        System.out.println("NO.8\n");
        System.out.println("Jumlah elemen: " + hewan.size());
        // System.out.println("ArrayList setelah menampilkan jumlah elemen: \n" + hewan);

        // 9. Mencari posisi index dari "Badak"
        System.out.println("\n==================================================");
        System.out.println("NO.9\n");
        System.out.println(hewan);
        int indexBadak = hewan.indexOf("Badak");
        System.out.println("Index Badak: " + indexBadak);
        System.out.println("\n==================================================\n");
    }
}
