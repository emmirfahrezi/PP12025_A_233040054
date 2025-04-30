package PERTEMUAN7.tugas;
import PERTEMUAN7.latihan.Matakuliah;
import PERTEMUAN7.latihan.node;

public class tes4 {
    public static void main(String[] args) {
        tes2_tes3 list = new tes2_tes3();

        // tes 4
        list.addTail(new Matakuliah("IF004", "Kontruksi PL Berorientasi Objek", 3));
        list.addTail(new Matakuliah("IF002", "Pmerograman Web", 3));
        list.addMid(new Matakuliah("IF001", "Dasar Pemrograman", 4), 3);
        list.addMid(new Matakuliah("IF003", "Struktur Diskrit", 3), 2);
        list.displayElement();
        System.out.println("\n");
    }
}
