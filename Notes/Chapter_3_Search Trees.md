Chapter 3: Search Trees
- Trees
- Binary trees
- Binary search
- Binary search trees
- Balanced search trees
- AVL trees
- Multiway search trees
- Red-black trees
- Splay trees
- B-trees
- Search trees in Java

<br>

Tree data structure is a specialized data structure to store data in hierarchical manner

1. Root: In a tree data structure, the first node is called as Root Node. 
2. Edge: In a tree data structure, the connecting link between any two nodes is called as EDGE. 
3. Parent: In a tree data structure, the node which is a predecessor of any node is called as PARENT NODE.
4. Child: In a tree data structure, the node which is descendant of any node is called as CHILD Node.
5. Siblings: In a tree data structure, nodes which belong to same Parent are called as SIBLINGS. 
6. Leaf: In a tree data structure, the node which does not have a child is called as LEAF Node.
7. Internal Nodes: In a tree data structure, the node which has atleast one child is called as INTERNAL Node.
8. Level: In a tree data structure, the root node is said to be at Level 0 and the children of root node are at Level 1
9. Path: In a tree data structure, the sequence of Nodes and Edges from one node to another node is called as PATH between that two Nodes. Length of a Path is total number of nodes in that path.

### Binary Tree -  each node can have almost 2 childern
1. The maximum number of nodes at level ‘l’ of a binary tree is 2<sup>l</sup>
2. The Maximum number of nodes in a binary tree of height ‘h’ is 2<sup >h+1</sup> – 1
3. In a Binary Tree with N nodes, the minimum possible height or the minimum number of levels is Log<sub>2</sub>(N+1)

#### Full binary tree
full binary tree, every node except the leaves has exactly two children

#### Complete binary tree
complete binary tree, every level of the tree is completely filled except for the last level, which can be partially filled(as left as possible)

#### Perfect binary tree