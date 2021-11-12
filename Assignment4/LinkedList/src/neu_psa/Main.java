package neu_psa;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        Thread t1 = new Thread(new Runnable(){
            public void run(){
                try {
                    list.addAtPosition(0,1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    list.addAtPosition(0,1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    list.addAtPosition(1,2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    list.addAtPosition(2,3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    list.addAtPosition(3,4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    list.addAtPosition(4,5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.printLinkedList();
                try {
                    list.removeAtPosition(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.printLinkedList();
                try {
                    list.removeAtPosition(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(list.size());
                System.out.println(list.getFirst());
                System.out.println(list.getLast());
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                try {
                    list.addAtPosition(0, 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    list.addAtPosition(0,11);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    list.addAtPosition(1,12);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    list.addAtPosition(2,13);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    list.addAtPosition(3,14);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    list.addAtPosition(4,15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    list.removeAtPosition(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    list.removeAtPosition(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.printLinkedList();
                System.out.println(list.size());
                System.out.println(list.getFirst());
                System.out.println(list.getLast());
            }
        });
        t2.start();
        list.printLinkedList();
    }
}
