
public class LinkedList<T> {
    Node head;
    class Node{
        T data;
        Node next;

        Node(T d){
            data = d;
            next = null;
        }
    }

    public  LinkedList(){

    }
    public void insert(T data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        Node last = head.next;
        temp.append(head.data);
        while (last.next != null){
            temp.append(last.data);
            last = last.next;
        }
        return temp.toString();
    }

}
