package modul1;
/**
 *
 * @author RISKI CAHYADI
 */
public class Segitiga<T extends Number> {

    private T alas;
    private T tinggi;

    public Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt() {
        int alas = this.alas.intValue();
        int tinggi = this.tinggi.intValue();

        return (alas * tinggi) / 2;
    }

    public double getResultAsDouble() {
        Double alas = this.alas.doubleValue();
        Double tinggi = this.tinggi.doubleValue();

        return (alas * tinggi) / 2;
    }
}
