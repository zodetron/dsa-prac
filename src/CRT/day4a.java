package CRT;

public class day4a {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void insertNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;
    }

    void insertAt(int location, int data){


    }

    public static void main(String[] args) {
        day4a list = new day4a();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);

        list.display();

        list.insertNode(70);
        list.display();

        list.insertAt(3,130);
        list.display();
    }
}