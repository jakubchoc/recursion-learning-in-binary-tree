
# Binary Tree and Non-Binary Tree Implementation in Kotlin

## Overview
This project demonstrates the implementation of **binary trees** and **non-binary trees** using recursion in Kotlin. It covers the essential operations such as inserting elements into the trees and searching for specific elements within them.

### Key Concepts Covered:
- **Binary Tree**: A tree data structure in which each node has at most two children, referred to as the left child and the right child.
- **Non-Binary Tree**: A tree with no strict structural rules on the number of children, where nodes are randomly assigned either to the left or the right.
- **Recursion**: Recursive functions are used for inserting nodes and searching through the trees.

## Functionality

### 1. **TreeNode Class**
This class represents the structure of each node in both the binary and non-binary trees. It holds a value of generic type `T` and pointers to its left and right child nodes.

\`\`\`kotlin
data class TreeNode<T>(val value: T, var left: TreeNode<T>? = null, var right: TreeNode<T>? = null)
\`\`\`

### 2. **Binary Tree Insertion (`fillBinaryTree`)**
The \`fillBinaryTree\` function is responsible for inserting values into a binary tree. It follows the rule that for any node, values smaller than the current node's value are inserted to the left, while larger values are inserted to the right.

\`\`\`kotlin
fun <T : Comparable<T>> fillBinaryTree(root: TreeNode<T>?, value: T): TreeNode<T> {
    if (root == null) {
        return TreeNode(value)
    }
    if (value < root.value) {
        root.left = fillBinaryTree(root.left, value)
    } else {
        root.right = fillBinaryTree(root.right, value)
    }
    return root
}
\`\`\`

### 3. **Non-Binary Tree Insertion (`fillNonBinaryTree`)**
The \`fillNonBinaryTree\` function inserts values into a non-binary tree without any specific order. It uses randomness to decide whether the new value will be inserted to the left or right of the current node.

\`\`\`kotlin
fun <T> fillNonBinaryTree(root: TreeNode<T>?, value: T): TreeNode<T> {
    if (root == null) {
        return TreeNode(value)
    }
    val result = Random.nextBoolean()
    if (result) {
        root.left = fillNonBinaryTree(root.left, value)
    } else {
        root.right = fillNonBinaryTree(root.right, value)
    }
    return root
}
\`\`\`

### 4. **Searching in a Binary Tree (`findNumberInBinaryTree`)**
This function recursively searches for a number in a binary tree. It compares the target value with the current node and decides whether to move left or right based on whether the value is smaller or larger.

\`\`\`kotlin
fun <T: Comparable<T>> findNumberInBinaryTree(root: TreeNode<T>?, number: T) {
    if (root == null) {
        println("Number not found")
        return
    }
    if (root.value == number) {
        println("Found number")
        return
    }

    if (root.value < number) {
        findNumberInBinaryTree(root.right, number)
    } else {
        findNumberInBinaryTree(root.left, number)
    }
}
\`\`\`

### 5. **Searching in a Non-Binary Tree**
Similarly, the code provides a search function for the non-binary tree, though the search logic is less optimized due to the lack of a specific ordering in the tree structure.

\`\`\`kotlin
fun <T: Comparable<T>> findStringInNonBinaryTree(root: TreeNode<T>?, number: T) {
    // Similar to binary tree search but adapted to non-binary structure.
}
\`\`\`

## How to Run

To run this program:
1. Clone the repository to your local machine.
2. Open the project in your favorite Kotlin-compatible IDE.
3. Execute the \`main()\` function which:
    - Builds a binary tree with a list of integers.
    - Builds a non-binary tree with a list of random words.
    - Searches for a specific value in the binary tree.
    - You can modify the lists or the search queries to test different cases.

## Lessons Learned
- **Tree data structures**: Practiced creating, managing, and searching through both binary and non-binary trees.
- **Recursion**: Understood how recursive functions can traverse tree structures efficiently.
- **Randomness**: Integrated random decision-making into the insertion of values into a non-binary tree.

## Future Improvements
- Add more tree operations such as deletion and traversal (in-order, pre-order, post-order).
- Optimize the search function for non-binary trees.
- Add error handling and edge case management.
