package PERTEMUAN4.latihan;

public class strukturList {
    private node HEAD;

    public boolean isEmpty(){
        return HEAD == null;
    }

    public void addTail(int data){
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
        node curNode = HEAD;
        while(curNode != null){
            System.out.printf(curNode.getData()+ "");
            curNode = curNode.getNext();
        }
    }

    public void addHead(int data){
        node newNode = new node(data);
        
        if (isEmpty()){
            HEAD = newNode;
        }
        else{
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    public void addMid(int data, int position) {
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
}
