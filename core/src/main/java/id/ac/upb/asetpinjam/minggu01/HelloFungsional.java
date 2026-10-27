
package id.ac.upb.asetpinjam.minggu01;

import id.ac.upb.asetpinjam.config.Varian;
import java.util.function.Function;

public final class HelloFungsional {

    private HelloFungsional() {
    }

    public static Function<String, String> pembuatSapaan(String nim) {
        return nama -> "Hello Aset-Pinjam, saya " + nama + " (" + nim + ")";
    }

    public static void main(String[] args) {
        Varian v = Varian.aktif();
        System.out.println(pembuatSapaan(v.nim).apply(v.nama));
    }
}
