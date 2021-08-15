### Trees
## Challenge

Challenge 15  Implement Binary Tree class with (pre order, in order and post order) methods, and Binary Search Tree with (add and contains) methods.

 Challenge 16  Create a method to find the Maximum Value in a Binary Tree

## Approach & Efficiency

### Challenge 15

  * Time: O(1)
  * Space: O(n)

### Challenge 16
  * Time: O(1)
  * Space: O(1)

### API
### Challenge 15
### 1. Binary Tree
1. Create a Binary Tree class
2. Define a method for each of the depth first traversals:
* pre order
* in order
* post order which returns an array of the values, ordered appropriately.

Any exceptions or errors that come from your code should be semantic, capture-able errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.

### 2. Binary Search Tree
1. Create a Binary Search Tree class
This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:
* Add
Arguments: value
Return: nothing
Adds a new node with that value in the correct location in the binary search tree.
* Contains
Argument: value
Returns: boolean indicating whether or not the value is in the tree at least once.

### Challenge 16

   **max**   Find the maximum value stored in the tree.

