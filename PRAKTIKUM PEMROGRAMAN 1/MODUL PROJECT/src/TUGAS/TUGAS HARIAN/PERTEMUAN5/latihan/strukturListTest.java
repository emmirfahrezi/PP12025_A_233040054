package PERTEMUAN5.latihan;

public class strukturListTest {
    public static void main(String[] args) {
        strukturList list = new strukturList();
         // lathan 4
         list.addTail(2 );
         list.addTail(6 );
         list.addTail(3 );
         list.addTail(5 );
         list.addTail(1 ) ;
 
         System.out.println("Elemen: ");
         list.displayElement( );
 
         list.removeTail();
         System.out.println("\n");
         list.displayElement();
 
         list.removeHead();
         System.out.println("\n");
         list.displayElement();

         list.removeTail();
         System.out.println("\n");
         list.displayElement();
 
     // Latihan 4 done
        
 //       latihan 2
        
        // list.addHead(2);
        // list.addHead(9);
        // list.addHead(7);

        // System.out.println("Elemen: ");
        // list.displayElement();

        // list.removeHead();
        // System.out.println("\n");
        // list.displayElement();

   //     latihan 2 finish

       

    }
}
