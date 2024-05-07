package org.example.a.chaban.v2;

public class Main {
    public static void main(String[] args) {
        String input = "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.";
        BrainfuckExecutor executor = new BrainfuckExecutor(input);
        String output = executor.execute();
        System.out.println(output);
    }
}
