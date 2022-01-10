/**
 * @author Atul Srivastav
 * @created on 10-01-2022
 * Binary Search Tree Program to INSERT and PRINT BST.
 */
package com.bst;
public class BinarySearchTree<T extends Comparable> {
    //variable declaration
    private BinarySearchNode root;
    private int size=0;



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
    private <T> BinarySearchNode insertInBST(BinarySearchNode BSTNode, T data) {

        /**
         * Creates new node if it's null
         */
        if (BSTNode == null) {
            size++;
            return new BinarySearchNode((Comparable) data);
        }

        /**
         * checks if new data is less than root
         * if data is less than the root,
         * insert data to left
         */
        if (BSTNode.data.compareTo(data)>0) {
            BSTNode.left = insertInBST(BSTNode.left, data);
        }

        /**
         * checks if new data is greater than root
         * if data is more than the root,
         * insert data to right
         **/
        if (BSTNode.data.compareTo(data)<0) {
            BSTNode.right = insertInBST(BSTNode.right, data);
        }
        return BSTNode;
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
    /**
     * size() method to print the size of binary search tree.
     */
    public void size() {
        System.out.print("\nSize of binary search tree is: " + size);
    }
    public <T> void search(T value) {
        search(root, value);
        //prints value not found if program doesn't exits in search(root,value) method
        System.out.println("\nValue not found");
    }


    /** //@param BinarySearchNode and value
     * if input value is found then prints the value and exits the program.
     * does recursive traversing to find the value.
     *
     */
    public  <T> void search(BinarySearchNode root, T value) {
        if (root == null) {
            System.out.println("\nTree is blank.");
        } else if (root.data.compareTo(value) == 0) {
            System.out.println("\nValue found");
            System.exit(0);
        } else if (root.data.compareTo(value) < 0) {
            search(root.right, value);
        } else {
            search(root.left, value);
        }
    }
}