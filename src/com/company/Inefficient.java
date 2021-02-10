package com.company;


import java.util.Random;

public class Inefficient {
    //  SWAP
    // +PAWS
    // ------
    //  WAPA

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int S;
        int W;
        int A;
        int P;
        int SWAP;
        int PAWS;
        int WAPA;

        boolean keepGoing = true;

        while(keepGoing){
            Random r1 = new Random();
            String randomNumber1 = String.format("%04d", Integer.valueOf(r1.nextInt(9999)));

            S = Integer.valueOf(randomNumber1.substring(0, randomNumber1.length()-3));
            W = Integer.valueOf(randomNumber1.substring(1, randomNumber1.length()-2));
            A = Integer.valueOf(randomNumber1.substring(2, randomNumber1.length()-1));
            P = Integer.valueOf(randomNumber1.substring(3, randomNumber1.length()));

            SWAP = S*1000 + W*100+ A*10 + P;
            PAWS = P*1000 + A*100 + W*10 + S;

            if(W*1000 >= 10000){
                continue;
            }else{
                WAPA = W*1000 + A*100 + P*10 + A;
            }


            if(SWAP + PAWS == WAPA){
                keepGoing = false;
                System.out.println("S= " + S);
                System.out.println("W= " + W);
                System.out.println("A= " + A);
                System.out.println("P= " + P);
                System.out.println("SWAP = " + SWAP);
                System.out.println("PAWS = " + PAWS);
                System.out.println("WAPA = " + WAPA);
            }
        }
        long endtime = System.nanoTime();
        long totalTime = endtime - startTime;

        System.out.println(totalTime);
    }
}
