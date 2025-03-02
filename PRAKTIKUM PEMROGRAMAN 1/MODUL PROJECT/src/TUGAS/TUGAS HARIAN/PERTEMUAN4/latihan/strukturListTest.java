package PERTEMUAN4.latihan;

public class strukturListTest {
    public static void main(String[] args) {
        strukturList list = new strukturList();
        list.addTail(3);
        list.addTail(4);
        list.addMid(7, 2);
        list.addMid(8, 2);
        list.addHead(5);


        System.out.println("Elemen: ");
        list.displayElement();
    }
}
