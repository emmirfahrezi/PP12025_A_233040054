package PERTEMUAN3;

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
}


