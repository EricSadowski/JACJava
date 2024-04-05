import java.util.Arrays;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {

       LinkedList<Integer> ok = new LinkedList<>();
       // MyLinkedList ll = new MyLinkedList();

        MyLinkedGeneric<String> bud = new MyLinkedGeneric<>();
        MyLinkedList ll2;

//        ll.addAtTail(1);
//        ll.addAtTail(2);
//        ll.addAtHead(7);
//        ll.addAtIndex(1,5);
//        ll.addAtIndex(1,5);
//        ll.addAtIndex(1,5);
//        ll.addAtHead(8);
//        ll.addAtTail(4);
//        ll.deleteAtIndex(3);
//        ll.addAtTail(3);
//        ll.addAtTail(3);
//        ll.addAtHead(6);
//        ll.addAtHead(6);
//        ll.deleteDuplicates();
//        ll.printList();

        MyLinkedList link1 = new MyLinkedList();
        MyLinkedList link2 = new MyLinkedList();

        link1.addAtTail(1);
        link1.addAtTail(1);
        link1.addAtTail(1);

        link2.addAtTail(1);
        link2.addAtTail(2);
        link2.addAtTail(3);
        link2.addAtTail(4);
        link2.addAtTail(6);

        ll2 = MyLinkedList.mergeTwoLists(link1, link2);

        ll2.printList();


        bud.addAtHead("ok");
        bud.addAtTail("hi");
        System.out.println(bud.getSize());
        bud.addAtIndex(2,"wow");
        bud.addAtIndex(2,"another");
        System.out.println(bud.getSize());
        System.out.println(bud);
      //  bud.printList();
        bud.deleteByValue("another");
        System.out.println(bud);
       // bud.printList();
        Object[] arr = bud.toArray();
        System.out.println(Arrays.toString(arr));



    }

}