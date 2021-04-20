package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 6;
        if (x % 2 == 0) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }

        int sum = 0;
        for (int i = 1; i <= 20; ++i) {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}

