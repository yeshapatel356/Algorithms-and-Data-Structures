package Tree;
import java.util.LinkedList;
import java.util.Queue;


 
class Node{
    int data;
    Node left, right;

    public Node(int value){
        data = value;
        left = right = null;
        
    }
}

public class BinaryTree {
   //insert function
    public static Node insert(Node root, int data){
       //if tree is empty, new node becomes the root
        if(root==null){
            root = new Node(data);
            return root;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            // Insert node as the left child of the parent node
            if (temp.left == null) {
                temp.left = new Node(data);
                break;
            }
            // If the left child is not null push it to the
            // queue
            else
                q.offer(temp.left);
            // Insert node as the right child of parent node
            if (temp.right == null) {
                temp.right = new Node(data);
                break;
            }
            // If the right child is not null push it to the
            // queue
            else
                q.offer(temp.right);
            }

        return root;
    }

    public static void main(String args[]){
        Node root = null;


    }
}
