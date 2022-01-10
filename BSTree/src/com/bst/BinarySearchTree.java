/**
 * @author Atul Srivastav
 * @created on 10-01-2022
 * Binary Search Tree Program to INSERT and PRINT BST.
 */
package com.bst;
public class BinarySearchTree<T extends Comparable> {
    //variable declaration
    private BinarySearchNode root;


    /**
     * insertInBST() generic method to insert data at root position.
     * @param data value.
     * calls insertInBST method.
     */
    public <T> void insertInBST(T data) {
        root = insertInBST(root, data);
    }

    /**
     * Recursively call insert data in root
     * traverse tree till root is null
     * compare value with root data and call left or right based on comparison
     * if value is small than root then inserts left else right
     */
    private <T> BinarySearchNode insertInBST(BinarySearchNode BSNode, T data) {

        /**
         * Creates new node if it's null
         */
        if (BSNode == null) {
            return new BinarySearchNode((Comparable) data);
        }

        /**
         * checks if new data is less than root
         * if data is less than the root,
         * insert data to left
         */
        if (BSNode.data.compareTo(data)>0) {
            BSNode.left = insertInBST(BSNode.left, data);
        }

        /**
         * checks if new data is greater than root
         * if data is more than the root,
         * insert data to right
         **/
        if (BSNode.data.compareTo(data)<0) {
            BSNode.right = insertInBST(BSNode.right, data);
        }
        return BSNode;
    }

    /**
     * print() method to print the complete BST.
     */
    public void printBST() {
        print(root);
    }

    /**
     * prints tree using inorder traversal
     * traverse till root is not null
     * recursive call left subtree
     * print root
     * recursive call right subtree
     */
    private void print(BinarySearchNode root) {
        if (root != null) {
            //recursive call left tree
            print(root.left);
            //print value
            System.out.print(root.data + " ");
            //recursive call right
            print(root.right);
        }
    }

}