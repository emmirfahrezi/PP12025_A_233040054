package PERTEMUAN3;

public class ListTes {
    public static void main(String[] args) {
        strukturList list = new strukturList();
        list.addTail(3);
        list.addTail(2);
        list.addTail(1);


        System.out.println("Elemen: ");
        list.displayElement();
    }
}
