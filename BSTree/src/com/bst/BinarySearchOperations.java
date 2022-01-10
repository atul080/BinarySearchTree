/**
 * @author Atul Srivastav
 * @created on 10-01-2022
 * Binary Search Tree Operation Program.
 */
package com.bst;
public class BinarySearchOperations {

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree.");
        //object creation of binary search tree class
        BinarySearchTree tree = new BinarySearchTree();
        //calling insertInBST() method to add values to the binary search tree.
        tree.insertInBST(56);
        tree.insertInBST(30);
        tree.insertInBST(70);
        tree.insertInBST(56);
        tree.insertInBST(30);
        tree.insertInBST(70);
        tree.insertInBST(22);
        tree.insertInBST(40);
        tree.insertInBST(11);
        tree.insertInBST(16);
        tree.insertInBST(3);
        tree.insertInBST(60);
        tree.insertInBST(65);
        tree.insertInBST(63);
        tree.insertInBST(67);
        tree.insertInBST(95);
        //printing the final tree by calling printBST() method
        System.out.print("Binary Search Tree: ");
        tree.printBST();
        //printing BST size
        tree.size();

    }
}
