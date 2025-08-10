public class BorrowRequest {
    int userId;
    int bookId;
    long requestTime;
    }

    class Node {
        public final BorrowRequest request;
        int userId;
        Node next;

        public Node(BorrowRequest request) {
            this.request = request;
        }
    }


