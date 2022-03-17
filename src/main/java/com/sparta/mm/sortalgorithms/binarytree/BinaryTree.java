package com.sparta.mm.sortalgorithms.binarytree;

//have the node method separate from the functions within it
// because of the interface requirement. One class should interface all those methods

import com.sparta.mm.sortalgorithms.RandomArray;

public class BinaryTree implements BinaryMethods {

    private final Node rootNode;
    private static int countNodes = 0;
    private static int sortNodeCount = 0;
    private static int[] myArray = RandomArray.generateArrayBinary();
    private static int[] sortedTree;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    //NESTED NODE CLASS
    public class Node {

        private final int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public boolean isLeftChildEmpty() {
            if (leftChild == null) {
                return true;
            } else return false;
        }

        public boolean isRightChildEmpty() {
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
        return 0;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    //NOT NEEEDED BUT FOR THE VISUAL TREE, RIGHT? OTHERWISE NEED TO PUT INTO SORTED ARRAY
    @Override
    public int[] getSortedTreeDesc() {
        sortedTree = new int[countNodes];
        sortNodeCount = 0;
        sortTreeDesc(rootNode);
        return sortedTree;
    }

    private void sortTreeDesc(Node node){
        if (node.isRightChildEmpty() == false){
            sortTreeDesc(node.getRightChild());
        }

        sortedTree[sortNodeCount] = node.getValue();
        sortNodeCount++;

        if (node.isLeftChildEmpty() == false){
            sortTreeDesc(node.getLeftChild());
        }
        sortedTree[sortNodeCount] = node.getValue();
        sortNodeCount++;
    }
}
