package com.sparta.mm.sortalgorithms.binarytree;

import com.sparta.mm.display.MyArray;

public class BinaryMain{
    BinaryTree tree = new BinaryTree(0); //element is chosen root node
    //readjust to tale in array and feed througn the binary tree generator

    tree.addElement(10);
    tree.addElement(12);
    tree.addElement(13);
    tree.addElement(14);
    tree.addElement(15);
    tree.addElement(16);

    System.out.println(tree.findElement(12));
        }
