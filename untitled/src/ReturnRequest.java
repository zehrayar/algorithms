class ReturnRequest {

    private class Node {
        int bookId;
        Node link;
    }

    Node top;

    ReturnRequest() {
        this.top = null;
    }

    public void push(int bookId) {
        Node temp = new Node();
        if (temp == null) {
            System.out.println("The shelf is full!");
            return;
        }
        temp.bookId = bookId;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.bookId;
        } else {
            System.out.println("The shelf is empty!");
            return -1;
        }
    } public void pop(){
        if(top == null){
            System.out.println("The return stack is already empty");
            return;
        }
        top = top.link;
    } public void printStack(){
        if(top == null){
            System.out.println("The return stack is empty");
            System.exit(1);
        }
        else{
            Node temp = top;
            while(temp != null){
                System.out.println(temp.bookId);
                temp = temp.link;
                if(temp != null){
                    System.out.println(" -> ");
                }
            }
        }
    }
}

