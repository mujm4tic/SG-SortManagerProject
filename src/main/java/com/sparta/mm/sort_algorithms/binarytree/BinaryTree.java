package com.sparta.mm.sort_algorithms.binarytree;

import com.sparta.mm.display.Choices;
import com.sparta.mm.exceptions.ChildNotFoundException;
import com.sparta.mm.control_logic.RandomArray;

import static com.sparta.mm.control_logic.RandomArray.getArray;

//ONLY NEED ADD ELEMENT + GET ELEMENT

public class BinaryTree implements BinaryMethods {

    private final Node rootNode;
    private static int countNodes = 0;
    private static int sortNodeCount = 0;
    private static int[] myArray = getArray();
    private static int[] sortedTree;

    public BinaryTree() {
        rootNode = new Node(Choices.getRootNode());
        addElements(myArray);
        System.out.println();
    }

    //NESTED NODE CLASS
    private static class Node {

        private final int value;
        private static Node leftChild;
        private static Node rightChild;

        private Node(int value) {
            this.value = value;
        }

        private int getValue() {
            return value;
        }

        private static Node getLeftChild() {
            return leftChild;
        }

        private void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        private static Node getRightChild() {
            return rightChild;
        }

        private void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        private boolean isLeftChildEmpty() {
            if (leftChild == null) {
                return true;
            } else return false;
        }

        private boolean isRightChildEmpty() {
            if (rightChild == null) {
                return true;
            } else return false;
        }
    }


    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }


    @Override
    public int getNumberOfElements() {
        return countNodes;
    } //needs to happen after the addNode is called sequentially

    @Override
    public void addElement(int element) {
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        for (int number : elements) {
            addNodeToTree(rootNode, number);
        }
    }

    private void addNodeToTree(Node node, int element) {
        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
                countNodes++;
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
                countNodes++;
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    @Override
    public boolean findElement(final int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        return false;
    }

    private Node findNode(int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        return Node.getLeftChild().getValue();
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        return Node.getRightChild().getValue();
    }

    @Override
    public int[] getSortedTreeAsc() {
        sortedTree = new int[countNodes];
        sortNodeCount = 0;
        sortTreeAsc(rootNode);
        return sortedTree;
    }

    private void sortTreeAsc(Node node){
        if (node.isLeftChildEmpty() == false){
            sortTreeAsc(node.getLeftChild());
        }
        sortedTree[sortNodeCount] = node.getValue();
        sortNodeCount++;

        if(node.isRightChildEmpty() == false){
            sortTreeAsc(node.getRightChild());
        }
    }

    //ACSENDING AND DESCENDING NEED TESTING
    @Override
    public int[] getSortedTreeDesc() {
        sortedTree = new int[countNodes];
        sortNodeCount = 0;
        sortTreeDesc(rootNode);
        return sortedTree;
    }

    //ASCENDING AND DESCENDING NEED TESTING
    private void sortTreeDesc(Node node){
        if (node.isRightChildEmpty() == false){
            sortTreeDesc(node.getRightChild());
        }

        sortedTree[sortNodeCount] = node.getValue();
        sortNodeCount++;

        if (node.isLeftChildEmpty() == false){
            sortTreeDesc(node.getLeftChild());
        }
    }
}
