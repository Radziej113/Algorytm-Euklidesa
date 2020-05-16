package com.algorytmeuklidesa;

public class AlgorithmRunner {

    int a;
    int b;

    public int findNWD(int a, int b) {

        while(a % b != 0) {

            int mod = a % b;
            a = b;
            b = mod;
        }

        return b;
    }
}
