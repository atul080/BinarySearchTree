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
        //printing the final tree by calling printBST() method
        System.out.print("Binary Search Tree: ");
        tree.printBST();

    }
}
