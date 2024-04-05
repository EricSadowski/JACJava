import java.util.ArrayList;

class MyLinkedList {


    private class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public MyLinkedList() {
        this.head = null;
    }
    public int get(int index) {
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index){
                return current.data;}
            count++;
            current = current.next;
        }

        /* if we get to this line, the requested element exceed the size of the LinkedList */
        return -1;
    }
    public void addAtHead(int val) {

        Node newNode = new Node(val);

        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = newNode;
            return;
        }else {

            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = newNode;
            return;
        }

        // If not, traverse to the last node and link the new node
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }






    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);

        // Handle edge case when index = 0
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        // we need the node which is before the target position
        // start counting from 1 as we already handled the case for index 0
        for (int count = 1; count < index; count++) {
            // If you've walked off the end of the list, just append the newNode at the end
            if (current.next == null) {
                current.next = newNode;
                return;
            }
            current = current.next;
        }

        // At this point, current is the node just before the target position
        Node afterCurrent = current.next;
        current.next = newNode;
        newNode.next = afterCurrent;
    }

    public void deleteAtIndex(int index) {
        // If the list is empty or index is negative, do nothing.
        if (head == null || index < 0) {
            return;
        }

        // Special case to remove head node
        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            // If we get to the end of the list before reaching the
            // target index, it means the index is invalid (out of range).
            if (current.next == null) {
                return;
            }
            current = current.next;
        }

        // At this point, `current` is the node _before_ the target node.
        // We check if there is a node to delete before attempting deletion.
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void deleteDuplicates() {

        ArrayList<Integer> dupes = new ArrayList<Integer>();
        Node currentNode = this.head;
        while (currentNode.next != null){
            dupes.add(currentNode.data);
            if(currentNode.next.next == null){
                if(dupes.contains(currentNode.next.data)){
                    currentNode.next = null;
                }
                return;
            }
            if(dupes.contains(currentNode.next.data)){
                currentNode.next = currentNode.next.next;
                continue;
            }
               currentNode = currentNode.next;
        }

    }

    public static MyLinkedList mergeTwoLists(MyLinkedList list1, MyLinkedList list2) {

        MyLinkedList output = new MyLinkedList();
        if (list1.head == null) {
            output = list2;
        } else if (list2.head == null) {
            output = list1;
        }

        Node one = list1.head;
        Node two = list2.head;

        while (one.next != null && two.next != null) {
            if (one.data > two.data) {
                output.addAtTail(one.data);
                output.addAtTail(two.data);
            } else {
                output.addAtTail(two.data);
                output.addAtTail(one.data);
            }
            one = one.next;
            two = two.next;
        }

        if (one.next == null && two.next == null){
            if (one.data > two.data) {
                output.addAtTail(one.data);
                output.addAtTail(two.data);
            } else {
                output.addAtTail(two.data);
                output.addAtTail(one.data);
            }
            return output;
        }

        if (one.next == null) {
            if (one.data > two.data) {
                output.addAtTail(one.data);
                output.addAtTail(two.data);
            } else {
                output.addAtTail(two.data);
                output.addAtTail(one.data);
            }
           // two = two.next;
            while (two.next != null) {
                output.addAtTail(two.data);
                two = two.next;
            }
            output.addAtTail(two.data);
        } else {
            if (one.data > two.data) {
                output.addAtTail(one.data);
                output.addAtTail(two.data);
            } else {
                output.addAtTail(two.data);
                output.addAtTail(one.data);
            }
           // one = one.next;
            while (one.next != null) {
                output.addAtTail(one.data);
                one = one.next;
            }
            output.addAtTail(one.data);
        }
        return output;
    }

    public void printList() {
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println("");
    }

}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */