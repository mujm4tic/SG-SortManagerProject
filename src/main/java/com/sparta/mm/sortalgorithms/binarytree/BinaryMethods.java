package com.sparta.mm.sortalgorithms.binarytree;

import com.sparta.mm.exceptions.ChildNotFoundException;

public interface BinaryMethods {

        int getRootElement();

        int getNumberOfElements();

        void addElement(int element);

        void addElements(final int[] elements);

        boolean findElement(int value);

        int getLeftChild(int element) throws ChildNotFoundException;

        int getRightChild(int element) throws ChildNotFoundException;

        int[] getSortedTreeAsc();

        int[] getSortedTreeDesc();
}

