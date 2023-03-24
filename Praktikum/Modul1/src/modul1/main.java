package modul1;
/**
 *
 * @author RISKI CAHYADI
 */
import java.util.*;


public class main {
    public static void main(String[] args) {
        int a;
        int b;
        double c;
        double d;
        int resultInt;
        double resultDouble;
        Scanner scan = new Scanner(System.in);
        
        try {
            String r = "y";
            while (r.equals("y")) {
                System.out.println("==HITUNG LUAS SEGITIGA==");
                System.out.println("1. Hasil Integer");
                System.out.println("2. Hasil Double");
                System.out.println("Masukkan Pilihan 1/2 : ");
                int pilih = scan.nextInt();
                
                switch (pilih) {
                    case 1 :
                        System.out.println("Masukkan Nilai Alas Dan Tinggi Secara Berurutan");
                        a = scan.nextInt();
                        b = scan.nextInt();
                        Segitiga<Integer> luasTipeInt = new Segitiga<>(a, b);
                        resultInt = luasTipeInt.getResultAsInt();
                        System.out.println("Luas Segitiga Integer : "+resultInt+" cm");
                        break;
                    case 2 :
                        System.out.println("Masukkan Nilai Alas Dan Tinggi Secara Berurutan");
                        c = scan.nextDouble();
                        d = scan.nextDouble();
                        Segitiga<Double> luasTipeDouble = new Segitiga<>(c, d);
                        resultDouble = luasTipeDouble.getResultAsDouble();
                        System.out.println("Luas Segitiga Integer : "+resultDouble+" cm");
                        break;
                    default :
                        System.out.println("Pilihan tidak ada, ketik y untuk mengulang");
                        break;
                }
                
                System.out.println("\nIngin Menghitung Lagi? (y/n)");
                r = scan.next();
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("\nMohon Maaf Data tidak Valid.");
        } finally {
            System.out.println("\nTerima Kasih!");
        }
    }
}
