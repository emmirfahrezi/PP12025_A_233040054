package PERTEMUAN4.tugas;

public class strukturListTest {
    public static void main(String[] args) {
        strukturList list = new strukturList();
        // list.addTail(4.5);
        // list.addMid(3.4, 1);
        // list.addHead(2.1);

        list.addTail(2.1);
        list.addTail(5.5);
        list.addMid(4.5, 2);
        list.addMid(1.1, 2);
        list.addHead(3.4);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}
