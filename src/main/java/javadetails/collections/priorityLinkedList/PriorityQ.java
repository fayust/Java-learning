package javadetails.collections.priorityLinkedList;

public class PriorityQ {
    private LinkList list;
    public PriorityQ() {
        list = new LinkList();
    }
    public void insert(int x) {
        list.insert(x);
    }
    public void remove() {
        list.remove();
    }
    public void displayList() {
        System.out.println("Largest Value to Smallest"); list.display();
    }
}
