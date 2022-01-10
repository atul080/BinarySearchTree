/**
 * @author Atul Srivastav
 * @created on 10-01-2022
 * Binary Search Tree Node Creation Program.
 */
package com.bst;

public class BinarySearchNode<T extends Comparable> {
    //variable declaration
    public T data;
    public BinarySearchNode left;
    public BinarySearchNode right;
    //constructor
    BinarySearchNode(T data){
        this.data=data;
        left=null;
        right=null;
    }
}