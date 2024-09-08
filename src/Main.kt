fun main() {
    var numberRoot: TreeNode<Int>? = null
    var wordRoot: TreeNode<String>? = null

    val numbers = listOf(1, 5, 3, 8, 2)
    for (value in numbers) {
        numberRoot = fillBinaryTree(numberRoot, value)
    }

    val randomWords = listOf(
        "Serendipity",
        "Quixotic",
        "Euphoria",
        "Luminous",
        "Ephemeral",
        "Petrichor",
        "Mellifluous",
        "Labyrinth",
        "Effervescent",
        "Nostalgia"
    )
    for (value in randomWords) {
        wordRoot = fillNonBinaryTree(wordRoot, value)
    }

    findNumberInBinaryTree(numberRoot, 4)
}

fun<T: Comparable<T>> findNumberInBinaryTree(root: TreeNode<T>?, number: T) {
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

fun<T: Comparable<T>> findStringInNonBinaryTree(root: TreeNode<T>?, number: T) {
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