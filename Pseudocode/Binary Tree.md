1. Node definition:

```
class Node:
    data  // integer value of the node
    left  // reference to the left child node
    right  // reference to the right child node

// Constructor to initialize the node with a value
    Node(val):
        data = val
        left = null
        right = null
```
2. Define a BinaryTree class with various operations

```
class BinaryTree:

    // Function to insert a new node into the binary tree
    function insert(root, data):
        if root is null:
            root = new Node(data)
            return root
        // Initialize a queue for level order traversal
        queue = new Queue()
        queue.offer(root)

         while queue is not empty:
            temp = queue.poll()

            if temp.left is null:
                temp.left = new Node(data)
                break
            else:
                queue.offer(temp.left)

            if temp.right is null:
                temp.right = new Node(data)
                break
            else:
                queue.offer(temp.right)

        return root

        // Function to delete the deepest node in the binary tree
    function deleteDeepest(root, d_node):
        queue = new Queue()
        queue.offer(root)

        while queue is not empty:
            temp = queue.poll()

            if temp is d_node:
                temp = null
                d_node = null
                return

            if temp.right is not null:
                if temp.right is d_node:
                    temp.right = null
                    d_node = null
                    return
                else:
                    queue.offer(temp.right)

            if temp.left is not null:
                if temp.left is d_node:
                    temp.left = null
                    d_node = null
                    return
                else:
                    queue.offer(temp.left)

    // Function to delete a node with a specific key
    function deletion(root, key):
        if root is null:
            return null

        if root.left is null and root.right is null:
            if root.data == key:
                return null
            else:
                return root

        queue = new Queue()
        queue.offer(root)
        temp = new Node(0)
        key_node = null

        while queue is not empty:
            temp = queue.poll()

            if temp.data == key:
                key_node = temp

            if temp.left is not null:
                queue.offer(temp.left)

            if temp.right is not null:
                queue.offer(temp.right)

        if key_node is not null:
            key_node.data = temp.data
            deleteDeepest(root, temp)

        return root

    // Function for inorder tree traversal (Left - Root - Right)
    function inorderTraversal(root):
        if root is null:
            return
        inorderTraversal(root.left)
        print(root.data + " ")
        inorderTraversal(root.right)

    // Function for preorder tree traversal (Root - Left - Right)
    function preorderTraversal(root):
        if root is null:
            return
        print(root.data + " ")
        preorderTraversal(root.left)
        preorderTraversal(root.right)

    // Function for postorder tree traversal (Left - Right - Root)
    function postorderTraversal(root):
        if root is null:
            return
        postorderTraversal(root.left)
        postorderTraversal(root.right)
        print(root.data + " ")

    // Function for level order tree traversal
    function levelorderTraversal(root):
        if root is null:
            return

        queue = new Queue()
        queue.offer(root)

        while queue is not empty:
            temp = queue.poll()
            print(temp.data + " ")

            if temp.left is not null:
                queue.offer(temp.left)

            if temp.right is not null:
                queue.offer(temp.right)

    // Main function to demonstrate the operations
    function main():
        root = null

        // Insert nodes into the binary tree
        root = insert(root, 10)
        root = insert(root, 20)
        root = insert(root, 30)
        root = insert(root, 40)

        // Perform and display various tree traversals
        print("Preorder traversal: ")
        preorderTraversal(root)

        print("\nInorder traversal: ")
        inorderTraversal(root)

        print("\nPostorder traversal: ")
        postorderTraversal(root)

        print("\nLevel order traversal: ")
        levelorderTraversal(root)

        // Delete a node with data = 20
        root = deletion(root, 20)

        print("\nInorder traversal after deletion: ")
        inorderTraversal(root)


```