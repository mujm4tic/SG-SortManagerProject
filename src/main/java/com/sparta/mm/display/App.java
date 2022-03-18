package com.sparta.mm.display;

import static com.sparta.mm.control_logic.AlgorithmFactory.getSortAlgorithm;
import static com.sparta.mm.display.Choices.getSorter;

public class App {
    public static void main(String[] args) {
        getSortAlgorithm(getSorter());
    }
}
