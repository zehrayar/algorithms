public class BorrowQueue {
    Node front, rear;
    int count;

    BorrowQueue() {
        front = rear = null;
        count = 0;
    }

    void enqueue(BorrowRequest request) {
        Node newNode = new Node(request);
        if (rear == null) {
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
    }

    void dequeue(BorrowRequest request) {
        if (front == null) {
            System.out.println("BorrowQueue is empty");
        }
        else{
            front = front.next;

        }
        count--;

    }


}