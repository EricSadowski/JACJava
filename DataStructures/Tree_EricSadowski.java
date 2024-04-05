
import java.util.ArrayList;
import java.util.List;

public class Tree {
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Node=" + value;
        }

    }

    private Node root;

    public void insert(int value){
        // where to insert this node
        Node node = new Node(value);

        //checking the root
        if(root == null){
            root = node;
            return;
        }
        // I insert another node

        var current = root;
        while (true){
            if(value < current.value){
                if(current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
            else{
                if(current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }

        // navigating in the tree to find the correct place
    }

    public boolean find(int value){
        var current = root;
        while(current != null){
            if(value < current.value){
                current = current.leftChild;
            }
            else if(value > current.value){
                current = current.rightChild;
            }
            else return true;
        }
        return false;
    }

    public void traversPreOrder(){
        traversPreOrder(root);
    }

    private void traversPreOrder(Node root) {
        // exit condition
        if(root == null){
            return;
        }
        //in the preorder => Root, Left, Right
        // print the value of the root
        System.out.println(root.value);

       // values.add(root.value);
        traversPreOrder(root.leftChild);
        traversPreOrder(root.rightChild);
    }


    public void traverseInOrder(){
        traversInOrder(root);
    }
    private void traversInOrder(Node root) {
        // exit condition
        if(root == null){
            return;
        }
        //in the preorder => Left, Root, Right.
        // print the value of the root
        traversInOrder(root.leftChild);
        System.out.println(root.value);

        traversInOrder(root.rightChild);
    }

    private void traversInOrder(Node node, List<Node> arr) {
        if(node == null) return;

        traversInOrder(node.leftChild, arr);
        arr.add(node);
        traversInOrder(node.rightChild, arr);
    }

    private void traversInOrderLeaves(Node node, List<Node> arr) {
        if(node == null) return;

        traversInOrder(node.leftChild, arr);

        if(node.leftChild == null && node.rightChild == null){
            arr.add(node);
        }

        traversInOrder(node.rightChild, arr);
    }

    public void traversPostOrder(){
        traversPostOrder(root);
    }
    private void traversPostOrder(Node root) {
        // exit condition
        if(root == null){
            return;
        }
        //in the preorder => Left, Right, Root.
        // print the value of the root
        traversInOrder(root.leftChild);
        traversInOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height(){
        //recursive

        return height(root);
    }

    private int height(Node node){
        if(root == null){
            return -1;
        }

        if(isLeaf(node)){
            return 0;
        }
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    private boolean isLeaf(Node node){
        return node.leftChild == null && node.rightChild == null;
    }

    public int min(){
        Node current = root;

        while (current.leftChild != null) {
            current = current.leftChild;
        }
        return current.value;
    }

    public boolean isBinarySearchTree(){
        List<Node> arr = new ArrayList<>();
        traversInOrder(root, arr);

        int i = 1;
        while(i < arr.size()) {
            if(arr.get(i-1).value >= arr.get(i).value) return false;
            i++;
        }

        return true;
    }

    public int size(){
        List<Node> arr = new ArrayList<>();
        traversInOrder(root, arr);

        return arr.size();
    }


//    public int countLeaves(){
//        int val = 0;
//        countLeaves(root);
//    }

//    public int countLeaves(Node root){
//
//        if(root == null){
//
//        }
//        traversInOrder(root.leftChild);
//        traversInOrder(root.rightChild);
//
//    }

//    List<Node> arr = new ArrayList<>();
//    traversInOrderLeaves(root, arr);
//
//        return arr.size();
}
