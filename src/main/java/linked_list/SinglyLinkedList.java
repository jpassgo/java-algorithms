package linked_list;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {

        this.head = new Node(null);
    }

    public <T> void add(T data) {
        if(this.head.getData() == null) {
            head = new Node(data);
        } else if (this.head.getData() != null) {
            Node current = this.head;
            while(current.getNext().getData() != null) {
                current = current.getNext();
            }

            current.setNext(new Node(data));
        }
    }

    public <T> T get(int index) {
        Node current = this.head;
        for(int i = 0; i <= index; i++) {
            current = current.getNext();
        }
        return (T) current.getData();
    }
}
