package com.sparta.mm.sortalgorithms.binarytree;

import com.sparta.mm.display.MyArray;

public class BinaryMain{
    //readjust to tale in array and feed througn the binary tree generator
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(5); //element is chosen root node
        binaryTree.addElement(3);
        binaryTree.addElement(4);
        binaryTree.addElement(7);
        binaryTree.addElement(10);
        System.out.println(binaryTree.findElement(7));
    }
}
