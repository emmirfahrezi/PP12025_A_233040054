package PERTEMUAN7.latihan;

public class strukturListTest {
    public static void main(String[] args) {
        strukturList list = new strukturList();

        //latihan 2
        // list.addTail(5);
        // list.addTail(4);
        // list.addTail(6);

        // list.displayElement();
        // System.err.println("\n" + list.find(5));


         list.addTail(7);
         list.addTail(6);
         list.addTail(4);
         list.addTail(2);
         list.addTail(3);

         list.displayElement();

         System.out.println("\n" + list.size());
    }
}