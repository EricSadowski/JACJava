// Your task is to complete the implementation of the class below.

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

// You are not allowed to use complex data structures such as ArrayList, HashMap, etc.
// You are also not allowed to use Collections and Arrays *classes*.
// You are allowed to use arrays, of course.
// When in doubt - it is your responsibility ask the teacher DURING the midterm, not after.
// WARNING: Your solution will be uploaded to a plagiarism-checking system.
// Only submit your own original work.

public class PriorityStack<T> {

    private class Container<T> {

        T value;
        boolean hasPriority;
        Container<T> nextBelow;

        //Container<T> nextAbove;

//        @Override
//        public String toString() {
//            return "Container [value=" + value + ", hasPriority=" + hasPriority + ", nextBelow=" + nextBelow + "]";
//        }
    }

    private Container<T> top; // top of the stack element

   // private Container[] stack = new Container[1];

    private int size = 0;

    public void push(T value) {
        Container<T> wow = new Container<>();
        wow.value = value;

        if(size == 0){
            top = wow;
            size++;
        }else{
            wow.nextBelow = top;
            top = wow;
            size++;
        }

    }

    public void push(T value, boolean hasPriority) {

        Container<T> wow = new Container<>();
        wow.value = value;
        if(hasPriority){
            wow.hasPriority = true;
        }

        if(size == 0){
            top = wow;
            size++;
        }else{
            wow.nextBelow = top;
            top = wow;
            size++;
        }


    }

    public T pop() {
        // remove and return the top item
        // if no item found (size == 0) then throw NoSuchElementException

        if(size == 0){
            return null;
        }else{
            T val = top.value;

            top = top.nextBelow;
            size--;
            return val;

        }

    }

    public T popPriority() {
        // find item with priority starting from the top, remove it and return it
        // if no priority item found then remove and return the top item
        // if stack is empty then throw NoSuchElementException
        if(size == 0){
            return null;}
        else{
            int counter = size;
            Container<T> prev = new Container<>();
            Container<T> curr = new Container<>();
            curr = top;
            while(counter != 0){
                if(top.hasPriority){
                    T val = top.value;
                    pop();
                    return val;
                }
                if(curr.hasPriority){
                    T val = curr.value;
                    prev.nextBelow = curr.nextBelow;
                    size--;
                    return val;
                }
                prev = curr;
                curr = curr.nextBelow;
                counter--;
            }
            T val = top.value;
            top = top.nextBelow;
            size--;
            return val;

        }

    }

    public int hasValue(T value) {
        // returns -1 if value is not on the stack
        // this code only looks for the *first* occurence of the value, starting from top
        // WARNING: you must call value.equals(item.value) to determine whether
        // two values are equal, just like you would do for a String
        // returning value 0 means the value is on top of the stack,
        // 1 means 1 below the top, and so on...
        if(size == 0){
            return -1;}
        else{
            Container<T> curr = new Container<>();
            curr = top;
            int counter = size;
            while(curr != null){
                if(curr.value.equals(value)){
                   // T val = top.value;
                   // top = top.nextBelow;
                    System.out.println(size-counter);
                    return size-counter;
                }
                curr = curr.nextBelow;
                counter--;
            }

            return -1;

        }
    }

    public T removeValue(T value) {
        // removes the first item from top containing the value and returns the value
        // if item with value is not found throw NoSuchElementException
        if(size == 0){
            return null;}
        else{
            int counter = size;
            Container<T> prev = new Container<>();
            Container<T> curr = new Container<>();
            curr = top;
            if(top.value.equals(value)){
                T val = top.value;
                pop();
                return val;
            }
            while(counter != 0){
                if(curr.value.equals(value)){
                    T val = curr.value;
                    prev.nextBelow = curr.nextBelow;
                    size--;
                    return val;
                }
                prev = curr;
                curr = curr.nextBelow;
                counter--;
            }

            return null;

        }

    }

    public int getSize() {
        return size;
    }

    public String reorderByPriority() {
        // reorder items (re-create a new stack, if you like)
        // where all priority items are on top and non-priority items are below them
        // Note: order within the priority items group and non-priority items group must remain the same
        // Suggestion: instead of reordering the existing stack items
        // it may be easier to re-create a new stack with items in the order you need

        int priorities = 0;
        int counter = size;
        Container<T> another = null;

        if (size == 1) {
            if (top.hasPriority) {
                return null;
            }
        }
        Container<T> curr = new Container<>();
        curr = top;
        while (counter != 0) {
            if (curr.hasPriority) {
                priorities++;
            }
            counter--;
            curr = curr.nextBelow;
        }

        StringBuilder sb = new StringBuilder();

        if (priorities != 0) {
            while (priorities != 0) {
                T val = popPriority();   // pop a value from original stack
                priorities--;

                // create a new Container and assign the value
                Container<T> newContainer = new Container<>();
                newContainer.value = val;
                newContainer.hasPriority = true;

                // push the new item into 'another' stack
                newContainer.nextBelow = another;
                another = newContainer;

                // append to the string
                if (sb.length() > 0)  {
                    sb.append("\n");
                }
                sb.append(val.toString());
            }

            Container<T> current = new Container<>();
            current = another;
            while(current != null){
                push(current.value, true);
                current = current.nextBelow;
            }


            return sb.toString();
        } else {
            return null;
        }
    }



//            Container<T> current =  new Container<>();
//            while(priorities != 0){
//                current.value = popPriority();
//                another.nextBelow = current;
//                current = another;
//                priorities--;
//            }



//                while (priorities != 0){
//
//        if(current == null){
//            Container<T> wow = new Container<>();
//            wow.value = popPriority();
//            another.nextBelow = wow;
//            current = wow;
//            priorities--;
//        }else{
//            Container<T> wow = new Container<>();
//            wow.value = popPriority();
//            current.nextBelow = wow;
//            current = wow;
//            priorities--;}
//    }
    @Override
    public String toString() {
        // return string describing the contents of the stack, starting from the top
        // Use value.toString() to conver values kept in the stack to strings.
        // Format exactly like this (assuming T is a string to keep it simple):
        // "[Jerry:N,Terry:N,Martha:P,Tom:P,Jimmy:N]"
        // N means item has no priority, P means item has priority
        // For full marks you must use StringBuilder, no + (string concatenation) allowed.
        StringBuilder sb = new StringBuilder();
        if(size == 0){
            return "[]";}
        else{
            int counter = size;
            Container<T> curr = new Container<>();
            curr = top;

            sb.append("[");
            while(counter != 0){
                if(counter == 1){
                    String checkP = "N";
                    if(curr.hasPriority){
                        checkP = "P";
                    }
                    sb.append(curr.value + ":" + checkP + "]");
                }
                else{
                    String checkP = "N";
                    if(curr.hasPriority){
                        checkP = "P";
                    }
                    sb.append(curr.value + ":" + checkP + ",");}
                curr = curr.nextBelow;
                counter--;
            }
        }
        return sb.toString();

    }



}
//
//    private T[] reversed;
//    private int reversedCount;
//
//    private void putReverseItem(Container<T> item) {
//
//    }
//
//    public T[] toArrayReversed(Class<T> type) { // Note: this is "the twist"
//        // return array with items on the stack
//        // WARNING: element 0 of the array must be the BOTTOM of the stack
//        // NOTE: To obtain full marks for this method you must use recursion.
//        // Collect items on your way back, just before returning.
//        // This case is similar to when constructors of parent classes are called (Programming II course).
//
//    }

    // NOTE: you are only allowed to add private methods and private fields (if needed)
