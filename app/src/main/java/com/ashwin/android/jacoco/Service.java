package com.ashwin.android.jacoco;

public class Service {
    public int add(int a, int b) {
        return a + b;
    }

    public int calculate(String operation, int a, int b) {
        if (operation == null || operation.isEmpty()) {
            return -1;
        }
        if (operation.equals("add")) {
            return a + b;
        }
        if (operation.equals("sub")) {
            return a - b;
        }
        else {
            return 0;
        }
    }
}
