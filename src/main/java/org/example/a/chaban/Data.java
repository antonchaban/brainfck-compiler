package org.example.a.chaban;

import lombok.Getter;
import lombok.Setter;

public class Data {
    private final int SIZE = 65_535;

    @Getter @Setter
    private char[] data;

    @Getter @Setter
    private int pointer;

    @Getter
    private String outputData;

    public Data() {
        this.data = new char[SIZE];
        this.pointer = 0;
        this.outputData = "";
    }

    public void addOutputData(char data) {
        outputData += data;
    }
}
