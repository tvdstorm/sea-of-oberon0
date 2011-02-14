package com.douwekasemier.oberon0.test;

import java.io.File;

import com.douwekasemier.oberon0.interpreter.Interpreter;

public class QuicksortJava {

    private int[] input;
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        new QuicksortJava();
    }

    public QuicksortJava() {
        input = new int[5];
        input[0] = 5;
        input[1] = 1;
        input[2] = 4;
        input[3] = 2;
        input[4] = 3;
        quicksort(input, 0, 4);
        print();
    }

    public void quicksort(int[] a, int lo, int hi) {
        System.out.println();
        System.out.println("CALL quicksort: lo["+lo+"] hi["+hi+"]");
        System.out.println();
        print();
        int i = lo;
        int j = hi;
        int h;
        int x = a[(lo + hi) / 2];

        do {
            while (a[i] < x)
                i++;
            while (a[j] > x)
                j--;
            if (i <= j) {
                h = a[i];
                a[i] = a[j];
                a[j] = h;
                i++;
                j--;
            }
        } while (i <= j);

        // recursion
        if (lo < j)
            quicksort(a, lo, j);
        if (i < hi)
            quicksort(a, i, hi);
    }
    
    public void print() {
        for( int i = 0; i < 5; i++ ) {
            System.out.print(input[i]);
            System.out.print(" - ");
        }
        System.out.println();
    }

}
