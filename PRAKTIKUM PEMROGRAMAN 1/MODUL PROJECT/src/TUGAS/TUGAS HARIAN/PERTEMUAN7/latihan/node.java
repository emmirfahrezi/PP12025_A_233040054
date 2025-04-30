package PERTEMUAN7.latihan;

public class node {
    private Matakuliah data;
    private node next;


    // inisiasi node
    public node(Matakuliah data){
        this.data = data;
    }

    // setter dan getter
    public void setNext(node next){
        this.next = next;
    }

    public node getNext(){
        return this.next;
    }

    public Matakuliah getData(){
        return this.data;
    }

    public void setData(Matakuliah data){
        this.data = data;
    }

    public String getKode(){
        return this.data.getKode();
    }

    public String getNama(){
        return this.data.getNama();
    }

    public int getSks(){
        return this.data.getSks();
    }

    public void setKode(String kode){
        this.data.setKode(kode);
    }

    public void setNama(String nama){
        this.data.setNama(nama);
    }

    public void setSks(int sks){
        this.data.setSks(sks);
    }

    public Matakuliah getNilai(){
        return this.data;
    }

    public void setNilai(Matakuliah data){
        this.data = data;
    }


}
