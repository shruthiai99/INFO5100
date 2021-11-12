package neu_psa;

public class LinkedList {
    private int size = 0;
    private Node head;

    synchronized int size(){
        return this.size;
    }
    //Considering 0th index
    public synchronized void addAtPosition(int index, int element){
        if(index > size){
            System.out.println("Cannot inset at this index");
            return;
        }
       if(head == null && index == 0){
           head = new Node(element);
           size++;
           return;
       }
       if(head != null && index == 0){
           Node newNode = new Node(element);
           newNode.next = head;
           head = newNode;
           size++;
           return;
       }
       if(head != null && index > 0){
           int i = 0;
           Node ptr = head;
           while(i < index - 1){
               ptr = ptr.next;
               i++;
           }
           Node newNode = new Node(element);
           newNode.next = ptr.next;
           ptr.next = newNode;
           size++;
           return;
       }
    }

    //Considering 0th index
    public synchronized void removeAtPosition(int index){
        if(index > size - 1){
            System.out.println("Cannot remove at this index");
            return;
        }
        if(head != null && index == 0){
            head = head.next;
            size--;
            return;
        }
        if(head != null && index > 0){
            Node ptr = head;
            int i = 0;
            while(i < index - 1){
                ptr = ptr.next;
                i++;
            }
            ptr.next = ptr.next.next;
            size--;
            return;
        }
    }

    public  synchronized int getFirst(){
        return head.data;
    }

    public synchronized int getLast(){
        if(head == null){
            return -1;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        return ptr.data;
    }

    public synchronized void printLinkedList(){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println();
    }
}
