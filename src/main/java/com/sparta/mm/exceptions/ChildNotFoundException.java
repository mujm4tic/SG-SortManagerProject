package com.sparta.mm.exceptions;

public class ChildNotFoundException extends Exception {

    @Override
    public String getMessage() {
       return "Left or right child node cannot be found in binary tree";
    }
}
