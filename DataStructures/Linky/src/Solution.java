//class Solution {
//    public MyLinkedList mergeTwoLists(MyLinkedList list1, MyLinkedList list2) {
//
//        MyLinkedList output = new MyLinkedList();
//        if (list1.head == null) {
//            output = list2;
//        } else if (list2.head == null) {
//            output = list1;
//        }
//
//        Node one = list1.head;
//        Node two = list2.head;
//
//        while (one.next != null && two.next != null) {
//            if (one.data > two.data) {
//                output.addAtTail(one.data);
//                output.addAtTail(two.data);
//            } else {
//                output.addAtTail(two.data);
//                output.addAtTail(one.data);
//            }
//            one = one.next;
//            two = two.next;
//        }
//
//        if (one.next == null) {
//            while (two.next != null) {
//                output.addAtTail(two.data);
//                two = two.next;
//            }
//        } else {
//            while (one.next != null) {
//                output.addAtTail(one.data);
//                one = one.next;
//            }
//        }
//        return output;
//    }
//}