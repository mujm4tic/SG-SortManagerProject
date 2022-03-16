package com.sparta.mm.sortalgorithms.binarytree;

public class BinaryMain{
    BinaryTree tree = new BinaryTree(10);
    //readjust to tale in array and feed througn the binary tree generator

    tree.addElement(11);
    tree.addElement(12);
    tree.addElement(13);
    tree.addElement(14);
    tree.addElement(15);
    tree.addElement(16);

    System.out.println(tree.findElement(12));
        }
