import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        CustomStack stacky = new CustomStack();
        stacky.push(1);
        stacky.push(2);
        stacky.push(3);
       System.out.println(stacky.peek());
        System.out.println(stacky.pop());
        stacky.printStack();
        System.out.println(stacky.size());
        System.out.println(stacky.isEmpty());

    }

}