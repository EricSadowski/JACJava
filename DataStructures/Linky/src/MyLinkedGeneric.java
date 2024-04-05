public class MyLinkedGeneric<E> {

    private class Node {
        E data;
        Node next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    private int size = 0;
    public MyLinkedGeneric() {
        this.head = null;
        this.tail = null;
    }
    public E get(int index) {

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
//        //if index = 0 -> the node at the front
        if(index == 0){
            return head.data;
        }
//        //if index = size - 1 -> node at the end
        if(index == size - 1){
            return tail.data;
        }



        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index){
                return (E) current.data;}
            count++;
            current = current.next;
        }

        throw new RuntimeException("No data available");
        /* if we get to this line, the requested element exceed the size of the LinkedList */
    }

    public int getSize(){
        return size;
    }


    public void addAtHead(E val) {

        Node newNode = new Node(val);

        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addAtTail(E val) {
        Node newNode = new Node(val);

        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            tail = newNode;
            head = newNode;
            size++;
            return;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size ++;

        // If not, traverse to the last node and link the new node
//        Node lastNode = head;
//        while (lastNode.next != null) {
//            lastNode = lastNode.next;
//        }
//
//        lastNode.next = newNode;
    }

    public void add(E val, Place place){
        if (place.equals(Place.FIRST)){
            this.addAtHead(val);
        }
        else{
            this.addAtTail(val);
        }
    }


    public void addAtIndex(int index, E val) {
        Node newNode = new Node(val);

        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }


        // Handle edge case when index = 0
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            size ++;
            return;
        }

        if(index==size){
            this.addAtTail(val);
            return;
        }


        Node current = head;

        // we need the node which is before the target position
        // start counting from 1 as we already handled the case for index 0
        for (int count = 1; count < index; count++) {
            // If you've walked off the end of the list, just append the newNode at the end
            // An alternative to throwing an error.. similar to add at tail a way of catching the last index as well
//            if (current.next == null) {
//                current.next = newNode;
//                tail = newNode;
//                size ++;
//                return;
//            }
            current = current.next;
        }

        // At this point, current is the node just before the target position
        // First you make a new pointer and assign it to the node after the current one
        Node afterCurrent = current.next;
        // Then you assign the current nodes next value to the new node
        current.next = newNode;
        // then you connect the new node to the one after it.
        newNode.next = afterCurrent;
        size ++;
    }

    public void deleteAtIndex(int index) {
        // If the list is empty or index is negative, do nothing.
        if (head == null || index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // Special case to remove head node
        if (index == 0) {
            head = head.next;
            tail = tail.next;
            size --;
            return;
        }


        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            // If we get to the end of the list before reaching the
            // target index, it means the index is invalid (out of range).
            if (current.next == null) {
                throw new IndexOutOfBoundsException();
            }
            current = current.next;
        }

        // At this point, `current` is the node before the target node.
        // We check if there is a node to delete before attempting deletion.
        // If it's deleting the last node it just points to null (next.next)
        if (current.next != null) {
            current.next = current.next.next;
            size --;
        }
    }

    public boolean deleteByValue(E val){
        Node curContainer = head;
        int counter = 0;

        while(curContainer != null){
            if(curContainer.data.equals(val)){
                deleteAtIndex(counter);
                 return true;
            }
            curContainer = curContainer.next;
            counter ++;
        }
         return false;
    }

    public E[] toArray(){
        E[] resultArray = (E[]) new Object[size];
        Node curContainer = head;
        int position =0;
        while (curContainer != null){
            resultArray[position ++] = curContainer.data;
            curContainer = curContainer.next;
        }

        return resultArray;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();

        Node curContainer = head;

        builder.append("[");
        while (curContainer != null){
            builder.append(curContainer == head ? "" : ",");
            builder.append(curContainer.data);
            curContainer = curContainer.next;
        }
        builder.append("]");

        return builder.toString();
    }



//    public void printList() {
//        Node currentNode = this.head;
//        while (currentNode != null) {
//            System.out.print(currentNode.data + " ");
//            currentNode = currentNode.next;
//        }
//        System.out.println("");
//    }




}
