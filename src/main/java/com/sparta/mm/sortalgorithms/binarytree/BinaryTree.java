package com.sparta.mm.sortalgorithms.binarytree;

//have the node method separate from the functions within it
// because of the interface requirement. One class should interface all those methods

public class BinaryTree{
    private final Node rootNode;

    //have a method to print array so they can choose a root node


    //interface for root node - display array and choose node starting value
    public void chooseRootNode(final int element){
//        rootNode
    }
    public BinaryTree(final int element){
        rootNode = new Node(element); //start point set to zero for rannge -1000 to 1000
    }

    //interface for find node
    public boolean findElement(int value){
        Node node = findNode(value);
        if (node != null){
            return true;
        } else return false;
        //anything user interacting with, using value instead of element
    }

    private Node findNode(int element){
        Node node = rootNode;
        while (node!=null){
            if (element == node.getValue()){
                return node;
            }
        }   if (element < node.getValue()){
            node = node.getLeftChild();
        } else {
            node = node.getRightChild();
        } return null;

    }

    //interface for add node to tree
    public void addElement(final int value){
        addNodeToTree(rootNode, value);
    }

    private void addNodeToTree(Node node, int element){ //want no one to see nodes, just value
        if (element <= node.getValue()){
            if (node.isLeftChildEmpty()){
                Node leftChild = new Node(element);
                node.setLeftChild(leftChild);
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()){
            if (node.isRightChildEmpty()){
                Node rightChild = new Node(element);
                node.setRightChild(rightChild);
            } else{
                addNodeToTree(node.getRightChild(),element);
            }
        }
    }

    //return value not node
}
