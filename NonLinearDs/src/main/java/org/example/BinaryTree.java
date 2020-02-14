package org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class BinaryTree {
    Node root;
    private LinkedList<Node> nodesInOrder = new LinkedList<Node>();

    public BinaryTree(int rootValue){
        Node node = new Node(rootValue);
        this.root = node;
    }

    public void add(int value){
        addNode(this.root, value);
    }

    public void traverse(){
        inOrderTraverse(this.root);
    }

    public void addNode(Node root, int value){
        if(root.value < value){
            //go to left
            if(root.left != null){
                addNode(root.left, value);
            }
            else {
                Node node = new Node(value);
                root.left = node;
            }
        }
        else{
            //go to right
            if(root.right != null){
                addNode(root.right, value);
            }
            else{
                Node node = new Node(value);
                root.right = node;
            }
        }
    }

    public void arrangeNodes(Node root){
        // Base case
        if (root == null){
            return;
        }

        arrangeNodes(root.left);
        nodesInOrder.add(root);
        arrangeNodes(root.right);
    }

    public void balanceTree(){
        arrangeNodes(this.root);
        Iterator<Node> it  = nodesInOrder.iterator();
        while(it.hasNext()){
            System.out.println(it.next().value);
        }
    }

    public void inOrderTraverse(Node root){
        if (root == null)
            return;

        /* first recur on left child */
        inOrderTraverse(root.left);

        /* then print the data of node */
        System.out.println(root.value + " ");

        /* now recur on right child */
        inOrderTraverse(root.right);
    }

    public class Node{
        Node left = null;
        Node right = null;
        int value;

        public Node(int value){
            this.value = value;
        }
    }
}
