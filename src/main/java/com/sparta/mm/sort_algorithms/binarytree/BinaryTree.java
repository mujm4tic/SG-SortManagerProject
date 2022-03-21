package com.sparta.mm.sort_algorithms.binarytree;

import com.sparta.mm.display.Choices;
import com.sparta.mm.exceptions.ChildNotFoundException;
import java.util.Arrays;
import static com.sparta.mm.control_logic.RandomArray.getArray;
import static com.sparta.mm.display.DisplayManager.printTimeTaken;

public class BinaryTree implements BinaryMethods {

    public static int[] myArray = getArray();
    private final Node rootNode;
    private static int countNodes = 0;
    private static int sortNodeCount = 0;
    private static int[] sortedTree;

    public BinaryTree() {
        rootNode = new Node(Choices.getRootNode());
        addElements(myArray);
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
    }

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
        sortedTree = new int[getNumberOfElements()];
        sortNodeCount = 0;
        long startAsc = System.nanoTime();
        sortTreeAsc(rootNode);
        System.out.println("My sorted tree in ascending order is: " + Arrays.toString(sortedTree));
        long endAsc = System.nanoTime();
        printTimeTaken(startAsc, endAsc);
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

    @Override
    public int[] getSortedTreeDesc() {
        sortedTree = new int[countNodes];
        sortNodeCount = 0;
        long startDesc = System.nanoTime();
        sortTreeDesc(rootNode);
        System.out.println("My sorted tree in descending order is: " + Arrays.toString(sortedTree));
        long endDesc = System.nanoTime();
        printTimeTaken(startDesc, endDesc);
        return sortedTree;
    }

    private void sortTreeDesc(Node node){
        if (!node.isRightChildEmpty()){
            sortTreeDesc(node.getRightChild());
        }

        sortedTree[sortNodeCount] = node.getValue();
        sortNodeCount++;

        if (!node.isLeftChildEmpty()){
            sortTreeDesc(node.getLeftChild());
        }
    }
}
