public class BookList {
    private Node head;
    public Node book;
    public class Node {
        public int id;
        Book book;
        Node next;

        public Node(Book book) {
            this.book = book;
            this.next = null;
        }
    }


    public void addBook(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;

        }
        current.next = newNode;
    }
    public void removeBook(int id){
        if(head == null){
            return;
        }
        if(head.book.id == id){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null && current.next.id != id){
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
        }
    }
    public boolean searchBook(int book){
        Node current = head;
        while(current != null){
            if(current.book.id == current.id){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.book);
            current = current.next;
        }
    }

}
