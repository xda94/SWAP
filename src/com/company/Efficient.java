package com.company;

public class Efficient {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        int SWAP;
        int PAWS;
        int WAPA;

        for (int s = 0; s <= 9; s++) {
            for (int w = 0; w <= 9; w++) {
                for (int a = 0; a <= 9; a++) {
                    for (int p = 0; p <= 9; p++) {
                        SWAP = s * 1000 + w * 100 + a * 10 + p;
                        PAWS = p * 1000 + a * 100 + w * 10 + s;
                        WAPA = w * 1000 + a * 100 + p * 10 + a;
                        if (SWAP + PAWS == WAPA && s > 0 && w > 0 && a > 0 && p > 0 && w * 1000 < 10000) {
                            System.out.println("S= " + s);
                            System.out.println("W= " + w);
                            System.out.println("A= " + a);
                            System.out.println("P= " + p);
                            System.out.println("SWAP = " + SWAP);
                            System.out.println("PAWS = " + PAWS);
                            System.out.println("WAPA = " + WAPA);
                        }
                    }
                }
            }
        }
        long endtime = System.nanoTime();
        long totalTime = endtime - startTime;

        System.out.println(totalTime);
    }
}
