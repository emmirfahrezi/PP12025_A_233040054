package PERTEMUAN7.latihan;

public class strukturList {
    private node HEAD;

    public boolean isEmpty(){
        return HEAD == null;
    }

    public void addTail(Matakuliah data){
        node posNode = null, currNode = null;
        
        node newNode = new node(data);
        if (isEmpty()){
            HEAD = newNode;
        }

        else{
            currNode = HEAD;
            while (currNode != null){
                posNode = currNode;
                currNode = currNode.getNext();
            }
            posNode.setNext(newNode);
        }
        
    }

    public void displayElement(){
        if (isEmpty()){
            System.out.println("List Kosong");
        }
        else{
            node curNode = HEAD;
            while(curNode != null){
                System.out.printf("Matakuliah: "+curNode.getData().getKode()+ ", " + curNode.getData().getNama() + ", " + curNode.getData().getSks() + "\n");
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }

    public void addHead(Matakuliah data){
        node newNode = new node(data);
        
        if (isEmpty()){
            HEAD = newNode;
        }
        else{
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    public void addMid(Matakuliah data, int position) {
        node newNode = new node(data);
        node curNode = HEAD;
        node posNode = null;
        int i = 1;

        if (HEAD == null) {
            HEAD = newNode;
            return;
        }
        else{
            curNode = HEAD;
            if (position == 1) {
                newNode.setNext(HEAD);
                HEAD = newNode;
                return;
            }
        }

        while ( curNode != null && i < position - 1) {
            posNode = curNode;
            curNode = curNode.getNext();
            i++;
        }

        newNode.setNext(curNode.getNext());
        curNode.setNext(newNode);
    }

    public void dispose(node temp) {
        temp = null;
    }

   public void removeHead() {
    if (isEmpty()) {
        System.out.println("List kosong");
    }
    else {
        node temp = HEAD;
        HEAD = HEAD.getNext();
        dispose(temp);
        } 
    }

    public void removeTail() {
        if (HEAD != null) {
            
            if (HEAD.getNext() == null) {
                node temp = HEAD;
                HEAD = null;
                dispose(temp);
            } else {
                node preNode = null;
                node lastNode = HEAD;
    
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }

                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }
    
}
