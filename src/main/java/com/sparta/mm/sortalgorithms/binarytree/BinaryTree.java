package com.sparta.mm.sortalgorithms.binarytree;

//have the node method separate from the functions within it
// because of the interface requirement. One class should interface all those methods

public class BinaryTree implements BinaryMethods {

    private final Node rootNode;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    @Override
    public int getRootElement() {
        return 0;
    }

    //logic -- choose root element


    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public void addElement(int element) {
        
    }

    @Override
    public void addElements(int[] elements) {
        for (int number : elements){
            addNodeToTree(rootNode, number);
        }
    }

    //logic
    private void addNodeToTree(Node node, int element) {
        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
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

    //logic
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

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }


}
