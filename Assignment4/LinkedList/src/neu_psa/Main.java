package neu_psa;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        Thread t1 = new Thread(new Runnable(){
            public void run(){
                LinkedList list = new LinkedList();
                list.addAtPosition(0,1);
                list.addAtPosition(1,2);
                list.addAtPosition(2,3);
                list.addAtPosition(3,4);
                list.addAtPosition(4,5);
                list.printLinkedList();
                list.removeAtPosition(4);
                list.printLinkedList();
                list.removeAtPosition(4);
                System.out.println(list.size());
                System.out.println(list.getFirst());
                System.out.println(list.getLast());
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                LinkedList list1 = new LinkedList();
                list1.addAtPosition(0,11);
                list1.addAtPosition(1,12);
                list1.addAtPosition(2,13);
                list1.addAtPosition(3,14);
                list1.addAtPosition(4,15);
                list1.printLinkedList();
                list1.removeAtPosition(4);
                list1.printLinkedList();
                list1.removeAtPosition(4);
                System.out.println(list1.size());
                System.out.println(list1.getFirst());
                System.out.println(list1.getLast());
            }
        });
        t2.start();
    }
}
