

public class node{
    private int nilai;
    private node next;


    // inisialisasi node
    public node(int nilai){
        this.nilai = nilai;
        
    }

    // setter dan getter
    public void setNilai(int nilai){
        this.nilai = nilai;
    }


    public int getNilai(){
        return nilai;
    }

    public void setNext(node next){
        this.next = next;
    }

    public node getNext(){
        return next;
    }


}