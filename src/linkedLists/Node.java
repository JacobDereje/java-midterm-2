package linkedLists;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        Node head = new Node(4);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(10);
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

    }



    static int countNodes(Node head) {
        int counter = 1;
        Node current = head;
        while (current.next != null){
            current = current.next;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        countNodes();
    }

}
