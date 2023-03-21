import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // membuat ArrayList Hewan
        ArrayList<String> Hewan = new ArrayList<String>();
        Hewan.add("kucing");
        Hewan.add("kuda");
        Hewan.add("sapi");
        Hewan.add("ayam");
        Hewan.add("kucing");
        Hewan.add("kambing");
        System.out.println("Hewan:\n " + Hewan);

        // membuat ArrayList DeleteHewan
        ArrayList<String> DeleteHewan = new ArrayList<String>();
        DeleteHewan.add("kucing");
        DeleteHewan.add("sapi");
        DeleteHewan.add("kelinci");
        System.out.println("\nDeleteHewan:\n " + DeleteHewan);

        // menghapus elemen-elemen dari Hewan yang sama dengan data warna dari DeleteHewan
        for (String warna : DeleteHewan) {
            while (Hewan.contains(warna)) {
                Hewan.remove(warna);
            }
        }

        // menampilkan ArrayList Hewan setelah penghapusan
        System.out.println("\nHewan setelah penghapusan:\n \n" + Hewan);
    }
}
