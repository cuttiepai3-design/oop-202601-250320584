
package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

public class DendaProgresif implements AturanDenda {

    @Override
    public long hitung(Aset aset, int hariTerlambat) {
        if (aset == null) {
            throw new IllegalArgumentException("Aset tidak boleh null");
        }

        if (hariTerlambat < 0) {
            throw new IllegalArgumentException("Hari terlambat tidak boleh negatif");
        }

        if (hariTerlambat == 0) {
            return 0;
        }

        long dendaFlat = aset.hitungDenda(hariTerlambat);

        return dendaFlat + (dendaFlat * hariTerlambat / 30);
    }
}
