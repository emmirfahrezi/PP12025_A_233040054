public class NodeMain {
    public static void main(String[] args) {

        // membuat 2 buah node  n1,n2,n3,n4,n5
        node n1 = new node(5);
        node n2 = new node(7);
        node n3 = new node(9);
        node n4 = new node(5);


        // membuat relasi n
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        

        // menampilknode dengan pointer p
        node p = n1;
        while(p != null){
            System.out.printf("%d",p.getNilai() );
            p = p.getNext();
        }
    }
}
