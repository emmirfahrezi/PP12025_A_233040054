package PERTEMUAN7.tugas;
import PERTEMUAN7.latihan.Matakuliah;
import PERTEMUAN7.latihan.node;

public class tes1 {

    public static void main(String[] args) {
        tes2_tes3 list = new tes2_tes3();
        // tes 1
        list.addHead(new Matakuliah("IF001", "Dasar  Pmerograman", 4));
        list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
        list.addHead(new Matakuliah("IF003", "Struktur Diskrit", 3));
        list.addHead(new Matakuliah("IF004", "Kontruksi PL Berorientasi Objek", 3));
        list.displayElement();
    }
}
