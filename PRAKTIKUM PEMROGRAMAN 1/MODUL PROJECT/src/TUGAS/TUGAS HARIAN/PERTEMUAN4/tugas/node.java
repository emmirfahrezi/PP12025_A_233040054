package PERTEMUAN4.tugas;

public class node {
    private double data;
    private node next;

    // Inisialisasi node
    public node(double data) {
        this.data = data;
        this.next = null;
    }

    // Setter dan getter
    public void setNext(node next) {
        this.next = next;
    }

    public node getNext() {
        return this.next;
    }

    public double getData() {
        return this.data;
    }

    public void setData(double data) {
        this.data = data;
    }
}