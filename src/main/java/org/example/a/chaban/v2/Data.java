package org.example.a.chaban.v2;

import lombok.Getter;
import lombok.Setter;

public class Data {
    private final int SIZE = 30000;

    @Getter @Setter
    private char[] data;

    @Getter @Setter
    private int pointer;
    private StringBuilder outputData;

    public Data() {
        data = new char[SIZE];
        pointer = 0;
        outputData = new StringBuilder();
    }

    public char getCurrentCellValue() {
        return data[pointer];
    }

    public void setCurrentCellValue(char value) {
        data[pointer] = value;
    }

//    public void incrementPointer() {
//        pointer++;
//    }
//
//    public void decrementPointer() {
//        pointer--;
//    }

    public void addToOutput(char c) {
        outputData.append(c);
    }

    public String getOutputData() {
        return outputData.toString();
    }
}
