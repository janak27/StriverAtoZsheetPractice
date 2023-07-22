package KunalKushwahaDSA.LinkedList;

import javax.swing.plaf.nimbus.NimbusStyle;

class Implementation{
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.insertAtFirst(3);
//        list.insertAtFirst(4);
//        list.insertAtFirst(5);
//        list.insertAtFirst(6);
//        list.insertAtFirst(7);
//        list.insertAtLast(8);
//        list.insertAtIndex(99,4);
//        list.display();
//        System.out.println(list.deleteAtFirst());
//        list.display();
//        System.out.println(list.deleteAtLast());
//        list.display();
//        System.out.println(list.deleteAtIndex(2));
//        list.display();

//        DoublyLL list = new DoublyLL();
//
//        list.InsertFirstDLL(4);
//        list.InsertFirstDLL(1);
//        list.InsertFirstDLL(2);
//        list.InsertFirstDLL(9);
//        list.InsertFirstDLL(7);
//        list.InsertLastDLL(99);
//        list.InsertAfterDLL(65,2);
//
//        list.displayDLL();
//        list.displayDLLreverse();
//        list.deleteAtNode(9);
//        list.displayDLL();
        CircularLL list = new CircularLL();

        list.InsertValue(5);
        list.InsertValue(2);
        list.InsertValue(1);
        list.InsertValue(7);
        list.InsertValue(8);
        list.displayCLL();
        list.delete(1);
        list.displayCLL();


    }
}
public class LinkedList {
    public Node head;
    public Node tail;
    int size;
    public LinkedList(){
        this.size = 0;
    }
    public void display(){
        Node temp = head;

        while (temp!= null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public Node getNode(int index){
        Node new_node = head;
        for (int i = 0; i < index; i++) {
            new_node = new_node.next;
        }
        return new_node;
    }
    public int deleteAtIndex(int index){
        if (index==0){
            return deleteAtFirst();
        }
        if (index == size - 1){
            return deleteAtLast();
        }
        Node prev = getNode(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }
    public int deleteAtLast(){
        if(size <= 1){
            return deleteAtFirst();
        }
        Node secondLast = getNode(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }
    public int deleteAtFirst(){
        int value = head.value;
        head = head.next;
        if(head==null) tail = null;
        size--;
        return value;
    }
    public void insertAtIndex(int value, int index){
        if(index==0){
            insertAtFirst(value);
            return;
        }

        if(index==size){
            insertAtLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node new_node = new Node(value,temp.next);
        temp.next = new_node;
        size++;
    }
    public void insertAtFirst(int value){
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;

        if (tail == null){
            tail = head;
        }
        size++;
    }
    public void insertAtLast(int value){
        if (tail == null){
            insertAtFirst(value);
            return;
        }
        Node new_node = new Node(value);
        tail.next = new_node;
        tail = new_node;
        size++;

     }
    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next =  next;
        }
    }
}
class DoublyLL{
    Node head;
    public void displayDLL(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.value +" <-> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("end");
    }
    public void displayDLLreverse(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            last = temp;
            temp = temp.next;
        }
        System.out.println("reverse print :");
        while (last != null){
            System.out.print(last.value +" <-> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
    public int deleteAtFirst(){
        int value = head.value;
        head = head.next;
        head.prev = null;
        if (head==null) return 0;
        return value;
    }
    public int deleteAtLast(){
        if (head == null) return 0;
        if (head.next == null) {
            head = null;
            return head.value;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        int value = temp.value;
        temp.prev.next = null;
        return value;
    }
    public int deleteAtNode(int value){
        if(head==null) return deleteAtFirst();
        Node temp = head;
        while (temp!=null){
            if (temp.value == value){
                if (temp.prev != null){
                    temp.prev.next = temp.next;
                }
                else{
                    head = temp.next;
                }
                if (temp.next != null){
                    temp.next.prev = temp.prev;
                }
                return temp.value;
            }
            temp = temp.next;
        }
        return temp.value;
    }
    public void InsertFirstDLL(int value){
        Node new_node = new Node(value);
        new_node.next = head;
        new_node.prev = null;
        if (head!= null){
            head.prev = new_node;
        }
        head = new_node;
    }
    public  void InsertLastDLL(int value){
        Node new_node = new Node(value);
        Node temp = head;
        new_node.next = null;
        if (head == null){
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.prev = temp;
    }
    public void InsertAfterDLL(int value, int after){
        Node p = FindNodeDLL(after);
        if (p==null){
            System.out.println("not exist");
            return;
        }
        Node new_node = new Node(value);
        new_node.next = p.next;
        p.next = new_node;
        new_node.prev = p;
        if (new_node.next != null){
            new_node.next.prev = new_node;
        }

    }
    public Node FindNodeDLL(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node  = node.next;
        }
        return null;
    }
    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

class CircularLL{

    Node head;
    Node tail;

    public CircularLL(){
        this.head = null;
        this.tail = null;
    }
    public void  InsertValue(int value){
        Node new_node = new Node(value);
        if (head==null){
            head = new_node;
            tail= new_node;
            return;
        }

        tail.next = new_node;
        new_node.next = head;
        tail = new_node;
    }
    public  void  displayCLL(){
        Node temp = head;
        if (head != null){
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while ( temp != head);
        }
        System.out.println("end");

    }
    public void delete(int value){
        Node temp = head;
        if (temp == null){
            return;
        }
        if (temp.value == value){
         head = head.next;
         tail.next = head;
         return;
        }

        do {
            Node next_node = temp.next;
            if (next_node.value == value){
                temp.next = next_node.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);
    }
    public  class Node{
        int value;
        Node next;
        public Node(int value){
            this.value  = value;
        }
    }
}





