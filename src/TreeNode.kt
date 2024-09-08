import kotlin.random.Random

data class TreeNode<T>(val value: T, var left: TreeNode<T>? = null, var right: TreeNode<T>? = null)

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


