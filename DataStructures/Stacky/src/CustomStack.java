public class CustomStack {
    //create your own stack by using array of Integer

    private Integer[] stack = new Integer[1];
    private int size = 0;


    public void push(Integer value){
        ensureSpaceForNewElement();
        stack[size] = value;
        size++;
    }

    //returns the top of stack and removes it
    public Integer pop(){
        if(size == 0){
            return null;
        }else{

        Integer popVal = stack[size-1];
        stack[size] = null;
        size--;
        return popVal;}
    }

    //only returns top of stack
    public Integer peek(){
    return stack[size-1];
    }

    public int size(){
    return size;
    }

    public boolean isEmpty(){
    if(size == 0){
        return true;
    }else{
        return false;
    }
    }

    private void ensureSpaceForNewElement() {
        if(size == stack.length){
            Integer[] newData = new Integer[stack.length * 2];
            for(int i=0; i< stack.length; i++){
                newData[i] = stack[i];
            }
            stack =newData;
        }
    }

    public void printStack(){
        //show the elements of stack
        //[1, 2, 3]
        if (size == 0){
            System.out.println("[]");
        }else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < size; i++){
                if(i+1 == size){
                    sb.append(stack[i] + "]");
                }else{
                    sb.append(stack[i] + ", ");}
            }
            System.out.println(sb.toString());
        }
    }

//    public String toString(){
//
//        if (size == 0){
//            return "[]";
//        }else {
//            StringBuilder sb = new StringBuilder();
//            sb.append("[");
//            for (int i = 0; i < size; i++){
//                if(i+1 == size){
//                    sb.append(data[i] + "]");
//                }else{
//                    sb.append(data[i] + ", ");}
//            }
//            return sb.toString();
//        }
//    }
}
