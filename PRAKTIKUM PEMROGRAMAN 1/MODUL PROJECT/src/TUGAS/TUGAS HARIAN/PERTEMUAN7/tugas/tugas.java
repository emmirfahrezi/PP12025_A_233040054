package PERTEMUAN7.tugas;

import PERTEMUAN7.latihan.node;
import PERTEMUAN7.latihan.strukturList;
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        strukturList list = new strukturList();

        list.addTail(4);
        list.addTail(3);
        list.addTail(7);
        list.addTail(8);
        list.addTail(1);
        list.addTail(9);

        list.displayElement();
        
        System.out.println("\n");
        list.clear();

        list.displayElement();
    }
}
