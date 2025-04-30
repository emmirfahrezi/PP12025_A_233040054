package PERTEMUAN7.latihan;

public class ListMkTest {
    public static void main(String[] args) {
        strukturList list = new strukturList();

        // list.addHead(new Matakuliah("IF001", "Pemrograman Dasar", 4));
        // list.addHead(new Matakuliah("IF002", "Pemrograman web", 3));
        // list.displayElement();

        // tes 1
        list.addHead(new Matakuliah("IF001", "Dasar  Pmerograman", 4));
        list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
        list.addHead(new Matakuliah("IF003", "Struktur Diskrit", 3));
        list.addHead(new Matakuliah("IF004", "Kontruksi PL Berorientasi Objek", 3));
        list.displayElement();
    }
}
